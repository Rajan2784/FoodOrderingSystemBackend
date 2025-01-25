package com.example.yumhub.yumhub.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class BillDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID billDetailsId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "food_id")
    private Foods food;

    private int item_quantity;

    public UUID getBillDetailsId() {
        return billDetailsId;
    }

    public void setBillDetailsId(UUID billDetailsId) {
        this.billDetailsId = billDetailsId;
    }

    public Foods getFood() {
        return food;
    }

    public void setFood(Foods food) {
        this.food = food;
    }

    public int getItem_quantity() {
        return item_quantity;
    }

    public void setItem_quantity(int item_quantity) {
        this.item_quantity = item_quantity;
    }
}
