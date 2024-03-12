package Word;

import AbstractFactory.Editor;

public class WordEditor implements Editor {
    @Override
    public void editar() {
        System.out.println("Editando documento Word.");
    }
}
