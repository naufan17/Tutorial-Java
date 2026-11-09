package com.domain.login.services.article;

import java.util.List;
import java.util.Optional;

import com.domain.login.entity.Article;

public interface ArticleService {
  
  List<Article> findAll();

  Optional<Article> findById(Long id);

  Article save(Article article);

  Article update(Long id, Article article);

  void delete(Long id);
}
