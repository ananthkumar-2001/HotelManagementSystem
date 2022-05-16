package com.guest.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Guests")
public class Guest {
	
	@Transient
	public static final String SEQUENCE_NAME = "user_sequence";
	
	@Id
	private int guestId;
	
	private String guestName;
	
	private int guestAge;
	
	private long guestContactNo;
	
	private String guestEmailId;
	
	private String guestAddress;

	public int getGuestId() {
		return guestId;
	}

	public void setGuestId(int guestId) {
		this.guestId = guestId;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public int getGuestAge() {
		return guestAge;
	}

	public void setGuestAge(int guestAge) {
		this.guestAge = guestAge;
	}

	public long getGuestContactNo() {
		return guestContactNo;
	}

	public void setGuestContactNo(long guestContactNo) {
		this.guestContactNo = guestContactNo;
	}

	public String getGuestEmailId() {
		return guestEmailId;
	}

	public void setGuestEmailId(String guestEmailId) {
		this.guestEmailId = guestEmailId;
	}

	public String getGuestAddress() {
		return guestAddress;
	}

	public void setGuestAddress(String guestAddress) {
		this.guestAddress = guestAddress;
	}
	
	

}
