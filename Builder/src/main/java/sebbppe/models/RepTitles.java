package sebbppe.models;

public class RepTitles {
    String titleClass;
    String currency;
    String value;

    public RepTitles(String titleClass, String currency, String value) {
        this.titleClass = titleClass;
        this.currency = currency;
        this.value = value;
    }

    public String getTitleClass() {
        return titleClass;
    }

    public void setTitleClass(String titleClass) {
        this.titleClass = titleClass;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
