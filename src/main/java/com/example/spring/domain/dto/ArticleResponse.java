package com.example.spring.domain.dto;

import com.example.spring.domain.Article;
import jakarta.persistence.Entity;
import lombok.Getter;

@Getter
public class ArticleResponse {

    private final String title;
    private final String content;

    public ArticleResponse(Article article) {
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}
