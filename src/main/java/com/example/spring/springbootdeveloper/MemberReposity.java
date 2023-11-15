package com.example.spring.springbootdeveloper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberReposity extends JpaRepository<Member, Long> {

}
