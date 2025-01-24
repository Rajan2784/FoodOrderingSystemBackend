package com.example.yumhub.yumhub.repository;

import com.example.yumhub.yumhub.models.BillStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BillStatusRepository extends JpaRepository<BillStatus, UUID> {
}
