package com.example.yumhub.yumhub.repository;

import com.example.yumhub.yumhub.models.BookTable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookTableRepository extends JpaRepository<BookTable, UUID> {
}
