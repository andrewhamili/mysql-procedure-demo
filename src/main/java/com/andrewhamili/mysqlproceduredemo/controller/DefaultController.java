package com.andrewhamili.mysqlproceduredemo.controller;

import com.andrewhamili.mysqlproceduredemo.entity.UserSummary;
import com.andrewhamili.mysqlproceduredemo.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("")
public class DefaultController {

    @Autowired
    private FirstService firstService;

    @GetMapping("/users")
    public ResponseEntity<List<UserSummary>> getUsers(){
        return new ResponseEntity<>(firstService.getUserSummary(), HttpStatus.OK);
    }

}
