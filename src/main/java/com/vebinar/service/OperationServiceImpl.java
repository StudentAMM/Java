package com.vebinar.service;

import com.vebinar.dao.OperationDao;
import com.vebinar.entity.Card;
import com.vebinar.entity.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Service
public class OperationServiceImpl implements OperationService {

    @Autowired
    public OperationDao operationDao;

    public List<Operation> findAll(int id) {
        return operationDao.findAll(id);
    }
}
