package model;

import java.util.ArrayList;
import utilities.RoomService;

public class Room {
	
	private String number;
	private int capacity;
	private ArrayList<RoomService> servicesList = new ArrayList<>();
	
	public Room() {
		
	}
	
	public Room(String number, int capacity, ArrayList<RoomService> serviceList) {
		this.number = number;
		this.capacity = capacity;
		this.servicesList = serviceList;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public ArrayList<RoomService> getServicesList() {
		return servicesList;
	}

	public void setServicesList(ArrayList<RoomService> servicesList) {
		this.servicesList = servicesList;
	}
	
	public void addServices(RoomService roomService) {
		this.servicesList.add(roomService);
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Room [number=" + number + ", capacity=" + capacity + ", servicesList=" + servicesList + "]";
	}
	
	
	
}
