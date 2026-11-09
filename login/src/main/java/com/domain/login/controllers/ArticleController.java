package com.domain.login.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.login.dto.ApiResponse;
import com.domain.login.entity.Article;
import com.domain.login.services.article.ArticleService;

@RestController
@RequestMapping("/articles")
public class ArticleController {
  
  @Autowired
  private ArticleService articleService;

  @GetMapping()
  public ResponseEntity<ApiResponse<List<Article>>> getAllArticles() {
    List<Article> articles = articleService.findAll();
    ApiResponse<List<Article>> response = new ApiResponse<>("success", "articles found", Optional.of(articles));

    return new ResponseEntity<>(response, HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<ApiResponse<Optional<Article>>> getArticleById(@PathVariable Long id) {
    Optional<Article> article = articleService.findById(id);
    ApiResponse<Optional<Article>> response = new ApiResponse<>("success", "article found", Optional.of(article));

    return new ResponseEntity<>(response, HttpStatus.OK);
  }

  @PutMapping("/{id}")
  public ResponseEntity<ApiResponse<Article>> updateArticle(@PathVariable Long id, @RequestBody Article article) {
    Article updatedArticle = articleService.update(id, article);
    ApiResponse<Article> response = new ApiResponse<>("success", "article updated", Optional.of(updatedArticle));

    return new ResponseEntity<>(response, HttpStatus.OK);    
  }

  @PostMapping()
  public ResponseEntity<ApiResponse<Article>> saveArticle(@RequestBody Article article) {
    Article savedArticle = articleService.save(article);
    ApiResponse<Article> response = new ApiResponse<>("success", "article saved", Optional.of(savedArticle));

    return new ResponseEntity<>(response, HttpStatus.OK);
  }

  @SuppressWarnings("rawtypes")
  @DeleteMapping("/{id}")
  public ResponseEntity<ApiResponse> deleteArticle(@PathVariable Long id) {
    articleService.delete(id);
    ApiResponse response = new ApiResponse<>("success", "article deleted", Optional.empty());

    return new ResponseEntity<>(response, HttpStatus.OK);
  }
}
