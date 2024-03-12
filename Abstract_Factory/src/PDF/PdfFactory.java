package PDF;

import AbstractFactory.DocumentFactory;
import AbstractFactory.Documento;
import AbstractFactory.Editor;

public class PdfFactory implements DocumentFactory {
    @Override
    public Documento crearDocumento() {
        return new PdfDocumento();
    }

    @Override
    public Editor crearEditor() {
        return new PdfEditor();
    }
}
