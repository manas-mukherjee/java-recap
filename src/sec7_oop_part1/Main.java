package sec7_oop_part1;

public class Main {
    public static void main(String args[]){
/*        Car c1 = new Car();
        Car c2 = new Car();
        System.out.println(c1.equals(c2));*/

/*        AccountConstructor acc1 = new AccountConstructor("123ABC", 1000.0, "Manas", "mmanas19@gmail.com");
        AccountConstructor acc2 = new AccountConstructor("Manas", "mmanas19@gmail.com");

        System.out.println(acc1);
        System.out.println(acc2);*/

/*        InheritanceAnimal animal = new InheritanceAnimal("Animal",1,1,5,5);
        InheritanceDog dog = new InheritanceDog("Yorkie", 8,20,2,4,1,20, "long silky");
        dog.eat();
        dog.run(10);*/

        Rectangle rect = new Rectangle(1,2,3,4);
        System.out.println(rect);
        System.out.println("rect.x : " + rect);
    }
}
