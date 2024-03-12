package PDF;

import AbstractFactory.Documento;

public class PdfDocumento implements Documento {
    @Override
    public void abrir() {
        System.out.println("Abriendo documento PDF.");
    }
}
