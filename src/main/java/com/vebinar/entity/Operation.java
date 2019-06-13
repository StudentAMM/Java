package com.vebinar.entity;


import java.sql.Date;
import  org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import  org.springframework.data.relational.core.mapping.Table;

@Table("Operation")
public class Operation {
    @Id
    private int id;
    @Column("operation")
    private String operation;
    @Column("card")
    private int card;
    @Column("descr")
    private String descr;
    @Column("date")
    private Date date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCard() {
        return card;
    }

    public void setCard(int card) {
        this.card = card;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
