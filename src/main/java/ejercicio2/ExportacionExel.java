package ejercicio2;

public class ExportacionExel extends Documento{
    public ExportacionExel(String archivoTxt){
        super(archivoTxt);
    }
    @Override
    public void exportacion(){
        System.out.println("Archivo exportado en formato Exel.");
        System.out.println("Archivo exportado: " + getArchivoTxt());
    }
}
