package ejercicio2;

public class ExportacionExel extends Documento{
    public ExportacionExel(String archivoTxt){
        super(archivoTxt);
    }
    public void exportarExel(){
        System.out.println("Archivo exportado en formato Exel.");
    }
}
