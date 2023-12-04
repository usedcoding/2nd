package com.example.nd.article;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.security.auth.Subject;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public List<Article> getList() {
        return this.articleRepository.findAll();
    }
    public void create(String subject, String content) {
    Article article = new Article();
    article.setSubject(subject);
    article.setContent(content);
    article.setCreateDate(LocalDateTime.now());

    articleRepository.save(article);
    }

    public Article getArticle(Integer id) {
        Optional<Article> article = this.articleRepository.findById(id);
        return article.get();
    }

    public void modify(Article article, String subject, String content) {
        article.setSubject(subject);
        article.setContent(content);
        article.setCreateDate(LocalDateTime.now());

        this.articleRepository.save(article);

    }

    public void delete(Article article) {
        this.articleRepository.delete(article);
    }

}
