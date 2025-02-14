package com.example.yumhub.yumhub.controller;

import com.example.yumhub.yumhub.DTO.CartDto;
import com.example.yumhub.yumhub.services.cart.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping("/addToCart")
    public ResponseEntity<?> addToCart(@RequestBody CartDto dto) throws Exception {

        return ResponseEntity.status(HttpStatus.CREATED).body(cartService.addToCart(dto));
    }

    @PutMapping("/update-cart/{cartId}/{quantity}")
    public ResponseEntity<?> updateCart(@PathVariable UUID cartId,@PathVariable String quantity){
        int total = Integer.parseInt(quantity);
        return ResponseEntity.status(HttpStatus.OK).body(cartService.updateCart(cartId,total));
    }

    @DeleteMapping("/delete/{cartId}")
    public ResponseEntity<?> deleteCart(@PathVariable UUID cartId){
        return ResponseEntity.status(HttpStatus.OK).body(cartService.removeFromCart(cartId));
    }

    @DeleteMapping("/clear/{userId}")
    public ResponseEntity<?> clearCart(@PathVariable UUID userId){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(cartService.clearCart(userId));
    }

    @GetMapping("/{userId}")
    public ResponseEntity<?> getAllCartItems(@PathVariable UUID userId){
        return ResponseEntity.status(HttpStatus.OK).body(cartService.getAllCart(userId));
    }
}
