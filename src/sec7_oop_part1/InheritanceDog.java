package sec7_oop_part1;

public class InheritanceDog extends InheritanceAnimal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public InheritanceDog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        System.out.println("Dog's eat() called");
        chew();
        super.eat();
    }

    private void chew() {
        System.out.println("Dog has started chewing");
    }

    public void run(int speed){
        System.out.println("dog.run() is called");
        move(speed);
    }

    @Override
    public void move(int speed) {
        System.out.println("dog.move() is called");
        super.move(speed);
    }
}
