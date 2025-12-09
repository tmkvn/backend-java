package com.tacuri.user.controller.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tacuri.user.dto.UserDto;

@RequestMapping("/v1/users")
public interface UserAPI {

    @PostMapping
    ResponseEntity<UserDto> save(@RequestBody UserDto userDto);
    
}
