package model;

public class Player {

    private int balance;

    public Player(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void addBalance(int amount) {
        balance += amount;
    }

    public void subtractBalance(int amount) {
        balance -= amount;
    }
}

