package com.tourbooking.repository;

import com.tourbooking.model.Booking;

import java.util.ArrayList;
import java.util.List;

public class BookingRepository {

    private final List<Booking> bookings = new ArrayList<>();
    private int nextBookingNumber = 1;
    //save 메소드 = 접수 절차
    public Booking save(Booking booking) {
        booking.setBookingNumber(nextBookingNumber);    // 예약번호 찍음
        nextBookingNumber++;                            // 예약번호 숫자 1 증가시킴
        bookings.add(booking);                          // bookings에 넣음
        return booking;                                 // 번호 찍힌 객체(예약카드) 돌려줌


    }


}

