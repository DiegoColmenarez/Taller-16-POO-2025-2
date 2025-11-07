package ejercicio2;

public class Main {
    public static void main(String[] args) {
        var documento = new Documento("La macarena");
        documento.exportacionPDF();
        var documentoExel = new ExportacionExel("Notas");
        documentoExel.exportarExel();
        var documentoWord = new ExportacionWord("Ensayo 2");
        documentoWord.exportacionWord();
    }
}
