package demo.Repository;


import demo.Model.Jugador;

import java.util.*;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface JugadorRepository extends PagingAndSortingRepository<Jugador, Long>{
    public List<Jugador> findByNombreStartingWith (String nombreJugador);
    public List<Jugador> findByCanastasGreaterThanEqual (int numCanastas);
    public List<Jugador> findByAsistenciasBetween (int minAsistencias, int maxAsistencias);
    public List<Jugador> findByPosicionLike (String posicion);
    public List<Jugador> findByNacimientoAfter (Date nacimiento);
    public List<Jugador> findByCanastasGreaterThanEqualAndNacimientoAfter (int canastas, Date nacimiento);

}
