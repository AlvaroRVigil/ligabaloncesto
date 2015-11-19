package demo;

import demo.Repository.JugadorRepository;
import demo.Service.JugadorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    private static JugadorService jugadorService;
    public static void main(String[] args) {
        ConfigurableApplicationContext context =  SpringApplication.run(DemoApplication.class, args);
        jugadorService = context.getBean(JugadorService.class);
        jugadorService.registrarJugadores();
    }

}
