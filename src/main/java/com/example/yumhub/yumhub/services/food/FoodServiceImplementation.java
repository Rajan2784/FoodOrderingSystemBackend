package com.example.yumhub.yumhub.services.food;

import com.example.yumhub.yumhub.DTO.FoodDTO;
import com.example.yumhub.yumhub.models.Foods;
import com.example.yumhub.yumhub.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoodServiceImplementation implements FoodService {
    @Autowired
    private FoodRepository foodRepository;

    @Override
    public String addFoods(FoodDTO foodDTO) {
        System.out.println("FoodDTO: " + foodDTO);
        Foods foods = new Foods();
        foods.setFoodCategory(foodDTO.getFoodCategory());
        foods.setFoodDescription(foodDTO.getFoodDescription());
        foods.setFoodImage(foodDTO.getFoodImage());
        foods.setFoodName(foodDTO.getFoodName());
        foods.setFoodStatus(foodDTO.getFoodStatus());
        foods.setFoodType(foodDTO.getFoodType());
        foods.setPrice(foodDTO.getPrice());
        foods.setDiscount(foodDTO.getDiscount());
        foodRepository.save(foods);
        return "Food Details Uploaded!";
    }

    @Override
    public List<Foods> getAllFoods() {
        return foodRepository.findAll();
    }
}
