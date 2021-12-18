package design;

public interface Shape {
    void draw();
    int getArea(int x, int y);
}
/*
    area
        rectangle - x*y;
        square - x * y
        circle - pi * x * y
        triangle - 1/2 * x * y
 */