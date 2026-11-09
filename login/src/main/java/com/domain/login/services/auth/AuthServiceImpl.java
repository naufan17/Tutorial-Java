package com.domain.login.services.auth;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.domain.login.dto.auth.LoginRequest;
import com.domain.login.dto.auth.RegisterRequest;
import com.domain.login.entity.User;
import com.domain.login.exception.NotFoundException;
import com.domain.login.repository.UserRepository;
import com.domain.login.utils.JwtUtil;

@Service
public class AuthServiceImpl implements AuthService {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private BCryptPasswordEncoder passwordEncoder;

  @Autowired
  private JwtUtil jwtUtil;

  @Override
  public User register(RegisterRequest request) {
    if (userRepository.existsByUsername(request.getUsername())) throw new NotFoundException("user already exists");

    User newUser = new User(request.getName(), request.getUsername(), passwordEncoder.encode(request.getPassword()));
    userRepository.save(newUser);

    return newUser;
  }

  @Override
  public Optional<String> login(LoginRequest request) {
    Optional<User> user = userRepository.findByUsername(request.getUsername());

    if (!user.isPresent()) throw new NotFoundException("user not found");

    if (passwordEncoder.matches(request.getPassword(), user.get().getPassword())) {
      String token = jwtUtil.generateToken(user.get().getUser_id());

      return Optional.of(token);
    }

    return Optional.empty();    
  }

  @Override
  public Boolean logout() {
    return true;
  }
}
