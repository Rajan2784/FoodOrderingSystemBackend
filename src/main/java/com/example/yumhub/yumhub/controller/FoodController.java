package com.example.yumhub.yumhub.controller;

import com.example.yumhub.yumhub.DTO.FoodDTO;
import com.example.yumhub.yumhub.services.food.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/foods")
@CrossOrigin("*")
public class FoodController {
    @Autowired
    private FoodService foodService;

    @PostMapping("/upload")
    public ResponseEntity<?> saveFoods(@RequestBody FoodDTO foodDTO){
        String response = foodService.addFoods(foodDTO);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<?> getAllFoods(){
        return ResponseEntity.ok(foodService.getAllFoods());
    }
}
