package corejava.designpattern.creational._3abstract_factory;

public class ColorRed implements Color{
    @Override
    public void fill() {
        System.out.println("inside red fill");
    }
}
