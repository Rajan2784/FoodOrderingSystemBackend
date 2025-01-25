package com.example.yumhub.yumhub.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;
@Entity
public class Foods {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID foodId;
    private String foodCategory;
    private String foodDescription;
    private String foodImage;
    private String foodName;
    private String foodStatus;
    private String foodType;
    private double price;
    private double discount;

    // Getter methods
    public String getFoodCategory() {
        return foodCategory;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public String getFoodImage() {
        return foodImage;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getFoodStatus() {
        return foodStatus;
    }

    public String getFoodType() {
        return foodType;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setFoodId(UUID foodId) {
        this.foodId = foodId;
    }

    public void setFoodCategory(String foodCategory) {
        this.foodCategory = foodCategory;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }

    public void setFoodImage(String foodImage) {
        this.foodImage = foodImage;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setFoodStatus(String foodStatus) {
        this.foodStatus = foodStatus;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
