package Word;

import AbstractFactory.Documento;

public class WordDocumento implements Documento {
    @Override
    public void abrir() {
        System.out.println("Abriendo documento Word.");
    }
}
