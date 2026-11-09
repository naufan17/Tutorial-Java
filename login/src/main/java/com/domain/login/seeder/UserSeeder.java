// package com.domain.login.seeder;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.stereotype.Component;

// import com.domain.login.entity.User;
// import com.domain.login.repository.UserRepository;

// @Component
// public class UserSeeder implements CommandLineRunner {

//   @Autowired
//   private final UserRepository userRepository;

//   @Autowired
//   private BCryptPasswordEncoder passwordEncoder;

//   public UserSeeder(UserRepository userRepository) {
//     this.userRepository = userRepository;
//   }

//   @Override
//   public void run(String... args) throws Exception {
//     userRepository.deleteAll();

//     for (int i = 0; i < 10; i++) {
//       User user = new User("user" + i, "username" + i, passwordEncoder.encode("password" + i));
//       userRepository.save(user);
//     }
//   }
  
// }
