package traps.p2;

import traps.p1.Chuckable;
import traps.p1.Movable;

/*
    Both Movable and Chuckable have a VALUE field. No compile error, unless
    you try to use it without casting to one interface or the other.
 */
public class Donkey implements Movable, Chuckable {
    public int location = 200;
    public void move(int by) {
        location = location+by;
    }
    public void moveBack(int by) {
        location = location-by;
    }
}