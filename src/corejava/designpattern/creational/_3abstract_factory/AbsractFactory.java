package corejava.designpattern.creational._3abstract_factory;

public abstract class AbsractFactory {
    abstract Color getColor(String colorName);
    abstract Shape getShape(String shapeName);
}
