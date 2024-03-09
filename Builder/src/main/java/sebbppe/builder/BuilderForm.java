package sebbppe.builder;

import sebbppe.models.Cash;
import sebbppe.models.RepTitles;

import java.time.LocalDate;

public interface BuilderForm {
    public void reset();
    public BuilderForm buildDate(LocalDate localDate);
    public BuilderForm buildDeclarant();
    public BuilderForm buildDeclareCash(Cash cash);
    public BuilderForm buildDeclareRepTitles(RepTitles repTitles);

}
