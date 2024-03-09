package sebbppe.forms;

import sebbppe.models.Cash;
import sebbppe.models.RepTitles;

import java.time.LocalDate;

import static java.lang.String.format;

public class Form530 {
    LocalDate date;
    String typeDocument;
    String document;
    String firstName;
    String secondName;
    String firstLastName;
    String secondLastName;
    Cash cash;
    RepTitles repTitles;

    public Form530(LocalDate date, String typeDocument, String document, String firstName, String secondName, String firstLastName, String secondLastName, Cash cash, RepTitles repTitles) {
        this.date = date;
        this.typeDocument = typeDocument;
        this.document = document;
        this.firstName = firstName;
        this.secondName = secondName;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
        this.cash = cash;
        this.repTitles = repTitles;
    }

    @Override
    public String toString() {
        return  "-----------------------------------------------------------------------\n" +
                "                              Formulario 530                           \n" +
                "-----------------------------------------------------------------------\n" +
                "           Declaración de Equipaje, de Dinero en Efectivo y            \n" +
                "           de Títulos Representativos de Dinero – Viajeros             \n" +
                "-----------------------------------------------------------------------\n" +
                "         Tipo de documento        |              Documento             \n" +
                "-----------------------------------------------------------------------\n" +
                "          "+ format("%-24s",typeDocument)+"|          "+ format("%-26s",document)+"\n" +
                "-----------------------------------------------------------------------\n" +
                "  Primer nombre  | Segundo nombre  | Primer apellido | Segundo apellido\n" +
                "-----------------------------------------------------------------------\n" +
                " "+ format("%-17s",firstName)+"| "+format("%-17s",secondName)+"| "+format("%-17s",firstLastName)+"| "+format("%-17s",secondLastName)+"\n" +
                "-----------------------------------------------------------------------\n" +
                "             Dinero en efectivo o títulos representativos              \n" +
                "-----------------------------------------------------------------------\n" +
                " Item | Clase(Efectivo o títulos) |   Moneda   |         Valor         \n" +
                "-----------------------------------------------------------------------\n" +
                "  1   | Efectivo                  |    "+format("%-8s",cash.getCurrency())+"|    "+format("%-19s",cash.getValue())+"\n" +
                "-----------------------------------------------------------------------\n" +
                "  2   | Título-"+format("%-19s",repTitles.getTitleClass())+"|    "+format("%-8s",repTitles.getCurrency())+"|    "+format("%-19s",repTitles.getValue())+"\n" +
                "-----------------------------------------------------------------------\n";
    }
}
