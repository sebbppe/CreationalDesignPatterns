package sebbppe.builder;

import sebbppe.models.Cash;
import sebbppe.models.Declarant;
import sebbppe.models.RepTitles;

import java.time.LocalDate;

public interface BuilderForm {
    public void reset();
    public BuilderForm buildDate(LocalDate localDate);
    public BuilderForm buildNameDeclarant(Declarant declarant);
    public BuilderForm buildNit(String nit);
    public BuilderForm buildTypeDocument(String typeDocument);
    public BuilderForm buildNumberDocument(String numberDocument);
    public BuilderForm buildDeclareCash(Cash cash);
    public BuilderForm buildDeclareRepTitles(RepTitles repTitles);

}
