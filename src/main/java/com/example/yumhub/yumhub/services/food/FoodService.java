package com.example.yumhub.yumhub.services.food;

import com.example.yumhub.yumhub.DTO.FoodDTO;
import com.example.yumhub.yumhub.models.Foods;

import java.util.List;

public interface FoodService {
    String addFoods(FoodDTO foodDTO);
    List<Foods> getAllFoods();
}
