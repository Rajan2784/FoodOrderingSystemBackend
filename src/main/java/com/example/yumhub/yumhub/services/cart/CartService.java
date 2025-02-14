package com.example.yumhub.yumhub.services.cart;

import com.example.yumhub.yumhub.DTO.CartDto;
import com.example.yumhub.yumhub.models.Cart;

import java.util.List;
import java.util.UUID;

public interface CartService {
    Cart addToCart(CartDto cartDto) throws Exception;
    Cart updateCart(UUID cartId,int quantity);
    String removeFromCart(UUID cartId);
    String clearCart(UUID userId);
    List<Cart> getAllCart(UUID userId);
}
