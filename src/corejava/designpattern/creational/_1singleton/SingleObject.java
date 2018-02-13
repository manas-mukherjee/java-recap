package corejava.designpattern.creational._1singleton;

public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject(){}

    public static SingleObject getInstance(){
        return instance;
    }

    public void message(){
        System.out.println("Hello World!!");
    }
}
