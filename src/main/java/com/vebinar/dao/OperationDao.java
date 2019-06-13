package com.vebinar.dao;

import com.vebinar.entity.Card;
import com.vebinar.entity.Operation;

import java.util.List;

public interface OperationDao {
    List<Operation> findAll(int id);
}
