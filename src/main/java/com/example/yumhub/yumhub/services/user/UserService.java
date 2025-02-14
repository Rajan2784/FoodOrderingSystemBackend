package com.example.yumhub.yumhub.services.user;

import com.example.yumhub.yumhub.models.User;

import java.util.UUID;

public interface UserService {
    User registerUser(User user);
    String loginUser(String email,String password);
    User getUserById(UUID userId);
}
