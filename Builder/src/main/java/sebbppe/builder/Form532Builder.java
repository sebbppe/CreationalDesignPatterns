package sebbppe.builder;

import sebbppe.forms.Form532;
import sebbppe.models.Cash;
import sebbppe.models.Declarant;
import sebbppe.models.RepTitles;

import java.time.LocalDate;

public class Form532Builder implements BuilderForm {
    LocalDate date;
    String nit;
    String firstName;
    String secondName;
    String firstLastName;
    String secondLastName;
    Cash cash;

    @Override
    public void reset() {
        this.date=null;
        this.nit=null;
        this.firstName=null;
        this.secondName=null;
        this.firstLastName=null;
        this.secondLastName=null;
        this.cash=null;
    }

    @Override
    public BuilderForm buildDate(LocalDate localDate) {
        this.date=localDate;
        return this;
    }

    @Override
    public BuilderForm buildNameDeclarant(Declarant declarant) {
        this.firstName=declarant.getFirstName();
        this.secondName=declarant.getSecondName();
        this.firstLastName=declarant.getFirstLastName();
        this.secondLastName=declarant.getSecondLastName();
        return this;
    }

    @Override
    public BuilderForm buildNit(String nit) {
        this.nit=nit;
        return this;
    }

    @Override
    public BuilderForm buildTypeDocument(String typeDocument) {
        return this;
    }

    @Override
    public BuilderForm buildNumberDocument(String numberDocument) {
        return this;
    }

    @Override
    public BuilderForm buildDeclareCash(Cash cash) {
        this.cash=cash;
        return this;
    }

    @Override
    public BuilderForm buildDeclareRepTitles(RepTitles repTitles) {
        return this;
    }

    public Form532 build(){
        return new Form532(date,nit,firstName,secondName,firstLastName,secondLastName,cash);
    }
}
