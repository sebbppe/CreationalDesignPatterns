package sebbppe.environment;

import static sebbppe.utils.Color.point;

public enum TypePosition {
    PLUSPOINTS(1, point),
    MINUSPOINTS(-1, point),
    DEAD(0," ");

    private String charObject;
    private Integer sign;

    TypePosition(Integer sign, String charObject) {
        this.sign=sign;
        this.charObject=charObject;
    }

    public String getCharObject() {
        return charObject;
    }

    public Integer getSign() {
        return sign;
    }
}
