package be_study.quiz.quiz52_0;

import java.util.List;

public class UserDTO {

	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", name=" + name + ", address=" + address + ", contacts=" + contacts + ", orders="
				+ orders + "]";
	}
	
	private Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	private List<Contact> contacts;
	public List<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	
	private List<Order> orders;
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

}







