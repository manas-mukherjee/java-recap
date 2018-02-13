package corejava.designpattern.creational._3abstract_factory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbsractFactory absractFactory = FactoryProducer.getChoice("Shape");
        Shape circleShape = absractFactory.getShape("Circle");
        circleShape.draw();
    }
}
