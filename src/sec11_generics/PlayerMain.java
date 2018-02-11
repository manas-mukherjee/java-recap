package sec11_generics;

import java.util.ArrayList;
import java.util.Collections;

public class PlayerMain {
    public static void main(String[] args) {
        FootballPlayer footballPlayer = new FootballPlayer("Joe");
        BaseballPlayer baseballPlayer = new BaseballPlayer("Pat");
        SoccerballPlayer soccerballPlayer = new SoccerballPlayer("Messi");
        SoccerballPlayer soccerballPlayer3 = new SoccerballPlayer("CR7");

        Team<FootballPlayer> footballPlayerTeam = new Team<>("FootballT");
        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("BaseballT");
        Team<SoccerballPlayer> soccerballPlayerTeam1 = new Team<>("ManU");
        Team<SoccerballPlayer> soccerballPlayerTeam2 = new Team<>("Bercelona");
        Team<SoccerballPlayer> soccerballPlayerTeam3 = new Team<>("R.Madrid");

        footballPlayerTeam.addPlayer(footballPlayer);
        baseballPlayerTeam.addPlayer(baseballPlayer);
        soccerballPlayerTeam1.addPlayer(soccerballPlayer);
        soccerballPlayerTeam3.addPlayer(soccerballPlayer3);

        /*
        Didn't work - cause this and the opponent had different type
        footballPlayerTeam.matchResult(soccerballPlayerTeam, 5, 3);
        footballPlayerTeam.matchResult(baseballPlayerTeam, 3, 3);*/

        soccerballPlayerTeam1.matchResult(soccerballPlayerTeam2, 5,1);
        soccerballPlayerTeam1.matchResult(soccerballPlayerTeam2, 1,1);
        soccerballPlayerTeam1.matchResult(soccerballPlayerTeam2, 2,1);
        soccerballPlayerTeam3.matchResult(soccerballPlayerTeam2, 1,1);

        System.out.println("Rankings\n====================");
        System.out.println("footbasll team rank : " + footballPlayerTeam.getRanking());
        System.out.println("base team rank : " + baseballPlayerTeam.getRanking());
        System.out.println("soccer team : " + soccerballPlayerTeam1.getName() + " rank : " + soccerballPlayerTeam1.getRanking());
        System.out.println("soccer team : " + soccerballPlayerTeam2.getName() + " rank : " + soccerballPlayerTeam2.getRanking());
        System.out.println("soccer team : " + soccerballPlayerTeam3.getName() + " rank : " + soccerballPlayerTeam3.getRanking());

        System.out.println(soccerballPlayerTeam1.compareTo(soccerballPlayerTeam2));
        System.out.println(soccerballPlayerTeam2.compareTo(soccerballPlayerTeam1));

        ArrayList<Team<SoccerballPlayer>> soccerTeamList = new ArrayList<>();
        soccerTeamList.add(soccerballPlayerTeam3);
        soccerTeamList.add(soccerballPlayerTeam1);
        soccerTeamList.add(soccerballPlayerTeam2);
        System.out.println(soccerTeamList);
        Collections.sort(soccerTeamList);
        System.out.println(soccerTeamList);
    }
}
