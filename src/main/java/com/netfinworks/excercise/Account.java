package com.netfinworks.excercise;

/**
 * TODO 写javadoc.
 *
 * @auther loki 15/8/28
 */
public class Account {
    private int balance;

    public Account() {
        this.balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }
}
