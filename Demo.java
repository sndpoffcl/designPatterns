package design;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Scanner sc = new Scanner(System.in);
        String shapeName = sc.nextLine();
        Shape obj = shapeFactory.getShape(shapeName);
        System.out.println(obj.getArea(10,12));
    }
}

//12:15
