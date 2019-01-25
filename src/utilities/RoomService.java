package utilities;

public enum RoomService {
	TV("TV"), BALCON("BALCON"), CAMADOBLE("CAMADOBLE"),UNACAMA("UNACAMA"), JACUZZI("JACUZZI"), MINIBAR("MINIBAR"), TELEFONO("TELEFONO"), SATELITE("SATELITE"), SWEET("SWEET");
	
	private String service;
	
	private RoomService(String service) {
		this.service = service;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}
	
	
}
