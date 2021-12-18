package design;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    public int getArea(int x, int y) {
        return x*y;
    }
}
