package com.example.springboot_security_jwt.user.dto;

import com.example.springboot_security_jwt.user.model.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthorityDto {
    private AuthorityName authorityName;
}
