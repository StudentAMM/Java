package com.vebinar.dao;

import com.vebinar.entity.Operation;
import com.vebinar.mapper.OperationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class OperationDaoImpl implements OperationDao {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    public List<Operation> findAll(int id) {
        String sql = "SELECT * FROM public.\"Operation\" where card = " + id;
        return jdbcTemplate.query(sql, new OperationMapper());
    }
}
