package design;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public int getArea(int x, int y) {
        return (int)3.14 * x * y;
    }
}
