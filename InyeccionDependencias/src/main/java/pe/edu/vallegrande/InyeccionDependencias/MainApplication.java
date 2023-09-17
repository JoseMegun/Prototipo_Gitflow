package pe.edu.vallegrande.InyeccionDependencias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

    private final MensajeService mensajeService;

    
    public MainApplication(MensajeService mensajeService) {
        this.mensajeService = mensajeService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    public void run(String... args) {
        String mensaje = mensajeService.obtenerMensaje();
        System.out.println(mensaje);
    }
}


