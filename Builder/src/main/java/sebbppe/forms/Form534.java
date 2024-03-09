package sebbppe.forms;

import sebbppe.models.Cash;
import sebbppe.models.RepTitles;

import java.time.LocalDate;

import static java.lang.String.format;

public class Form534 {
    LocalDate date;
    String typeDocument;
    String document;
    String firstName;
    String secondName;
    String firstLastName;
    String secondLastName;
    RepTitles repTitles;

    public Form534(LocalDate date, String typeDocument, String document, String firstName, String secondName, String firstLastName, String secondLastName, RepTitles repTitles) {
        this.date = date;
        this.typeDocument = typeDocument;
        this.document = document;
        this.firstName = firstName;
        this.secondName = secondName;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
        this.repTitles = repTitles;
    }

    @Override
    public String toString() {
        return  "-----------------------------------------------------------------------\n" +
                "                              Formulario 534                           \n" +
                "-----------------------------------------------------------------------\n" +
                "              Declaración de Ingreso - Salida de Títulos               \n" +
                "     Representativos de Dinero por Usuarios Diferentes a Viajero       \n" +
                "-----------------------------------------------------------------------\n" +
                "         Tipo de documento        |              Documento             \n" +
                "-----------------------------------------------------------------------\n" +
                "          "+ format("%-24s",typeDocument)+"|          "+ format("%-26s",document)+"\n" +
                "-----------------------------------------------------------------------\n" +
                "  Primer nombre  | Segundo nombre  | Primer apellido | Segundo apellido\n" +
                "-----------------------------------------------------------------------\n" +
                " "+ format("%-17s",firstName)+"| "+format("%-17s",secondName)+"| "+format("%-17s",firstLastName)+"| "+format("%-17s",secondLastName)+"\n" +
                "-----------------------------------------------------------------------\n" +
                "                      Títulos representativos                          \n" +
                "-----------------------------------------------------------------------\n" +
                " Item | Clase de título           |   Moneda   |         Valor         \n" +
                "-----------------------------------------------------------------------\n" +
                "  1   | Título-"+format("%-19s",repTitles.getTitleClass())+"|    "+format("%-8s",repTitles.getCurrency())+"|    "+format("%-19s",repTitles.getValue())+"\n" +
                "-----------------------------------------------------------------------\n";
    }
}
