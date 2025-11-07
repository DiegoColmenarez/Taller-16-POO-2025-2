package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Documento documentoPDF = new Documento("La macarena");
        documentoPDF.exportacion();
        Documento documentoExel = new ExportacionExel("Notas");
        documentoExel.exportacion();
        Documento documentoWord = new ExportacionWord("Ensayo 2");
        documentoWord.exportacion();
    }
}
