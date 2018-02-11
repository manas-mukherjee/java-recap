package sec10_abstruct_interface.abstructclass;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Kauchu");
        dog.eat();
        dog.breathe();

        /*Bird bird = new Bird("Moina");
        bird.eat();
        bird.breathe();*/

        Bird bird = new Parrot("Green Parroty");
        bird.eat();
        bird.breathe();
        bird.fly();

        Bird bird1 = new Penguine("Pengu");
        bird1.eat();
        bird1.breathe();
        bird1.fly();
    }
}
