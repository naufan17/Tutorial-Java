package com.domain.login.dto;

import java.util.Optional;

// @Data
// @NoArgsConstructor
// @AllArgsConstructor
public class ApiResponse<T> {
  
  private String status;
  private String message;
  private Optional<T> data;

  public ApiResponse() {}

  public ApiResponse(String status, String message, Optional<T> data) {
    this.status = status;
    this.message = message;
    this.data = data;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Optional<T> getData() {
    return data;
  }

  public void setData(Optional<T> data) {
    this.data = data;
  }  
}
