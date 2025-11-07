package ejercicio2;

public class Documento {
    private String archivoTxt;
    public Documento(String archivoTxt){
        this.archivoTxt = archivoTxt;
    }
    private void validacion(){
        if (archivoTxt == null){
            throw new IllegalArgumentException("No puede ser Null");
        }
    }

    public String getArchivoTxt() {
        return archivoTxt;
    }

    public void setArchivoTxt(String archivoTxt) {
        if (!archivoTxt.equals(this.archivoTxt)){
           this.archivoTxt = archivoTxt;
        }
    }

    public void exportacion(){
        System.out.println("Archivo exportado en formato PDF.");
        System.out.println("Archivo exportado: " + getArchivoTxt());
    }
}