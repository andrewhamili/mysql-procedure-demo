package com.andrewhamili.mysqlproceduredemo.repository;

import com.andrewhamili.mysqlproceduredemo.entity.UserSummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.StoredProcedureQuery;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserSummaryRepository {

    @PersistenceContext(type = PersistenceContextType.EXTENDED)
    private EntityManager entityManager;

    public List<UserSummary> UserSummary_ViewList(){

        List<UserSummary> userSummaryList = new ArrayList<>();

        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery("UserSummary_ViewList", "UserSummary");

        try{

            storedProcedureQuery.registerStoredProcedureParameter(0, Long.class, ParameterMode.IN);

            storedProcedureQuery.setParameter(0, 0L);

            storedProcedureQuery.execute();

            userSummaryList = storedProcedureQuery.getResultList();

        }catch (Exception e){
            e.printStackTrace();
        }

        return userSummaryList;

    }


}
