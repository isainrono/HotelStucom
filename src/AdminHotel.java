import model.*;
import controller.*;

public class AdminHotel {
	
	
	public static void room(String[] lines) {
		if(lines.length == 4) {
			String[] services = lines[3].split(",");
			if(lines[1].length() == 3) {
				if(Manager.getInstance().addRoom(lines[1], Integer.parseInt(lines[2]), services)) {
					System.out.println("--> New Room added " + lines[1] + " <--");
					System.out.println("Room added correctly!!\n");
				} else {
					System.out.println("This room is already added!!\n");
				}		
			} else {
				System.out.println("Room number invalid!!\n");
			}			
		} else {
			System.out.println(Manager.getInstance().getRoomC().showRoom(lines[1]));
		}
		
		/*Room room1 = new Room();
		
		for (Room room : Manager.getInstance().getRoomList()) {
			System.out.println(Manager.getInstance().getRoomList().toString());
		}*/	
		
	}
	
	public static void worker(String[] lines) {
		if(lines.length == 4) {
			String[] activities = lines[3].split(",");
			if(lines[1].length() == 3) {
				System.out.println("--> New worker added " + lines[1] + "<--");
			} else {
				System.out.println("--> Problem added new Worker");
			}
		}
	}
	
	public static void problem(String room) {
		
		
	}
	
	public static void request() {
		
	}
	
	public static void leave() {
		
	}
	
	public static void reservation() {
		
	}


}
