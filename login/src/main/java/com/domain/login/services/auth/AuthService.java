package com.domain.login.services.auth;

import java.util.Optional;

import com.domain.login.dto.auth.LoginRequest;
import com.domain.login.dto.auth.RegisterRequest;
import com.domain.login.entity.User;

public interface AuthService {

  User register(RegisterRequest request);

  Optional<String> login(LoginRequest request);

  Boolean logout();
}
