package com.example.yumhub.yumhub.models;

import jakarta.persistence.*;
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
public class BillStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID) // Matches the INT primary key auto-increment behavior
    private UUID billId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false) // Many BillStatus entities can belong to one User
    @JoinColumn(name = "user_id", nullable = false) // Maps to the 'id' column in the User table
    private User user;

    private String billPhone;

    private String billAddress;

    private String billWhen;

    private String billMethod;

    private int billDiscount;

    private int billDelivery;

    private int billTotal;

    private String billPaid;

    private int billStatus;
}
