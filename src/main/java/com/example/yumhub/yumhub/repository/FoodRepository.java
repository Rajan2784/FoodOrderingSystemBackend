package com.example.yumhub.yumhub.repository;

import com.example.yumhub.yumhub.models.Foods;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FoodRepository extends JpaRepository<Foods,UUID> {
}
