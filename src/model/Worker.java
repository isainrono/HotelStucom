package model;

import java.util.ArrayList;

public class Worker {
	private String dni;
	private String name;
	private ArrayList<String> activitiesList;
	
	public Worker() {	
	}
	
	public Worker(String dni, String name, ArrayList<String> aList) {
		this.setDni(dni);
		this.name = name;
		this.activitiesList = aList;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getActivitiesList() {
		return activitiesList;
	}

	public void setActivitiesList(ArrayList<String> activitiesList) {
		this.activitiesList = activitiesList;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	
	
}
