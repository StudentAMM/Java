package com.vebinar.dao;

import com.vebinar.entity.Card;
import com.vebinar.mapper.CardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CardDaoImpl implements CardDao {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    public void save(Card card) {
        String sql = "insert into public.\"Card\" (\"FIO\", \"balance\") values(?,?)";
        jdbcTemplate.update(sql, card.getFIO(), card.getBalance());

    }

    public Card getById(int id) {
        //String sql = "SELECT * FROM Card WHERE id=?";
        String sql = "select t.* FROM public.\"Card\" as t where t.id =?" ;
        return jdbcTemplate.queryForObject(sql, new CardMapper(), id);
    }

    public List<Card> findAll() {
        //String sql = "SELECT * FROM Card";
        String sql = "select t.* FROM public.\"Card\" as t";
        return jdbcTemplate.query(sql, new CardMapper());
    }

    public void update(Card card) {
        String sql = "UPDATE public.\"Card\" SET \"FIO\"=?, \"balance\"=? where \"id\"=?";
        jdbcTemplate.update(sql, card.getFIO(), card.getBalance(), card.getId());
    }

    public void delete(int id) {
        String sql = "DELETE FROM public.\"Card\" WHERE id=?";
        jdbcTemplate.update(sql, id);

    }
}
