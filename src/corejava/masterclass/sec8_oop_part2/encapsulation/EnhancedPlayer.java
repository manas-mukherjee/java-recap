package corejava.masterclass.sec8_oop_part2.encapsulation;

public class EnhancedPlayer {
    private String name;
    private int health = 50;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health>=0 && health<=100){
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void lossHealth(int damage){
        this.health -= damage;
        if (this.health<0){
            System.out.println("Player knocked out");
        }
    }

    public int getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return "EnhancedPlayer{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
