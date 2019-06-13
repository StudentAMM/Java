package com.vebinar.dao;

import com.vebinar.entity.Card;

import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface CardDao{

    void save(Card card);

    Card getById(int id);

    List<Card> findAll();

    void update(Card card);

    void delete(int id);

}
