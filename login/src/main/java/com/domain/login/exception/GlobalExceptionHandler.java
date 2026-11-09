package com.domain.login.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.domain.login.dto.ApiResponse;

@ControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(ConflictException.class)
  public ResponseEntity<ApiResponse<Object>> handleConflictException(ConflictException exception) {
    ApiResponse<Object> response = new ApiResponse<>("error", exception.getMessage(), null);
    return new ResponseEntity<>(response, HttpStatus.CONFLICT);
  }

  @ExceptionHandler(AccessDeniedException.class)
  public ResponseEntity<ApiResponse<Object>> handleAccessDeniedException(AccessDeniedException exception) {
    ApiResponse<Object> response = new ApiResponse<>("error", "unauthorized request", null);
    return new ResponseEntity<>(response, HttpStatus.FORBIDDEN);
  }
  
  @ExceptionHandler(NoHandlerFoundException.class)
  public ResponseEntity<ApiResponse<Object>> handleRouteNotFoundException(NoHandlerFoundException exception) {
    ApiResponse<Object> response = new ApiResponse<>("error", exception.getMessage(), null);
    return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
  }
  
  @ExceptionHandler(NotFoundException.class)
  public ResponseEntity<ApiResponse<Object>> handleNotFoundException(NotFoundException exception) {
    ApiResponse<Object> response = new ApiResponse<>("error", exception.getMessage(), null);
    return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
  }

  @ExceptionHandler(Exception.class)
  public ResponseEntity<ApiResponse<Object>> handleException(Exception exception) {
    ApiResponse<Object> response = new ApiResponse<>("error", exception.getMessage(), null);
    return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
  }
}
