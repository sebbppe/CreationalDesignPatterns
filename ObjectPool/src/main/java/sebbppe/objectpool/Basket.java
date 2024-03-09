package sebbppe.objectpool;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Ball> balls;
    private int maxSize;
    public Basket(int maxSize) {
        this.maxSize = maxSize;
        this.balls = new ArrayList<>();
    }
    public synchronized Ball acquireObject() {
        if (balls.isEmpty()) {
            return new Ball();
        } else {
            return balls.remove(balls.size() - 1);
        }
    }
    public synchronized void releaseObject(Ball object) {
        if (balls.size() < maxSize) {
            balls.add(object);
        }
    }

    @Override
    public String toString() {
        String bascketS="[";
        for(Ball ball:balls){
            bascketS+=ball.toString()+", ";
        }
        return bascketS+"]";
    }
}
