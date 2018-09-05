package com.zerosolutions.hbs.bookingmanagement;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import com.zerosolutions.hbs.roommanagement.BookingDetails;
import com.zerosolutions.hbs.roommanagement.Room;
import com.zerosolutions.hbs.roommanagement.RoomManagement;

import static org.mockito.Mockito.*;

public class BookingManagementTest {

	@Mock
	RoomManagement roomManagement;
	
	

	BookingManagement bookingManagement;

	@Before
	public void setUp() throws Exception {
		bookingManagement = new BookingManagement();
		MockitoAnnotations.initMocks(this);
		bookingManagement.setRoomManagement(roomManagement);
		when(roomManagement.getAvailableRooms(any(LocalDate.class), any(LocalDate.class)))
				.thenAnswer(new Answer<List<Room>>() {

					@Override
					public List<Room> answer(InvocationOnMock invocation) throws Throwable {
						
						Room room101 = mock(Room.class);
						room101.setBookingDetails(null);
						Room room201 = mock(Room.class);
						BookingDetails bookingDetails201 = mock(BookingDetails.class);
						bookingDetails201.setCheckInDate(LocalDate.of(2018, 9, 5));
						bookingDetails201.setCheckOutDate(LocalDate.of(2018, 9, 7));
						room201.setBookingDetails(bookingDetails201);
						Room room301 = mock(Room.class);
						BookingDetails bookingDetails301 = mock(BookingDetails.class);
						bookingDetails301.setCheckInDate(LocalDate.of(2018, 9, 7));
						bookingDetails301.setCheckOutDate(LocalDate.of(2018, 9, 8));
						room301.setBookingDetails(bookingDetails301);
						List<Room> availableRooms = new ArrayList<>();
						availableRooms.add(room101);
						availableRooms.add(room201);
						availableRooms.add(room301);
						return availableRooms;
					}
				});
	}

	@Test
	public void testSaveBooking() {
		bookingManagement.saveBooking("Peter", 35, LocalDate.of(2018, 11, 12), LocalDate.of(2018, 11, 16));
		assertEquals(1, bookingManagement.getBookings().size());
	}

	@Test
	public void testShowAvailableRooms() {
		bookingManagement.showAvailableRooms(LocalDate.of(2018, 9, 9), LocalDate.of(2018, 9, 11));
		verify(roomManagement).getAvailableRooms(any(LocalDate.class), any(LocalDate.class));
		assertEquals(3, bookingManagement.showAvailableRooms(LocalDate.of(2018, 9, 11), LocalDate.of(2018, 9, 12)).size());
		bookingManagement.saveBooking("Philip", 45, LocalDate.of(2018, 9, 10), LocalDate.of(2018, 9, 11));
	}

}
