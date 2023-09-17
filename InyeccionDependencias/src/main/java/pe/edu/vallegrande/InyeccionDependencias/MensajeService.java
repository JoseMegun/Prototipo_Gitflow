package pe.edu.vallegrande.InyeccionDependencias;

import org.springframework.stereotype.Service;

@Service
public class MensajeService {
    public String obtenerMensaje() {
        return "¡Hola, este es un mensaje programado!";
    }
}