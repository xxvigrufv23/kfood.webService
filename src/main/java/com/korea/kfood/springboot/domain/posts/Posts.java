package com.korea.kfood.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter                  //LOMBOK 어노테이션
@NoArgsConstructor       //LOMBOK 어노테이션
@Entity   //JPA 어노테이션
public class Posts {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long userid;  //사용자 아이디

    @Column(length = 500, nullable = false)
    private String title;    //제목

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;    //내용

    private String author;   //글쓴이

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
