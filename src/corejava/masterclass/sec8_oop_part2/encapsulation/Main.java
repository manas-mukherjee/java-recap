package corejava.masterclass.sec8_oop_part2.encapsulation;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.name = "Manas";
        player.health = 100;
        player.weapon = "brain";

        int damage = 10;
        player.lossHealth(damage);
        System.out.println(player.healthRemaining());

        // Enhanced(encapsulated) Player
        EnhancedPlayer ePlayer1 = new EnhancedPlayer("Manas", 100, "Brain");
        EnhancedPlayer ePlayer2 = new EnhancedPlayer("Manas", 200, "Sword");

        System.out.println(ePlayer1);
        System.out.println(ePlayer2);
    }
}
