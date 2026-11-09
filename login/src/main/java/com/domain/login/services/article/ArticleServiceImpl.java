package com.domain.login.services.article;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.login.entity.Article;
import com.domain.login.exception.NotFoundException;
import com.domain.login.repository.ArticleRepository;

@Service
public class ArticleServiceImpl implements ArticleService {

  @Autowired
  private ArticleRepository articleRepository;

  @Override
  public List<Article> findAll() {
    List<Article> articles = articleRepository.findAll();
    if (articles.isEmpty()) throw new NotFoundException("article not found");

    return articles;
  }

  @Override
  public Optional<Article> findById(Long id) {
    Optional<Article> article = articleRepository.findById(id);
    if (!article.isPresent()) throw new NotFoundException("article not found");

    return article;
  }

  @Override
  public Article update(Long id, Article article) {
    Article existingArticle = articleRepository.findById(id).orElse(null);
    if (existingArticle == null) throw new NotFoundException("article not found");

    existingArticle.setTitle(article.getTitle());
    existingArticle.setContent(article.getContent());
    existingArticle.setAuthor(article.getAuthor());

    return articleRepository.save(existingArticle);
  }

  @Override
  public Article save(Article article) {
    return articleRepository.save(article);
  }

  @Override
  public void delete(Long id) {
    Article article = articleRepository.findById(id).orElse(null);
    if (article == null) throw new NotFoundException("article not found");

    articleRepository.deleteById(id);
  }
}
