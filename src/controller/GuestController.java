package controller;

import model.Customer;

public class GuestController {
	
	private Customer guest;
	
	public GuestController() {
		guest = new Customer();
	}

	public Customer getGuest() {
		return guest;
	}

	public void setGuest(Customer guest) {
		this.guest = guest;
	}
	


}
