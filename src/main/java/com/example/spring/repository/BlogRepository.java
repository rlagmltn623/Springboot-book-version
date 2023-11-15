package com.example.spring.repository;

import com.example.spring.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

//PK 타입을 LONG 인수로 넣어 이제 이 리포지토리를 사용할때
// JpaRepository에서 제공하는 여러메서드를 사용할 수 있다.
public interface BlogRepository extends JpaRepository<Article, Long> {
}
