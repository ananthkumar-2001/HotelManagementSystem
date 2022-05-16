package com.room.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(value = "Rooms")
public class Room {
	
	@Transient
	public static final String SEQUENCE_NAME = "user_sequence";

	@Id
	private int roomId;
	
	private String roomType;
	
	private int noOfBeds;
	
	private boolean roomStatus;
	
	private int roomRent;

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int getNoOfBeds() {
		return noOfBeds;
	}

	public void setNoOfBeds(int noOfBeds) {
		this.noOfBeds = noOfBeds;
	}

	public boolean isRoomStatus() {
		return roomStatus;
	}

	public void setRoomStatus(boolean roomStatus) {
		this.roomStatus = roomStatus;
	}

	public int getRoomRent() {
		return roomRent;
	}

	public void setRoomRent(int roomRent) {
		this.roomRent = roomRent;
	}
	
	
}
