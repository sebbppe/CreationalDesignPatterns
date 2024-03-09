package sebbppe.models;

public class NaturalPerson extends Declarant{
    private String typeDocument;
    private  String document;
    public NaturalPerson(String typeDocument,String document,String firstName, String secondName, String firstLastName, String secondLastName) {
        super(firstName, secondName, firstLastName, secondLastName);
        this.typeDocument=typeDocument;
        this.document=document;
    }

    public String getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(String typeDocument) {
        this.typeDocument = typeDocument;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
