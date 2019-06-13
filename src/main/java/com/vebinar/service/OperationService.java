package com.vebinar.service;

import com.vebinar.entity.Card;
import com.vebinar.entity.Operation;

import java.util.List;

public interface OperationService {

    List<Operation> findAll(int id);

}
