package com.example.spring.springbootdeveloper;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED) //기본 생성자
@AllArgsConstructor
@Getter
@Setter
@Entity // 엔티티로 지정
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id; // DB 테이블 'ID' 컬럼과 매칭

    @Column(name = "name", nullable = false) // name이라는 not null 컬럼과 매핑
    private String name;

}
