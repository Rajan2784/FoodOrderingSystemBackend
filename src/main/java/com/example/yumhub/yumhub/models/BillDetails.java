package com.example.yumhub.yumhub.models;

import jakarta.persistence.*;
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
public class BillDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID billDetailsId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "food_id")
    private Foods food;

    private int item_quantity;

}
