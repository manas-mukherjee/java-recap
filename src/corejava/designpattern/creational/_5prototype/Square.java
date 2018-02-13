package corejava.designpattern.creational._5prototype;

public class Square extends Shape{
    public Square() {
        this.type = "Square";
    }

    @Override
    void draw() {
        System.out.println("this is from the Square dept.");
    }
}
