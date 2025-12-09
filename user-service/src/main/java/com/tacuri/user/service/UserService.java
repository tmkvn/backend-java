package com.tacuri.user.service;
import java.util.List;

import com.tacuri.user.domain.User;

public interface UserService {

    List<User>findAll();
    User save(User user);
}
