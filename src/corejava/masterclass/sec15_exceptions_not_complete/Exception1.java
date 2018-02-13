package corejava.masterclass.sec15_exceptions_not_complete;

import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
/*        System.out.println(Exception1.divideLBYL(98,0));
        System.out.println(Exception1.divideAFAP(98,0));
        System.out.println(Exception1.divide(98,0));*/

        int input = getInt();
        System.out.println("input - " + input);
    }

    //REF : https://stackoverflow.com/questions/404795/lbyl-vs-eafp-in-java
    //Look before you leap
    private static int divideLBYL(int x, int y){
        System.out.println("divideLBYL\n------------");
        if (y!=0){
            return x/y;
        }else {
            return 0;
        }
    }
    //Easier to Ask Forgiveness than Permission
    //Less code
    private static int divideAFAP(int x, int y){
        System.out.println("divideAFAP\n------------");
        try{
            return x/y;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            return 0;
        }
    }

    //bad
    private static int divide(int x, int y) {
        return x/y;
    }

    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an int \n -> ");
        String input = scanner.next();
        boolean isValid = true;

        for (int i=0; i<input.length(); i++){
            if(!Character.isDigit(input.charAt(i))){
                isValid = false;
                break;
            }
        }

        if(isValid){
            int x = Integer.parseInt(input);
            return x;
        }
        return 0;
    }
}
