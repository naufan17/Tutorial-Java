package com.domain.login.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.login.dto.ApiResponse;
import com.domain.login.dto.auth.LoginRequest;
import com.domain.login.dto.auth.RegisterRequest;
import com.domain.login.services.auth.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {

  @Autowired
  private AuthService authService;

  @PostMapping("/register")
  public ResponseEntity<ApiResponse<String>> register(@RequestBody RegisterRequest registerRequest) {
    authService.register(registerRequest);

    ApiResponse<String> response = new ApiResponse<>("success", "user registered", Optional.empty());

    return new ResponseEntity<>(response, HttpStatus.CREATED);
  }

  @PostMapping("/login")
  public ResponseEntity<ApiResponse<String>> login(@RequestBody LoginRequest loginRequest) {
    Optional<String> token = authService.login(loginRequest);

    ApiResponse<String> response = new ApiResponse<>("success", "user logged in", token);

    return new ResponseEntity<>(response, HttpStatus.OK);
  }

  @DeleteMapping("/logout")
  public ResponseEntity<ApiResponse<String>> logout() {
    ApiResponse<String> response = new ApiResponse<>("success", "user logged out", Optional.empty());

    return new ResponseEntity<>(response, HttpStatus.OK);
   }
}
