package corejava.masterclass.sec8_oop_part2.polymorphism;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {

    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Independence Day movie";
    }
}

class StarWars extends Movie {

    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the Univese";
    }
}

class ForgettableMovie extends Movie {

    public ForgettableMovie() {
        super("Forgettable Movie");
    }

}


public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie Name : " + movie.getName() + ", Plot : " + movie.plot());

        }
    }

    public static Movie randomMovie() {
        //random number between 1 and 5
        int randomNo = (int) (Math.random() * 4 + 1);
        System.out.println("Random Number x : " + randomNo);

        switch (randomNo) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new StarWars();
            case 4:
                return new ForgettableMovie();
        }
        return null;
    }
}
