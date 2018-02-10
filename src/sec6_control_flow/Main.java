package sec6_control_flow;

public class Main {
    public static void main(String args[]){
        int switchVal = 4;
        switch(switchVal){
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:
            case 4:
                System.out.println("This is either 3 or 4");
                break;
            default:
                System.out.println("Ohh! This is default");
        }
    }
}
