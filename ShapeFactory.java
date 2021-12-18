package design;

public class ShapeFactory {
    public Shape getShape(String shapeName){
        if(shapeName == null)
            return null;
        if(shapeName.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        if(shapeName.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        if(shapeName.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        if(shapeName.equalsIgnoreCase("TRIANGLE")){
            return new Triangle();
        }
        return null;
    }
}
