package corejava.masterclass.sec9_array_list.array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleListMain {
    private static SimpleList slist = new SimpleList();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        printInstructions();

        while(!quit){
            System.out.println("Enter your choice :");
            choice = scanner.nextInt();
            scanner.nextLine(); //clear the input buffer

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    slist.printListContent();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;
                case 7:
                    processArrayList();
                    break;
            }
        }
    }

    private static void addItem() {
        System.out.println("Enter new item - ");
        slist.addItemToList(scanner.nextLine());
    }

    private static void modifyItem() {
        System.out.println("Enter item no - ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        String newItem = scanner.nextLine();
        slist.modifyList(itemNo-1, newItem);
        slist.printListContent();
    }

    private static void searchItem() {
        System.out.println("Enter the item to seach -");
        String searchItem = scanner.nextLine();
        slist.findItem(searchItem);
    }

    private static void removeItem() {
        System.out.println("Enter item no - ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        slist.removeItemFromList(itemNo-1);
        slist.printListContent();
    }

    private static void printInstructions() {
        System.out.println("\nEnter choice ");
        System.out.println("\n0 - PrintInstruction");
        System.out.println("\n1 - Print List");
        System.out.println("\n2 - Add item");
        System.out.println("\n3 - Modify item");
        System.out.println("\n4 - Remove item");
        System.out.println("\n5 - Search item");
        System.out.println("\n6 - Quit");
    }

    public static void processArrayList(){
        ArrayList<String> arrList1 = new ArrayList<>();
        arrList1.addAll(slist.getArrayList());

        ArrayList<String> arrList2 = new ArrayList<>(slist.getArrayList());

        String[] myArray = new String[slist.getArrayList().size()];
        myArray = slist.getArrayList().toArray(myArray);

        for (String a : myArray){
            System.out.println(a);
        }
    }


}
