package PDF;

import AbstractFactory.Editor;

public class PdfEditor implements Editor {
    @Override
    public void editar() {
        System.out.println("Editando documento PDF.");
    }
}
