package ejercicio3;

public class Main {
    public static void main(String[] args) {
        Mensajero mensajeCorreo = new Mensajero("Hola como estas?");
        mensajeCorreo.enviarMensaje();
        Mensajero mensajeSms = new MensajeSms("Hola buenas tardes");
        mensajeSms.enviarMensaje();
    }
}
