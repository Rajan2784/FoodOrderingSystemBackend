package com.example.yumhub.yumhub.repository;

import com.example.yumhub.yumhub.models.Cart;
import com.example.yumhub.yumhub.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
@Repository
public interface CartRepository extends JpaRepository<Cart, UUID> {
    @Transactional
    @Modifying
    void deleteByUserId(User user);

    List<Cart> findAllByUserId(User user);
}
