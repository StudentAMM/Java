package com.vebinar.mapper;

import com.vebinar.entity.Card;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CardMapper implements RowMapper<Card> {

    public Card mapRow(ResultSet resultSet, int i) throws SQLException {
        Card card = new Card();
        card.setId(resultSet.getInt("id"));
        card.setFIO(resultSet.getString("FIO"));
        card.setBalance(resultSet.getInt("balance"));
        return card;
    }
}
