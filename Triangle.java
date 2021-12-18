package design;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw a triangle");
    }

    @Override
    public int getArea(int x, int y) {
        return  (x * y)/2;
    }
}
