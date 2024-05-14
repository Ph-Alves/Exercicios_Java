package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import entities.enums.FixOrderStatus;

public class FixOrder {
	
	DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDateTime moment;
	private FixOrderStatus status;
	
	private FixClient client;
	
	private ArrayList<FixOrderItem> items = new ArrayList<>();
	
	public FixOrder() {
	}

	public FixOrder(LocalDateTime moment, FixOrderStatus status, FixClient client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public FixOrderStatus getStatus() {
		return status;
	}

	public void setStatus(FixOrderStatus status) {
		this.status = status;
	}

	public FixClient getClient() {
		return client;
	}

	public void setClient(FixClient client) {
		this.client = client;
	}

	public ArrayList<FixOrderItem> getOrderItem() {
		return items;
	}

	public void addItem(FixOrderItem item) {
		items.add(item);
	}
	
	public void removeItem(FixOrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		double inc = 0;
		for (FixOrderItem c : items) {
			inc += c.subTotal();
		}
		return inc;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: " + fmt1.format(moment));
		sb.append("\nOrder Status: " + status);
		sb.append("\n" + client);
		sb.append("\nOrder items: ");
		for (FixOrderItem c : items) {
			sb.append("\n" + c);
		}
		sb.append("\nTotal Price: " + total());
		return sb.toString();
	}
}
