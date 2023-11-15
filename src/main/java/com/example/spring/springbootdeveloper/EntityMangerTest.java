package com.example.spring.springbootdeveloper;


import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;

public class EntityMangerTest {
    @Autowired
    EntityManager em;

    public void example(){
        //1. 엔티티 매니저가 엔티티를 관리하지 않은 상태(비영속 상태)
        Member member = new Member(1L, "홀기동");

        //2. 엔티티가 관리 상태가 된다(관리 상태)
        em.persist(member);
        //3.엔티티 객체가 분리된 상태가 된다. (분리상태)
        em.detach(member);
        //4. 엔티티 객체가 삭제된 상태가 된다.
        em.remove(member);
    }
}
