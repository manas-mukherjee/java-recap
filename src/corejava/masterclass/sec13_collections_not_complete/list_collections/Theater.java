package corejava.masterclass.sec13_collections_not_complete.list_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Theater {
    private final String threaterName;
    //TODO: read more on https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html
    public List<Seat> seats = new ArrayList<>(); //same level of the hiererchy

    public Theater(String threaterName, int numRows, int seatsPerRow) {
        this.threaterName = threaterName;
        int lastRow = 'A' + (numRows - 1);

        for (char row='A'; row<=lastRow; row++){
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++){
                Seat seat = new Seat(row + String.format("%02d", seatNum),0);
                this.seats.add(seat);
            }
        }
    }

    public Collection<Seat> getSeats() {
        return seats;
    }

    public boolean reserverSeat(String requestedSeatNumber){
        Seat requestedSeat = new Seat(requestedSeatNumber,0);
        int foundSeatAtIndex = Collections.binarySearch(this.seats, requestedSeat, null);

        if(foundSeatAtIndex>=0){
            this.seats.get(foundSeatAtIndex).reserve();
            return true;
        }else {
            System.out.println("There is no seat with number : " + requestedSeatNumber);
            return false;
        }

/*      Linear Serach
        Seat requestedSeat = null;
        for(Seat seat: this.seats){
            System.out.print(".");
            if(seat.getSeatNumber().equals(requestedSeatNumber)){
                requestedSeat = seat;
                break;
            }
        }

        if (requestedSeat==null){
            System.out.println("There is no seat with number : " + requestedSeatNumber);
            return false;
        }

        return requestedSeat.reserve();*/
    }

    public class Seat implements Comparable<Seat>{
        private String seatNumber;
        private double price;
        private boolean reserved = false;

        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public boolean isReserved() {
            return reserved;
        }

        public boolean reserve() {
            if (!this.reserved){
                reserved = true;
                System.out.println("Seat : " + this.seatNumber + " reserved");
                return true;
            }else{
                return false;
            }
        }

        public boolean cancel(){
            if (this.reserved){
                reserved = false;
                System.out.println("Reservation of seat : " + this.seatNumber + " cancelled");
                return true;
            }else {
                return false;
            }
        }
        @Override
        public String toString() {
            return "Seat{" +
                    "seatNumber='" + seatNumber + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Seat otherSeat) {
            return this.seatNumber.compareToIgnoreCase(otherSeat.getSeatNumber());
        }
    }
}
