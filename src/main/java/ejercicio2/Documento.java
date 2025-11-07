package ejercicio2;

public class Documento {
    public String archivoTxt;
    public Documento(String archivoTxt){
        this.archivoTxt = archivoTxt;
    }
    private void validacion(){
        if (archivoTxt == null){
            throw new IllegalArgumentException("No puede ser Null");
        }
    }
    public void exportacionPDF(){
        System.out.println("Archivo exportado en formato PDF.");
    }
}