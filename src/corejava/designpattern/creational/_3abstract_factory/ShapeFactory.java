package corejava.designpattern.creational._3abstract_factory;

public class ShapeFactory extends AbsractFactory {
    @Override
    Color getColor(String colorName) {
        return null;
    }

    public Shape getShape(String shapeType) {
        if (null == shapeType) {
            return null;
        } else if (shapeType.equalsIgnoreCase("Circle")) {
            return new ShapeCircle();
        } else if (shapeType.equalsIgnoreCase("Square")) {
            return new ShapeSquare();
        }
        return null;
    }
}
