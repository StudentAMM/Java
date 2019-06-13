/*
package com.vebinar.dao;

import com.vebinar.entity.Operation;
import org.springframework.data.jdbc.repository.query.Query;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

public interface OperationRepository extends JpaRepository<Operation, Long> {
    //String sql = "SELECT * FROM public.\"Operation\" where card = " + id;
    @Query("select * from Operation")
    Iterable<Operation> myFind();
}
*/
