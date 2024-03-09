package sebbppe.environment;


import static java.lang.Math.abs;
import static sebbppe.utils.Color.blue;
import static sebbppe.utils.Color.green;
import static sebbppe.utils.Color.minus;
import static sebbppe.utils.Color.plus;
import static sebbppe.utils.Color.reset;

public class Position {
    TypePosition typePosition;
    Integer value;

    public Position(TypePosition typePosition, Integer value) {
        this.typePosition=typePosition;
        this.value=value*typePosition.getSign();

    }

    public TypePosition getTypePosition() {
        return typePosition;
    }

    public void setTypePosition(TypePosition typePosition) {
        this.typePosition = typePosition;
    }

    public Integer getValue() {
        return value;
    }
    public String getStringValue(){
        Integer val=abs(value);
        return (val>=10)?val.toString():("0"+val);
    }

    public void setValue(Integer value) {
        this.value=value;
    }

    @Override
    public String toString() {
        if(value.equals(0)){
            return blue+"  :(  "+ reset;
        }
        if(value<0){
            return " "+minus+getStringValue()+typePosition.getCharObject()+" ";
        }
        return " "+plus+getStringValue()+typePosition.getCharObject()+" ";
    }
}
