package design;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }

    @Override
    public int getArea(int x, int y) {
        return x*y;
    }
}
