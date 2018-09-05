package com.zerosolutions.hbs.bookingmanagement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.zerosolutions.hbs.roommanagement.Room;
import com.zerosolutions.hbs.roommanagement.RoomManagement;

public class BookingManagement {

	List<Booking> bookings;
	RoomManagement roomManagement;

	BookingManagement() {
		bookings = new ArrayList<>();
		roomManagement = new RoomManagement();
	}

	public List<Booking> getBookings() {
		return bookings;
	}
	
	public void setRoomManagement(RoomManagement roomManagement) {
		this.roomManagement = roomManagement;
	}

	public void saveBooking(String name, int age, LocalDate checkInDate, LocalDate checkOutDate) {
		bookings.add(new Booking(LocalDate.now(), checkInDate, checkOutDate, name, age));
	}

	public List<Room> showAvailableRooms(LocalDate checkInDate, LocalDate checkOutDate) {
		List<Room> availableRooms = roomManagement.getAvailableRooms(checkInDate, checkOutDate);
		return availableRooms;
	}
}
