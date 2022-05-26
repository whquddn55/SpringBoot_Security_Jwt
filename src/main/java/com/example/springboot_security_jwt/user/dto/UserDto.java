package com.example.springboot_security_jwt.user.dto;

import com.example.springboot_security_jwt.user.model.*;
import com.fasterxml.jackson.annotation.*;
import lombok.*;

import javax.validation.constraints.*;
import java.util.*;
import java.util.stream.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    @NotNull
    @Size(min = 3, max = 50)
    private String email;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull
    @Size(min = 3, max = 100)
    private String password;

    @NotNull
    @Size(min = 3, max = 50)
    private String nickname;

    private Set<AuthorityDto> authorityDtoSet;

    public static UserDto from(User user) {
        if(user == null) return null;

        return UserDto.builder()
        .email(user.getEmail())
        .nickname(user.getNickname())
        .authorityDtoSet(user.getAuthorities().stream()
        .map(authority -> AuthorityDto.builder().authorityName(authority.getAuthorityName()).build())
        .collect(Collectors.toSet()))
        .build();
    }
}
