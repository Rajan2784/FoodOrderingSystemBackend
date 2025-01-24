package com.example.yumhub.yumhub.repository;

import com.example.yumhub.yumhub.models.BillDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BillDetailsRepository extends JpaRepository<BillDetails, UUID> {
}
