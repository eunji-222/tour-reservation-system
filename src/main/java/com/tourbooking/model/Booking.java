package com.tourbooking.model;

public class Booking {
    private int bookingNumber;      // 예약번호: 시스템이 나중에 부여해줌
    private String bookingName;     // 예약자명
    private String tourName;        // 투어명
    private TourType tourType;     // 투어 종류: 내가 만든 타입
    private int participants;       // 참가인원
    private int price;              // 가격

    //생성자 = 예약번호를 제외한 5개
    public Booking(String bookingName, String tourName, TourType tourType, int participants, int price){
        this.bookingName = bookingName;
        this.tourName = tourName;
        this.tourType = tourType;
        this.participants = participants;
        this.price = price;

    }

    public int getBookingNumber() {

        return bookingNumber;
    }

    public String getBookingName() {

        return bookingName;
    }

    public String getTourName() {
        return tourName; }

    public TourType getTourType() {

        return tourType;
    }

    public int getParticipants() {

        return participants;
    }

    public int getPrice() {

        return price;
    }

    public void setBookingNumber(int bookingNumber){

        this.bookingNumber = bookingNumber;
    }


}



