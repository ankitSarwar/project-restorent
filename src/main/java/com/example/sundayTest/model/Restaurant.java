package com.example.sundayTest.model;

public class Restaurant {

    private String RestaurantName;
    private String RestaurantAddress;
    private String speciality;
    private int Numbers_Of_Varity;
    private int TotalStaff;
    private String phone_number;

    public Restaurant(String restaurantName, String restaurantAddress, String speciality, int numbers_Of_Varity, int totalStaff, String phone_number) {
        RestaurantName = restaurantName;
        RestaurantAddress = restaurantAddress;
        this.speciality = speciality;
        Numbers_Of_Varity = numbers_Of_Varity;
        TotalStaff = totalStaff;
        this.phone_number = phone_number;
    }

    public String getRestaurantName() {
        return RestaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        RestaurantName = restaurantName;
    }

    public String getRestaurantAddress() {
        return RestaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        RestaurantAddress = restaurantAddress;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getNumbers_Of_Varity() {
        return Numbers_Of_Varity;
    }

    public void setNumbers_Of_Varity(int numbers_Of_Varity) {
        Numbers_Of_Varity = numbers_Of_Varity;
    }

    public int getTotalStaff() {
        return TotalStaff;
    }

    public void setTotalStaff(int totalStaff) {
        TotalStaff = totalStaff;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
