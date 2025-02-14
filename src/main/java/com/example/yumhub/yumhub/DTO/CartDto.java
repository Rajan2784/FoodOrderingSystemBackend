package com.example.yumhub.yumhub.DTO;

import java.util.UUID;

public class CartDto {
    private UUID foodId;
    private UUID userId;
    private int quantity;

    // Getters and Setters

    public UUID getFoodId() {
        return foodId;
    }

    public void setFoodId(UUID foodId) {
        this.foodId = foodId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }
}

