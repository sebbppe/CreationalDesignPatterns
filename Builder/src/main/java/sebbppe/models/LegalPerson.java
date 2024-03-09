package sebbppe.models;

public class LegalPerson extends Declarant{
    private String nit;
    public LegalPerson(String nit,String firstName, String secondName, String firstLastName, String secondLastName) {
        super(firstName, secondName, firstLastName, secondLastName);
        this.nit=nit;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}
