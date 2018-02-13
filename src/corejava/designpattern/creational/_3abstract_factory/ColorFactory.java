package corejava.designpattern.creational._3abstract_factory;

public class ColorFactory extends AbsractFactory{

    @Override
    public Color getColor(String shapeType) {
        if (null == shapeType) {
            return null;
        } else if (shapeType.equalsIgnoreCase("red")) {
            return new ColorRed();
        } else if (shapeType.equalsIgnoreCase("green")) {
            return new ColorGreen();
        }
        return null;
    }

    @Override
    Shape getShape(String shapeName) {
        return null;
    }
}
