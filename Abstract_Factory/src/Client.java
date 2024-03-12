import AbstractFactory.DocumentFactory;
import AbstractFactory.Documento;
import AbstractFactory.Editor;
import PDF.PdfFactory;
import Word.WordFactory;

public class Client {
    public static void main(String[] args) {
        // Utilizar la fábrica para documentos PDF
        DocumentFactory pdfFactory = new PdfFactory();
        Documento pdfDocumento = pdfFactory.crearDocumento();
        Editor pdfEditor = pdfFactory.crearEditor();
        pdfDocumento.abrir();
        pdfEditor.editar();

        System.out.println("-------------------");

        // Utilizar la fábrica para documentos Word
        DocumentFactory wordFactory = new WordFactory();
        Documento wordDocumento = wordFactory.crearDocumento();
        Editor wordEditor = wordFactory.crearEditor();
        wordDocumento.abrir();
        wordEditor.editar();
    }
}