package com.vebinar.service;

import com.vebinar.dao.CardDao;
import com.vebinar.entity.Card;
//import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    public CardDao cardDao;

    public List<Card> findAll() {
        return cardDao.findAll();
    }

    public void save(Card card) throws Exception {
        if (card.getFIO().length() < 2) {
            throw new Exception();
        }
        cardDao.save(card);
    }

    public Card getById(int id) {
        return cardDao.getById(id);
    }

    public void update(Card card) {
        cardDao.update(card);
    }

    public void delete(int id) {
        cardDao.delete(id);

    }

    public void putMoney(Card card, int money) {
        card.setBalance(card.getBalance()+money);
        cardDao.update(card);
    }

    public void getMoney(Card card, int money) {
        card.setBalance(card.getBalance()-money);
        cardDao.update(card);
    }

}
