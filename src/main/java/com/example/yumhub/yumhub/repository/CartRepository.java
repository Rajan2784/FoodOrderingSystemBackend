package com.example.yumhub.yumhub.repository;

import com.example.yumhub.yumhub.models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CartRepository extends JpaRepository<Cart, UUID> {
}
