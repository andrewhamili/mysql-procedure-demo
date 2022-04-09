package com.andrewhamili.mysqlproceduredemo.service;

import com.andrewhamili.mysqlproceduredemo.entity.UserSummary;
import com.andrewhamili.mysqlproceduredemo.repository.UserSummaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FirstService {

    @Autowired
    private UserSummaryRepository userSummaryRepository;

    public List<UserSummary> getUserSummary(){
        return userSummaryRepository.UserSummary_ViewList();
    }

}
