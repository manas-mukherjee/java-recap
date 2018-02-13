package corejava.masterclass.sec8_oop_part2.encapsulation;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public void lossHealth(int damage){
        this.health -= damage;
        if (this.health<0){
            System.out.println("Player knocked out");
            //Reduce the number of lives
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
