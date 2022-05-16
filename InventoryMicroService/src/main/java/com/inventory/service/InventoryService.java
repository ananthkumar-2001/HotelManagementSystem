package com.inventory.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.models.Inventory;
import com.inventory.repository.InventoryRepository;

@Service
public class InventoryService {
	
	@Autowired
	private InventoryRepository inventoryRepository;

	public void addInventory(Inventory inventory) {
		// TODO Auto-generated method stub
		inventoryRepository.save(inventory);
	}

	public void updateInventory(Inventory inventory, int inventoryId) {
		inventoryRepository.insert(inventory);
	}

	public void deleteInventory(int inventoryId) {
		inventoryRepository.deleteById(inventoryId);
	}

	public List<Inventory> getAllInventory() {
		return inventoryRepository.findAll();
	}

	public Optional<Inventory> getInventoryById(int inventoryId) {
		return inventoryRepository.findById(inventoryId);
	}

	
}
