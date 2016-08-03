package traps.p1;

public interface Movable {
    int location = 0;
    void move(int by);
    public void moveBack(int by);
    int VALUE = 1;
}
