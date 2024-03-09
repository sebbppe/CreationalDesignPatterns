package sebbppe.builder;

import sebbppe.forms.Form534;
import sebbppe.models.Cash;
import sebbppe.models.Declarant;
import sebbppe.models.RepTitles;

import java.time.LocalDate;

public class Form534Builder implements BuilderForm {
    LocalDate date;
    String typeDocument;
    String document;
    String firstName;
    String secondName;
    String firstLastName;
    String secondLastName;
    RepTitles repTitles;

    @Override
    public void reset() {
        this.date=null;
        this.typeDocument=null;
        this.document=null;
        this.firstName=null;
        this.secondName=null;
        this.firstLastName=null;
        this.secondLastName=null;
        this.repTitles=null;
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
        return this;
    }

    @Override
    public BuilderForm buildTypeDocument(String typeDocument) {
        this.typeDocument=typeDocument;
        return this;
    }

    @Override
    public BuilderForm buildNumberDocument(String numberDocument) {
        this.document=numberDocument;
        return this;
    }

    @Override
    public BuilderForm buildDeclareCash(Cash cash) {
        return this;
    }

    @Override
    public BuilderForm buildDeclareRepTitles(RepTitles repTitles)
    {
        this.repTitles=repTitles;
        return this;
    }

    public Form534 build(){
        return new Form534(date,typeDocument,document,firstName,secondName,firstLastName,secondLastName,repTitles);
    }
}
