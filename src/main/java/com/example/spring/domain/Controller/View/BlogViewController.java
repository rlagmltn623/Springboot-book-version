package com.example.spring.domain.Controller.View;

import com.example.spring.domain.Article;
import com.example.spring.domain.Service.BlogService;
import com.example.spring.domain.dto.ArticleListViewResponse;
import com.example.spring.domain.dto.ArticleViewResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class BlogViewController {

    private final BlogService blogService;



    @GetMapping("/articles")
    public String getArticles(Model model) {
        List<ArticleListViewResponse> articles = blogService.findAll()
                .stream()
                .map(ArticleListViewResponse::new)
                .toList();
        model.addAttribute("articles", articles);

        return "articleList";
    }

    @GetMapping("/articles/{id}")
    public String getArticle(@PathVariable Long id, Model model) {
        Article article = blogService.findById(id);
        model.addAttribute("article", new ArticleViewResponse(article));

        return "article";
    }

    // id 키를 가진 쿼리 파라미터의 값을 id 변수에 매핑(id는 없을 수도 있음)
    @GetMapping("/new-article")
    public String newArticle(@RequestParam(required = false) Long id, Model model){
        //쿼리 파라미터로 넘어온 id값은 newArticle( 메드의 long 타입 id 인자에 매핑한다.
        // id가 없을수도 있으므로 즉 id가 있으면 수정 없으면 생성이므로 id가 없는 경우 기본생성자를 이용해 빈
        //ArticleViewResponse 객체를 만들고 , id가 있으면 기존 값을 가져오는 finById() 메서드를 호출한다.
        if(id == null){ //id 없으면 생성
        model.addAttribute("article", new ArticleViewResponse());
        }else { //id가 없으면 수정
            Article article = blogService.findById(id);
            model.addAttribute("article", new ArticleViewResponse(article));
        }
        return "newArticle";
    }
}
