package oop1.ex;

public class Account {

    int valance;

    void deposit(int amount) {
        valance += amount;
    }

    void withdraw(int amount) {
        if (valance >= amount) {
            valance -= amount;
        } else {
            System.out.println("잔액 부족");
        }
    }

    void showValance() {
        System.out.println("잔고: " + valance);
    }

}
