package demo.Service;

        import ch.qos.logback.core.net.SyslogOutputStream;
        import demo.Model.Jugador;
        import demo.Repository.JugadorRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;
        import org.springframework.transaction.annotation.Transactional;

        import java.util.*;

@Service
@Transactional

public class JugadorService {


    @Autowired
    private JugadorRepository jugadorRepository;


    public void registrarJugadores() {
        Calendar calendar = GregorianCalendar.getInstance();

        Jugador jugador1 = new Jugador();
        jugador1.setNombre("Remy");
        calendar.set(1996, Calendar.JULY, 17);
        jugador1.setNacimiento(calendar.getTime());
        jugador1.setCanastas(5);
        jugador1.setAsistencias(10);
        jugador1.setRebotes(5);
        jugador1.setPosicion("base");
        jugadorRepository.save(jugador1);

        Jugador jugador2 = new Jugador();
        jugador2.setNombre("Sergio");
        calendar.set(1995, Calendar.MAY, 12);
        jugador2.setNacimiento(calendar.getTime());
        jugador2.setCanastas(8);
        jugador2.setAsistencias(11);
        jugador2.setRebotes(2);
        jugador2.setPosicion("escolta");
        jugadorRepository.save(jugador2);

        Jugador jugador3 = new Jugador();
        jugador3.setNombre("Jon");
        calendar.set(1995, Calendar.AUGUST, 22);
        jugador3.setNacimiento(calendar.getTime());
        jugador3.setCanastas(5);
        jugador3.setAsistencias(10);
        jugador3.setRebotes(8);
        jugador3.setPosicion("alero");
        jugadorRepository.save(jugador3);

        Jugador jugador4 = new Jugador();
        jugador4.setNombre("Ivan");
        calendar.set(1995, Calendar.FEBRUARY, 14);
        jugador4.setNacimiento(calendar.getTime());
        jugador4.setCanastas(14);
        jugador4.setAsistencias(12);
        jugador4.setRebotes(3);
        jugador4.setPosicion("ala-pivot");
        jugadorRepository.save(jugador4);

        Jugador jugador5 = new Jugador();
        jugador5.setNombre("Alex");
        calendar.set(1995, Calendar.APRIL, 11);
        jugador5.setNacimiento(calendar.getTime());
        jugador5.setCanastas(3);
        jugador5.setAsistencias(10);
        jugador5.setRebotes(2);
        jugador5.setPosicion("pivot");
        jugadorRepository.save(jugador5);

        // A

        System.out.println(jugadorRepository.findByNombreStartingWith("Iv"));

        // B

        System.out.println(jugadorRepository.findByCanastasGreaterThanEqual(8));

        // C

        System.out.println(jugadorRepository.findByAsistenciasBetween(2, 15));

        // D

        System.out.println(jugadorRepository.findByPosicionLike("base"));

        // E

        calendar.set(1993, Calendar.APRIL, 18);
        System.out.println(jugadorRepository.findByNacimientoAfter(calendar.getTime()));

        // F

        calendar.set(1993, Calendar.APRIL, 18);
        System.out.println(jugadorRepository.findByCanastasGreaterThanEqualAndNacimientoAfter(8, calendar.getTime()));


    }
}
