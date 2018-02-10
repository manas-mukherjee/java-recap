package sec5_expression_statements_codeblocks;

public class ExpStatementCodeBlock {
    public static void main(String args[]){
        calculateScore("Manas", 100);
        calculateScore();
    }

    private static int displayScore(int i) {
        return i*100;
    }

    //Method overloading ( same method name but different number of parameters )
    //Doesn't depend on the return type
    public static int calculateScore(String playerName, int score){
        System.out.println("Playername : " + playerName + " score : " + score);
        return  score;
    }

    public static int calculateScore(String playerName, int score, int gameNo){
        System.out.println("Playername : " + playerName + " score : " + score);
        return  score;
    }

    public static int calculateScore(){
        System.out.println("Hello");
        return 0;
    }
}
