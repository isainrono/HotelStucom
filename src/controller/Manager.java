package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import model.*;
import utilities.*;

public class Manager {
	
	private static Manager manager;
	private RoomController roomC;
	private HashSet<Room> roomList = new HashSet<>();
	private ArrayList<Worker> workerList = new ArrayList<>();
	private HashMap<Room, Worker> workerRoomList = new HashMap<>();
	private HashMap<Room, Customer> guestRoomList = new HashMap<>();
	private int money;
	private int roomNumber;
	
	private Manager() {
		this.roomNumber = 001;
	}
	
	public static Manager getInstance() {
		if(manager == null) {
			manager = new Manager();
		}
		return manager;
	}
	

	public HashSet<Room> getRoomList() {
		return roomList;
	}

	public void setRoomList(HashSet<Room> roomList) {
		this.roomList = roomList;
	}

	public ArrayList<Worker> getWorkerList() {
		return workerList;
	}

	public void setWorkerList(ArrayList<Worker> workerList) {
		this.workerList = workerList;
	}

	public HashMap<Room, Worker> getWorkerRoomList() {
		return workerRoomList;
	}

	public void setWorkerRoomList(HashMap<Room, Worker> workerRoomList) {
		this.workerRoomList = workerRoomList;
	}

	public HashMap<Room, Customer> getGuestRoomList() {
		return guestRoomList;
	}

	public void setGuestRoomList(HashMap<Room, Customer> guestRoomList) {
		this.guestRoomList = guestRoomList;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	
	
	public RoomController getRoomC() {
		return roomC;
	}


	public boolean addRoom(String roomNumber, int roomCapacity, String[] services) {
		this.roomC = new RoomController();
		this.roomC.getRoom().setNumber(roomNumber);
		this.roomC.getRoom().setCapacity(roomCapacity);
		
		for (int i = 0; i < services.length; i++) {
			RoomService service = Enum.valueOf(RoomService.class, services[i].toUpperCase());
			this.roomC.getRoom().addServices(service);
		}
		
		return this.roomList.add(this.roomC.getRoom());
	}

	/*public void chargeRooms() {
			
		// ArrayList de una habitacion normal
		ArrayList<RoomService> standartRoom = new ArrayList<RoomService>();
		ArrayList<RoomService> doubleRoom = new ArrayList<RoomService>();
		ArrayList<RoomService> singelRoom = new ArrayList<RoomService>();
		ArrayList<RoomService> kingRoom = new ArrayList<RoomService>();
		
		
		Room room = new Room("001", 2, standartRoom);

	}*/
	
	

}
