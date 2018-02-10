package sec7_oop_part1;

public class AccountConstructor {
    String number;
    Double balance;
    String name;
    String email;

    public AccountConstructor(String number, Double balance, String name, String email) {
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
    }

    public AccountConstructor(String name, String email) {
        this("123-Default", 0d, name, email);
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "AccountConstructor{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
