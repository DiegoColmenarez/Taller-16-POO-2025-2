package ejercicio2;

public class ExportacionWord extends Documento {
    public ExportacionWord(String archivoTxt){
        super(archivoTxt);
    }
    public void exportacionWord(){
        System.out.println("Archivo exportado en formato Word.");
    }
}
