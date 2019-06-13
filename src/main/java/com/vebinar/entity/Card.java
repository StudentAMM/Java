package com.vebinar.entity;

public class Card  {
    private int id;
    private String FIO;
    private int balance;


    public Card() {
        super();
    }

    public Card(int id,String FIO, int balance) {
        this.id=id;
        this.FIO=FIO;
        this.balance=balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
