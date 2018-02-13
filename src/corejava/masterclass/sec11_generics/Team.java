package corejava.masterclass.sec11_generics;

import java.util.ArrayList;


// Bounded by Player
public class Team<T extends Player> implements Comparable<Team<T>>{
    private String name;
    private int rating;
    private int played = 0;
    private int win = 0;
    private int lost = 0;
    private int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
        this.rating = 0;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (this.members.contains(player)) {
            System.out.println(player.getName() + " already exists");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for the team " + this.name);
            return true;
        }
    }

    public int getNumberOfPlayers() {
        return this.members.size();
    }

    public void matchResult(Team<T> oponent, int ourScore, int theirScore) {
        String message;

        if (ourScore > theirScore) {
            message = " beat ";
            this.win++;
        } else if (ourScore == theirScore) {
            message = " drew with ";
            this.tied++;
        } else {
            message = " lost to ";
            this.lost++;
        }
        this.played++;

        if (oponent != null) {
            System.out.println(this.getName() + message + oponent.getName());
            oponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int getRanking() {
        this.rating = (this.win * 2) + this.tied;
        return this.rating;
    }

    // - : this is less than the object, 1 : this is greater than the object
    @Override
    public int compareTo(Team<T> otherTeam) {
        if(this.getRanking() > otherTeam.getRanking()){
            return -1;
        }else if(this.getRanking() < otherTeam.getRanking()){
            return +1;
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}
