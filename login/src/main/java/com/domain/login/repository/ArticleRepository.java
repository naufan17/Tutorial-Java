package com.domain.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.domain.login.entity.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {}
