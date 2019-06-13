package com.vebinar.mapper;

import com.vebinar.entity.Operation;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OperationMapper implements RowMapper<Operation> {

    public Operation mapRow(ResultSet resultSet, int i) throws SQLException {
        Operation oper = new Operation();
        oper.setId(resultSet.getInt("id"));
        oper.setOperation(resultSet.getString("operation"));
        oper.setCard(resultSet.getInt("card"));
        oper.setDescr(resultSet.getString("descr"));
        oper.setDate(resultSet.getDate("date"));
        return oper;
    }
}
