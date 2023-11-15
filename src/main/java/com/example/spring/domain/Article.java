package com.example.spring.domain;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;


@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "author", nullable = false)
    private String author;

    //엔티티에 생성, 수정 시간 추가하기
    @CreatedDate //엔티티가 생성될 때 생성 시간 저장
    @Column(name = "created_at")
    private LocalDateTime createAt;

    @LastModifiedDate //엔티티가 수정될 때 수정시간 저장
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Builder
    public Article(String author, String title, String content) {
        this.author =  author;
        this.title = title;
        this.content = content;
    }

    //글수정 방법
    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }

}
