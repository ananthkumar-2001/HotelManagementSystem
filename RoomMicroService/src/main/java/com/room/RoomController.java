package com.room;

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

import com.room.models.Room;
import com.room.service.RoomService;
import com.room.service.SequenceGeneratorservice;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/room")
@RestController
public class RoomController {

	@Autowired
	private RoomService roomService;
	
	@Autowired
	private SequenceGeneratorservice sequenceGeneratorservice;

	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public ResponseEntity<Void> addRoom(@RequestBody Room room) {
		try {
			room.setRoomId(sequenceGeneratorservice.getSequenceNumber(room.SEQUENCE_NAME));
			roomService.addRoom(room);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/update/{roomId}")
	public ResponseEntity<Void> updateRoom(@RequestBody Room room, @PathVariable(value = "roomId") int roomId) {
		try {
			roomService.updateRoom(room,roomId);
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/{roomId}")
	public ResponseEntity<Void> deleteRoom( @PathVariable(value = "roomId") int roomId) {
		try {
			roomService.deleteRoom(roomId);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Room>> getAllRooms(){
		List<Room> list = roomService.getAllRooms();
		if(list.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));
	}
	
	@GetMapping("/get/{roomId}")
	public ResponseEntity<Optional<Room>> getRoomById(@PathVariable(value = "roomId") int roomId){
		
		try {
			Optional<Room> room = roomService.getRoomById(roomId);
			if(room==null) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			else {
				return ResponseEntity.of(Optional.of(room));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
