package com.zerosolutions.hbs.roommanagement;

import java.time.LocalDate;

public class BookingDetails {

	int bookingId;
	LocalDate bookingDate;
	LocalDate checkInDate;
	LocalDate checkOutDate;
	
	public BookingDetails(int bookingId, LocalDate checkInDate, LocalDate checkoutDate) {
		this.bookingId = bookingId;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkoutDate;
		this.bookingDate = LocalDate.now();
	}

	public int getBookingId() {
		return bookingId;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public LocalDate getCheckInDate() {
		return checkInDate;
	}
	
	public void setCheckInDate(LocalDate checkInDate) {
		this.checkInDate = checkInDate;
	}

	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}
	
	public void setCheckOutDate(LocalDate checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	
	
}
