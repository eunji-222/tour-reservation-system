package com.tourbooking.repository;

import com.tourbooking.model.Booking;

import java.util.ArrayList;
import java.util.List;

public class BookingRepository {

    private final List<Booking> bookings = new ArrayList<>();
    private int nextBookingNumber = 1;

}
