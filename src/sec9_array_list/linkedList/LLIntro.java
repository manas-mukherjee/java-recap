package sec9_array_list.linkedList;


import java.util.ArrayList;

class Customer {
    private String name;
    private double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}

public class LLIntro {

    public static void main(String[] args) {
        Customer customer1 = new Customer("Manas", 10000);
        Customer customer2 = customer1;
        customer2.setBalance(140000.0);
        System.out.println(customer1);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        for (int i=0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }

}
