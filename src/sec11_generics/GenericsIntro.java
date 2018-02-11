package sec11_generics;

import java.util.ArrayList;

public class GenericsIntro {
    public static void main(String[] args) {
        ArrayList items = rawArrayList();
        ArrayList<Integer> typedArrayList = typedArrayList();

        printDoubled(items);
    }

    private static ArrayList typedArrayList() {
        ArrayList<Integer> items = new ArrayList<>();
        return items;
    }

    private static ArrayList rawArrayList() {
        ArrayList items = new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        items.add("Manas");
        return items;
    }

    private static void printDoubled(ArrayList items) {
        for (Object i : items){
            System.out.println((Integer)i*2);
        }
    }
}
