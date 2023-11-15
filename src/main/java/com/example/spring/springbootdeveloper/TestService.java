package com.example.spring.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    MemberReposity memberReposity; //빈 주입

    public List<Member> getAllMembers(){
        return memberReposity.findAll();
    }

}
