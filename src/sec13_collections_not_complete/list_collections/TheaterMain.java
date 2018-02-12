package sec13_collections_not_complete.list_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TheaterMain {
    public static void main(String[] args) {
        Theater theater = new Theater("Star", 5, 4);
        //theater.getSeats();
        System.out.println("=======================");

        if (theater.reserverSeat("E04")) {
            System.out.println("Proceed to checkout");
        } else {
            System.out.println("Already booked");
        }

/*      Duplicate check
        if(theater.reserverSeat("E04")){
            System.out.println("Proceed to checkout");
        }else {
            System.out.println("Already booked");
        }
*/

        System.out.println("=======================");
        // sallow copy Ref - https://stackoverflow.com/questions/2592985/arraylist-shallow-copy-iterate-or-clone
        List<Theater.Seat> seatCopy = new ArrayList<>(theater.seats);
        seatCopy.get(0).reserve();
        for (Theater.Seat seat : seatCopy) {
            System.out.println(seat.getSeatNumber() + ":" + seat.isReserved());
        }
        Collections.reverse(seatCopy);
        System.out.println(seatCopy);
        System.out.println(theater.seats);

        System.out.println("Max seat : " + Collections.max(seatCopy).getSeatNumber());
        System.out.println("Min seat : " + Collections.min(seatCopy).getSeatNumber());

        Collections.shuffle(seatCopy);
        System.out.println("Before sort\n");
        System.out.println(seatCopy);
        sortList(seatCopy);
        System.out.println("After sort\n");
        System.out.println(seatCopy);

        //Deep copy
        //It is of no use
        //https://stackoverflow.com/questions/6147650/java-lang-indexoutofboundsexception-source-does-not-fit-in-dest
        List<Theater.Seat> newList = new ArrayList<>(theater.seats.size());
        Collections.copy(seatCopy, newList);
        System.out.println(newList.size());
    }

    private static void sortList(List<? extends Theater.Seat> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}
