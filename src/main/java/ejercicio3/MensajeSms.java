package ejercicio3;

import java.util.Scanner;

public class MensajeSms extends Mensajero{
    public MensajeSms(String mensaje){
        super(mensaje);
    }
    @Override
    protected void enviarMensaje() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero del destinatario: ");
        var destinatario = scanner.next();
        System.out.println("Mensaje enviado al siguiente numero: " + destinatario);
        System.out.println("Mensaje Enviado: " + getMensaje());
    }
}