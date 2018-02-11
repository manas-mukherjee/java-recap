package sec10_abstruct_interface.abstructclass;

public abstract class Bird extends Animal implements CanFly {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Bird " + getName() + " is peaking");
    }

    @Override
    public void breathe() {
        System.out.println("Bird " + getName() + " is breathing");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying");
    }
}
