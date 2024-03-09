package sebbppe.forms;

import sebbppe.models.Cash;

import java.time.LocalDate;

import static java.lang.String.format;

public class Form532 {
    LocalDate date;
    String nit;
    String firstName;
    String secondName;
    String firstLastName;
    String secondLastName;
    Cash cash;

    public Form532(LocalDate date, String nit, String firstName, String secondName, String firstLastName, String secondLastName, Cash cash) {
        this.date = date;
        this.nit = nit;
        this.firstName = firstName;
        this.secondName = secondName;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
        this.cash = cash;
    }

    @Override
    public String toString() {
        return "-----------------------------------------------------------------------\n" +
                "                              Formulario 532                           \n" +
                "-----------------------------------------------------------------------\n" +
                "      Declaración de ingreso - salida de dinero en efectivo            \n" +
                "-----------------------------------------------------------------------\n" +
                "                                   NIT                                 \n" +
                "-----------------------------------------------------------------------\n" +
                "                                " +nit+"\n"+
                "-----------------------------------------------------------------------\n" +
                "  Primer nombre  | Segundo nombre  | Primer apellido | Segundo apellido\n" +
                "-----------------------------------------------------------------------\n" +
                " "+ format("%-17s",firstName)+"| "+format("%-17s",secondName)+"| "+format("%-17s",firstLastName)+"| "+format("%-17s",secondLastName)+"\n" +
                "-----------------------------------------------------------------------\n" +
                "                          Dinero en efectivo                           \n" +
                "-----------------------------------------------------------------------\n" +
                " Item |        Efectivo           |   Moneda   |         Valor         \n" +
                "-----------------------------------------------------------------------\n" +
                "  1   | Efectivo                  |    "+format("%-8s",cash.getCurrency())+"|    "+format("%-19s",cash.getValue())+"\n" +
                "-----------------------------------------------------------------------\n" ;
    }
}
