package sec9_array_list.array_list;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleArray {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] input = getIntegers(5);

        System.out.println("Before sorting");
        for (int i : input) {
            System.out.print(i + " ");
        }

        //sorting(input);
        input = resize(input);
        System.out.println("\nAfter resizing");
        System.out.println(input.length);
        for (int i : input) {
            System.out.print(i + " ");
        }

    }

    private static int[] resize(int[] input) {
        int[] original = input;
        input = new int[14];

        for(int i=0; i<original.length; i++){
            input[i] = original[i];
        }
        return input;
    }

    private static void sorting(int[] input) {
        int sortedInput[] = sortIntegers(input);
        System.out.println("\nAfter sorting");
        for (int i : sortedInput) {
            System.out.print(i + " ");
        }
    }

    private static int[] sortIntegers(int[] input) {
/*      int[] sortedInt = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            sortedInt[i] = input[i];
        }*/

        int[] sortedInt = Arrays.copyOf(input, input.length);

        boolean flag = true;
        while (flag){
            flag = false;

            for (int i=0; i<input.length-1;i++){
                if(sortedInt[i] < sortedInt[i+1]){
                    int t = sortedInt[i];
                    sortedInt[i] = sortedInt[i+1];
                    sortedInt[i+1] = t;
                    flag = true;
                }
            }
        }
        return sortedInt;
    }

    private static int[] getIntegers(int n) {
        System.out.format("Enter %d integer values", n);
        int[] values = new int[n];

        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
}
