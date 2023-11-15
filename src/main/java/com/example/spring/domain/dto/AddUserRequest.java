package com.example.spring.domain.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class AddUserRequest {
  private String email;
  private String password;
}
