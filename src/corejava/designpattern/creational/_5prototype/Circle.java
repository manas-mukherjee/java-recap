package corejava.designpattern.creational._5prototype;

public class Circle extends Shape{
    public Circle() {
        this.type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("This is from the Circle department");
    }
}
