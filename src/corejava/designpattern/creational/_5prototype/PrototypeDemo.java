package corejava.designpattern.creational._5prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        Shape shape1 = ShapeCache.getShape("1");
        shape1.draw();

        Shape shape2 = ShapeCache.getShape("2");
        shape2.draw();
    }
}
