package corejava.designpattern.creational._3abstract_factory;

public class FactoryProducer {
    public static AbsractFactory getChoice(String choice) {
        if (choice.equalsIgnoreCase("Shape")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("Color")) {
            return new ColorFactory();
        } else {
            return null;
        }
    }
}
