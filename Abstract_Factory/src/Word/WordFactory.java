package Word;

import AbstractFactory.DocumentFactory;
import AbstractFactory.Documento;
import AbstractFactory.Editor;

public class WordFactory implements DocumentFactory {
    @Override
    public Documento crearDocumento() {
        return new WordDocumento();
    }

    @Override
    public Editor crearEditor() {
        return new WordEditor();
    }
}
