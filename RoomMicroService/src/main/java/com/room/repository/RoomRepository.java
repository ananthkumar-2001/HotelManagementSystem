package com.room.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.room.models.Room;

@Repository
public interface RoomRepository extends MongoRepository<Room, Integer>{

}
