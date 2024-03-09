package sebbppe.objectpool;

import java.util.Random;

import static sebbppe.utils.Color.red;
import static sebbppe.utils.Color.reset;
import static sebbppe.utils.Color.yellow;

public class Ball {
    private final Double multiply;

    private static final Random random=new Random();

    public Ball() {
        this.multiply = random.nextDouble(4);
    }

    public Double getMultiply() {
        return multiply;
    }

    @Override
    public String toString() {
        return yellow+"("+red+"x"+multiply+yellow+")"+reset;
    }
}
