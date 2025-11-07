package ejercicio3;

import java.util.Scanner;

public class Mensajero {
    private String mensaje;
    public Mensajero(String mensaje){
        this.mensaje = mensaje;
        validacion();
    }
    private void validacion(){
        if (mensaje == null){
            throw new IllegalArgumentException("No puede ser Null");
        }
    }
    public String getMensaje() {
        return mensaje;
    }
    public void setMensaje(String mensaje) {
        if (mensaje.equals(this.mensaje) || mensaje == null) {
            throw new IllegalArgumentException("Dato ingresado invalido.");
        }
        this.mensaje = mensaje;
    }
    protected void enviarMensaje(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el correo del destinatario: ");
        var destinatario = scanner.next();
        System.out.println("Mensaje enviado al siguiente correo: " + destinatario);
        System.out.println("Mensaje Enviado: " + getMensaje());
    }
}