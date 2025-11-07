package ejercicio2;

public class ExportacionWord extends Documento {
    public ExportacionWord(String archivoTxt){
        super(archivoTxt);
    }
    @Override
    public void exportacion(){
        System.out.println("Archivo exportado en formato Word.");
        System.out.println("Archivo exportado: " + getArchivoTxt());
    }
}
