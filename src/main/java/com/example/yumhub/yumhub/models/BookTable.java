package com.example.yumhub.yumhub.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;
@Entity

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

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getBookingMessage() {
        return bookingMessage;
    }

    public void setBookingMessage(String bookingMessage) {
        this.bookingMessage = bookingMessage;
    }

    public UUID getBookingTableId() {
        return bookingTableId;
    }

    public void setBookingTableId(UUID bookingTableId) {
        this.bookingTableId = bookingTableId;
    }

    public String getBookingUsername() {
        return bookingUsername;
    }

    public void setBookingUsername(String bookingUsername) {
        this.bookingUsername = bookingUsername;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getTablesCount() {
        return tablesCount;
    }

    public void setTablesCount(int tablesCount) {
        this.tablesCount = tablesCount;
    }
}
