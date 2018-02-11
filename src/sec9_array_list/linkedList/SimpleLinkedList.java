package sec9_array_list.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


//TODO: Read - https://beginnersbook.com/2013/12/difference-between-arraylist-and-linkedlist-in-java/

public class SimpleLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Placeholder");
        printList(linkedList);

        linkedList.add(0, "Uttarpara");
        System.out.println("======================");

        printList(linkedList);
        System.out.println("======================");

        addItemInOrder(linkedList,"Amritsor");
        addItemInOrder(linkedList,"Mumbai");
        addItemInOrder(linkedList,"Calcutta");
        addItemInOrder(linkedList,"Delhi");
        addItemInOrder(linkedList,"Chennai");
        printList(linkedList);
        System.out.println("======================");

        visit(linkedList);

    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println("Place - " + iterator.next());
        }
    }

    private static boolean addItemInOrder(LinkedList<String> linkedList, String newItem) {

        // listIterator is better than normal iterator: Ans : you can go forward and backward
        // LinkedList is stored as DoublyLinkedList
        // There is no concept of current postion
        ListIterator<String> listIterator = linkedList.listIterator();

        while (listIterator.hasNext()) {
            String currentItem = listIterator.next();
            int comparision = currentItem.compareTo(newItem);

            if(comparision==0){
                //Do not add
                return false;
            } else if(comparision>0){ // new item should appear before the current one. Ex : Amritsar < Calcutta
                listIterator.previous();
                listIterator.add(newItem);
                return true;
            }  else {
                //Move on
            }
        }
        linkedList.add(newItem);
        return true;
    }

    private static void visit(LinkedList<String> linkedList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;

        ListIterator<String> listIterator = linkedList.listIterator();

        if(linkedList.isEmpty()){
            System.out.println("No item exists");
            return;
        }else {
            System.out.println("Item - " + listIterator.next());
            printMenu();
        }

        //TODO: Read more on https://en.wikipedia.org/wiki/Cycle_detection
        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    quit = true;
                    System.out.println("quitting");
                    break;
                case 1:
                    if(!goingForward){
                        if (listIterator.hasNext()){
                            listIterator.hasNext();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Current Item : " + listIterator.next());
                    }else {
                        System.out.println("Reached to the end");
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Current Item : " + listIterator.previous());
                    }else {
                        System.out.println("Reached to the begining");
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Enter Menu\n+++++++++++");
        System.out.println("0 - Quit");
        System.out.println("1 - Next item");
        System.out.println("2 - Previous item");
        System.out.println("3 - Print menu");
    }
}
