package com.inventory.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(value = "Inventorys")
public class Inventory {
	
	@Transient
	public static final String SEQUENCE_NAME = "user_sequence";

	@Id
	private int inventoryId;
	
	private String inventoryName;
	
	private String inventoryDepartment;
	
	private int inventoryQuantity;

	public int getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}

	public String getInventoryName() {
		return inventoryName;
	}

	public void setInventoryName(String inventoryName) {
		this.inventoryName = inventoryName;
	}

	public String getInventoryDepartment() {
		return inventoryDepartment;
	}

	public void setInventoryDepartment(String inventoryDepartment) {
		this.inventoryDepartment = inventoryDepartment;
	}

	public int getInventoryQuantity() {
		return inventoryQuantity;
	}

	public void setInventoryQuantity(int inventoryQuantity) {
		this.inventoryQuantity = inventoryQuantity;
	}
	
	
}
