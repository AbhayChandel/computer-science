package com.zerosolutions.hbs.roommanagement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zerosolutions.hbs.common.CustomerDetails;

public class RoomManagement {

	Map<Integer, Room> rooms;

	public RoomManagement() {
		rooms = new HashMap<>();
		rooms.put(101, new Room(101));
		rooms.put(201, new Room(201));
		rooms.put(301, new Room(301));
	}

	public boolean isRoomOccupied(int roomNo) {
		return rooms.get(roomNo).isOccupied();
	}

	public void setRoomOccupied(int roomNo, BookingDetails bookingDetails, CustomerDetails customerDetails) {
		Room room = rooms.get(roomNo);
		room.setBookingDetails(bookingDetails);
		room.setCustomerDetails(customerDetails);
		room.setOccupied(true);
	}

	public List<Room> getAvailableRooms(LocalDate bookingCheckInDate, LocalDate bookingCheckOutDate) {
		List<Room> availableRooms = new ArrayList<>();
		for (Map.Entry<Integer, Room> roomEntry : rooms.entrySet()) {
			if (!roomEntry.getValue().isOccupied()) {
				availableRooms.add(roomEntry.getValue());
				continue;
			}
			LocalDate roomCheckedInDate = roomEntry.getValue().getBookingDetails().getCheckInDate();
			LocalDate roomCheckOutDate = roomEntry.getValue().getBookingDetails().getCheckOutDate();
			if ((bookingCheckInDate.isBefore(roomCheckedInDate) || bookingCheckInDate.isAfter(roomCheckedInDate))
					&& (bookingCheckInDate.isBefore(roomCheckOutDate)
							|| bookingCheckInDate.isAfter(roomCheckOutDate))) {
				availableRooms.add(roomEntry.getValue());
			}
		}
		return availableRooms;
	}

}
