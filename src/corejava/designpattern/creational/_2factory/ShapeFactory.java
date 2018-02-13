package corejava.designpattern.creational._2factory;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (null == shapeType) {
            return null;
        } else if (shapeType.equalsIgnoreCase("ShapeCircle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("ShapeSquare")) {
            return new Square();
        }
        return null;
    }
}
