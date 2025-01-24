package com.example.yumhub.yumhub.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Foods {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID foodId;

    private String food_name;
    private String food_star;
    private String food_vote;
    private double price;
    private int discount;
    private String food_description;
    private String food_status;
    private String food_type;
    private String food_category;
    private String food_image;
}
