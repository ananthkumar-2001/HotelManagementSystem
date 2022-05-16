package com.guest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guest.models.Guest;
import com.guest.repository.GuestRepository;

@Service
public class GuestService {
	
	@Autowired
	private GuestRepository guestRepository;

	public void addGuest(Guest guest) {
		guestRepository.insert(guest);
	}

	public List<Guest> getAllGuests() {
		List<Guest> list1 = new ArrayList<>();
		list1=guestRepository.findAll();
		return list1;
	}

	public void updateGuest(Guest guest, int guestId) {
		guestRepository.save(guest);
	}

	public void deleteGuest(int guestId) {
		guestRepository.deleteById(guestId);
	}

	public Guest getGuestById(int guestId) {
		return guestRepository.findByGuestId(guestId);
	}

	

}
