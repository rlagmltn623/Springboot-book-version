package com.example.spring.domain.dto;

import com.example.spring.domain.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;



//DTO는 단순하게 데이터를 옮기기 위해 사용하는 전달자 역할을 하는 객체이기 때문에
//별도의 비즈니스 로직을 포함하지 않는다.
@NoArgsConstructor // 기본 생성자 추가
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자 추가
@Getter
public class AddArticleRequest {

    private String title;
    private String content;


    public Article toEntity(String author){
        return Article.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }

}
