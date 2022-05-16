package com.booking;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.booking.models.Booking;
import com.booking.service.BookingService;
import com.booking.service.SequenceGeneratorservice;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/booking")
@RestController
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	
	@Autowired
	private SequenceGeneratorservice sequenceGeneratorservice;

	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public ResponseEntity<Void> addBooking(@RequestBody Booking booking) {
		try {
			booking.setBookingId(sequenceGeneratorservice.getSequenceNumber(Booking.SEQUENCE_NAME));
			bookingService.addBooking(booking);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/update/{bookingId}")
	public ResponseEntity<Void> updateBooking(@RequestBody Booking booking, @PathVariable(value = "bookingId") int bookingId) {
		try {
			bookingService.updateBooking(booking,bookingId);
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/{bookingId}")
	public ResponseEntity<Void> deleteBooking( @PathVariable(value = "bookingId") int bookingId) {
		try {
			bookingService.deleteBooking(bookingId);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Booking>> getAllBookings(){
		List<Booking> list = bookingService.getAllBookings();
		if(list.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));
	}
	
	@GetMapping("/get/{bookingId}")
	public ResponseEntity<Optional<Booking>> getBookingById(@PathVariable(value = "bookingId") int bookingId){
		
		try {
			Optional<Booking> booking = bookingService.getBookingById(bookingId);
			if(booking==null) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			else {
				return ResponseEntity.of(Optional.of(booking));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
