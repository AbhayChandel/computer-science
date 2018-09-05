package com.zerosolutions.hbs.roommanagement;

import com.zerosolutions.hbs.common.CustomerDetails;

public class Room {

	private final int roomNo;
	private boolean occupied;
	private BookingDetails bookingDetails = null;
	private CustomerDetails customerDetails = null;

	Room(int roomNo) {
		this.roomNo = roomNo;
		this.occupied = false;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

	public BookingDetails getBookingDetails() {
		return bookingDetails;
	}

	public void setBookingDetails(BookingDetails bookingDetails) {
		this.bookingDetails = bookingDetails;
	}

	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}

}
