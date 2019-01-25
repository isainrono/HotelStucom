package controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import model.*;
import utilities.*;

public class RoomController {
	
	private Room room;
	
	public RoomController() {
		this.room = new Room();
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
	
	public void prepareRoom(String roomNumber, int roomCapacity, String[] services) {
		this.room.setNumber(roomNumber);
		this.room.setCapacity(roomCapacity);
		
		for (int i = 0; i < services.length; i++) {
			
		}
		
	}
	
	public Room showRoom(String roomName) {
		Room sRoom = new Room();
		for (Room room : Manager.getInstance().getRoomList()) {
			if(room.getNumber().equalsIgnoreCase(roomName)) {
				sRoom = room;
			}
		}
		
		return sRoom;
	}
	
	public void addRoom() {
		
		/* ArrayList de una habitacion normal
		ArrayList<RoomService> standartRoom = new ArrayList<RoomService>(Arrays.asList(RoomService.CAMADOBLE,RoomService.TELEFONO, RoomService.TV));
		ArrayList<RoomService> doubleRoom = new ArrayList<RoomService>(Arrays.asList(RoomService.CAMADOBLE,RoomService.TELEFONO, RoomService.TV, RoomService.SATELITE));
		ArrayList<RoomService> singelRoom = new ArrayList<RoomService>(Arrays.asList(RoomService.UNACAMA,RoomService.TELEFONO, RoomService.TV));
		ArrayList<RoomService> kingRoom = new ArrayList<RoomService>(Arrays.asList(RoomService.CAMADOBLE,RoomService.TELEFONO, RoomService.TV, RoomService.BALCON, RoomService.JACUZZI,RoomService.MINIBAR, RoomService.SATELITE, RoomService.SWEET));*/
		
	}

}
