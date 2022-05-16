package com.inventory;

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

import com.inventory.models.Inventory;
import com.inventory.service.InventoryService;
import com.inventory.service.SequenceGeneratorservice;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/inventory")
@RestController
public class InventoryController {
	
	@Autowired
	private InventoryService inventoryService;
	
	@Autowired
	private SequenceGeneratorservice sequenceGeneratorservice;

	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public ResponseEntity<Void> addInventory(@RequestBody Inventory inventory) {
		try {
			inventory.setInventoryId(sequenceGeneratorservice.getSequenceNumber(inventory.SEQUENCE_NAME));
			inventoryService.addInventory(inventory);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/update/{inventoryId}")
	public ResponseEntity<Void> updateInventory(@RequestBody Inventory inventory, @PathVariable(value = "inventoryId") int inventoryId) {
		try {
			inventoryService.updateInventory(inventory,inventoryId);
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/{inventoryId}")
	public ResponseEntity<Void> deleteInventory( @PathVariable(value = "inventoryId") int inventoryId) {
		try {
			inventoryService.deleteInventory(inventoryId);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Inventory>> getAllInventorys(){
		try {
			List<Inventory> list = inventoryService.getAllInventory();
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
	
	@GetMapping("/get/{inventoryId}")
	public ResponseEntity<Optional<Inventory>> getInventoryById(@PathVariable(value = "inventoryId") int inventoryId){
		
		try {
			Optional<Inventory> inventory = inventoryService.getInventoryById(inventoryId);
			if(inventory==null) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			else {
				return ResponseEntity.of(Optional.of(inventory));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
