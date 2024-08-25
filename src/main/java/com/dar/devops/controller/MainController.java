package com.dar.devops.controller;

import com.dar.devops.pojo.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {

    @GetMapping("/getNames")
    public ResponseEntity<List<String>> getNames(){
        List<String> list = Arrays.asList("Sachin","Kohli","Dhoni");
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/getUsers")
    public ResponseEntity<List<User>> getUsers(){
        List<User> list = new ArrayList<>();
        User u1 = new User("Dboss",43,"1977","Mysore","Actor");
        User u2 = new User("Power Start",46,"1975","Bangalore","Actor");
        User u3 = new User("Sachin",45,"1972","Mumbai","Cricketer");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
