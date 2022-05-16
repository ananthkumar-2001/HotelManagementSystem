package com.guest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.guest.models.Guest;

@Repository
public interface GuestRepository extends MongoRepository<Guest, Integer>{

	
	Guest findByGuestId(int guestId);
	

}
