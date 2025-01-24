package com.example.yumhub.yumhub.repository;

import com.example.yumhub.yumhub.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
