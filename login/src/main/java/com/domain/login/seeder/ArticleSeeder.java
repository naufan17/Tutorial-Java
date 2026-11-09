// package com.domain.login.seeder;

// import org.springframework.boot.CommandLineRunner;
// import org.springframework.stereotype.Component;

// import com.domain.login.entity.Article;
// import com.domain.login.repository.ArticleRepository;

// @Component
// public class ArticleSeeder implements CommandLineRunner {

//   private final ArticleRepository articleRepository;

//   public ArticleSeeder(ArticleRepository articleRepository) {
//     this.articleRepository = articleRepository;
//   }

//   @Override
//   public void run(String... args) throws Exception {
//     articleRepository.deleteAll();
    
//     for (int i = 0; i < 10; i++) {
//       Article article = new Article("title" + i, "content" + i, "author" + i);
//       articleRepository.save(article);
//     }
//   }
// }
