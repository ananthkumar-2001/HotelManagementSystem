package com.guest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guest.models.Guest;
import com.guest.service.GuestService;
import com.guest.service.SequenceGeneratorservice;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(method = RequestMethod.GET, value = "/guest")
@RestController
public class GuestController {
	
	@Autowired
	private GuestService guestService;
	
	@Autowired
	private SequenceGeneratorservice sequenceGeneratorservice;

	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public ResponseEntity<Void> addGuest(@RequestBody Guest guest) {
		try {
			guest.setGuestId(sequenceGeneratorservice.getSequenceNumber(guest.SEQUENCE_NAME));
			guestService.addGuest(guest);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/update/{guestId}")
	public ResponseEntity<Void> updateGuest(@RequestBody Guest guest, @PathVariable(value = "guestId") int guestId) {
		try {
			guestService.updateGuest(guest,guestId);
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/{guestId}")
	public ResponseEntity<Void> deleteGuest(@PathVariable(value = "guestId") int guestId) {
		try {
			guestService.deleteGuest(guestId);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Guest>> getAllGuests(){
		try {
			List<Guest> list = guestService.getAllGuests();
			if(list.size()<=0) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			return ResponseEntity.of(Optional.of(list));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@GetMapping("/get/{guestId}")
	public ResponseEntity<Guest> getGuestById(@PathVariable(value = "guestId") int guestId){
		
		try {
			Guest guest = guestService.getGuestById(guestId);
			if(guest==null) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			else {
				return ResponseEntity.of(Optional.of(guest));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	/*
	 * @RequestMapping(method = RequestMethod.GET,value = "/get/{guestName}") public
	 * Guest getGuestByName(@PathVariable int guestName) { return
	 * guestService.getGuestByName(guestName); }
	 */
}
