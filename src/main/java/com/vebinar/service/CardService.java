package com.vebinar.service;

import com.vebinar.entity.Card;

import java.util.List;

public interface CardService {

    List<Card> findAll();

    void save(Card card) throws Exception;

    Card getById(int id);

    void update(Card card);

    void delete(int id);

    void putMoney (Card card, int money);

    void getMoney (Card card, int money);
}
