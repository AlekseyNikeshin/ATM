package tech.itpark;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(7000);
        atm.replenisment(1000);
        atm.withdrawal(4000);
    }
}
