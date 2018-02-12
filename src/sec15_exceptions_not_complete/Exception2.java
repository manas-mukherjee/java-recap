package sec15_exceptions_not_complete;

import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        int divide = divide();
    }

    private static int divide() {
        int x = getint();
        int y = getint();

        System.out.format("x : %d, y : %d", x, y);
        return x/y;
    }

    public static int getint() {
        Scanner scanner = new Scanner(System.in);
        int var = scanner.nextInt();
        return var;
    }
}
