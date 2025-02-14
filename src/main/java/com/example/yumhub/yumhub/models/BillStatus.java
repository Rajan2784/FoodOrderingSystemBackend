package com.example.yumhub.yumhub.models;

import jakarta.persistence.*;


import java.util.UUID;

@Entity
public class BillStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID billId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false) // Many BillStatus entities can belong to one User
    @JoinColumn(name = "user_id") // Maps to the 'id' column in the User table
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

    public String getBillAddress() {
        return billAddress;
    }

    public void setBillAddress(String billAddress) {
        this.billAddress = billAddress;
    }

    public int getBillDelivery() {
        return billDelivery;
    }

    public void setBillDelivery(int billDelivery) {
        this.billDelivery = billDelivery;
    }

    public int getBillDiscount() {
        return billDiscount;
    }

    public void setBillDiscount(int billDiscount) {
        this.billDiscount = billDiscount;
    }

    public UUID getBillId() {
        return billId;
    }

    public void setBillId(UUID billId) {
        this.billId = billId;
    }

    public String getBillMethod() {
        return billMethod;
    }

    public void setBillMethod(String billMethod) {
        this.billMethod = billMethod;
    }

    public String getBillPaid() {
        return billPaid;
    }

    public void setBillPaid(String billPaid) {
        this.billPaid = billPaid;
    }

    public String getBillPhone() {
        return billPhone;
    }

    public void setBillPhone(String billPhone) {
        this.billPhone = billPhone;
    }

    public int getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(int billStatus) {
        this.billStatus = billStatus;
    }

    public int getBillTotal() {
        return billTotal;
    }

    public void setBillTotal(int billTotal) {
        this.billTotal = billTotal;
    }

    public String getBillWhen() {
        return billWhen;
    }

    public void setBillWhen(String billWhen) {
        this.billWhen = billWhen;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
