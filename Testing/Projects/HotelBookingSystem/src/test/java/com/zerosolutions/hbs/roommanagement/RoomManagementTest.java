package com.zerosolutions.hbs.roommanagement;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

import com.zerosolutions.hbs.common.CustomerDetails;

public class RoomManagementTest {

	RoomManagement roomManagement;

	@Mock
	BookingDetails bookingDetails101, bookingDetails201;

	@Mock
	CustomerDetails customerDetails101, customerDetails201;

	@Before
	public void setUp() throws Exception {
		roomManagement = new RoomManagement();
		MockitoAnnotations.initMocks(this);
		roomManagement.setRoomOccupied(101, bookingDetails101, customerDetails101);

	}

	@Test
	public void testIsRoomOccupied() {
		assertFalse(roomManagement.isRoomOccupied(201));
	}

	@Test
	public void testSetRoomOccupied() {
		assertTrue(roomManagement.isRoomOccupied(101));
	}

	@Test
	public void testGetAvailableRooms() {
		when(bookingDetails101.getCheckInDate()).thenReturn(LocalDate.of(2018, 9, 4));
		when(bookingDetails101.getCheckOutDate()).thenReturn(LocalDate.of(2018, 9, 6));
		assertEquals(3, roomManagement.getAvailableRooms(LocalDate.of(2018, 9, 8), LocalDate.of(2018, 9, 9)).size());
		
		roomManagement.setRoomOccupied(201, bookingDetails201, customerDetails201);
		when(bookingDetails201.getCheckInDate()).thenReturn(LocalDate.of(2018, 9, 9));
		when(bookingDetails201.getCheckOutDate()).thenReturn(LocalDate.of(2018, 9, 12));
		assertEquals(2, roomManagement.getAvailableRooms(LocalDate.of(2018, 9, 9), LocalDate.of(2018, 9, 9)).size());
	}

}
