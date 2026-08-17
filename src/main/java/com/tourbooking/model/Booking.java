package com.tourbooking.model;

public class Booking {
    private int bookingNumber;      // 예약번호
    private String bookingName;     // 예약자명
    private String tourName;        // 투어명
    private TourType tourType;     // 투어 종류
    private int participants;       // 참가인원
    private int price;              // 가격

    public Booking(String bookingName, String tourName, TourType tourType, int participants, int price){
        this.bookingName = bookingName;
        this.tourName = tourName;
        this.tourType = tourType;
        this.participants = participants;
        this.price = price;


    }

}



