package be_study.quiz.quiz52_0;

import java.util.List;

public class Order {

	private String orderId;
	private String date;
	private List<Item> items;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", date=" + date + ", items=" + items + "]";
	}

}