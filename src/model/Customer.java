package model;

public class Customer {
	
	private String dni;
	private int components;
	private String request;
	
	public Customer() {
		
	}
	
	public Customer(String dni,int components,String request) {
		this.dni = dni;
		this.components = components;
		this.request = request;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getComponents() {
		return components;
	}

	public void setComponents(int components) {
		this.components = components;
	}

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}
	
	

}
