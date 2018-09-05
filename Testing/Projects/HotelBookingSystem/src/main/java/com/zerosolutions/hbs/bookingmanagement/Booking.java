package com.zerosolutions.hbs.bookingmanagement;

import java.time.LocalDate;

public class Booking {

	LocalDate bookingDate;
	LocalDate checkInDate;
	LocalDate checkOutDate;
	String firstName;
	int age;

	public Booking(LocalDate bookingDate, LocalDate checkInDate, LocalDate checkOutDate, String firstName, int age) {
		super();
		this.bookingDate = bookingDate;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.firstName = firstName;
		this.age = age;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
