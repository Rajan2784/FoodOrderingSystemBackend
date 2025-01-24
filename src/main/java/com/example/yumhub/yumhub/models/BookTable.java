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
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class BookTable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID bookingTableId;
    private String bookingUsername;
    private String phoneNumber;
    private int tablesCount;
    private int peopleCount;
    private String bookingDate;
    private String bookingMessage;
}
