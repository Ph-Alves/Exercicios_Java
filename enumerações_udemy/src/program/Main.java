package program;

import java.time.LocalDateTime;

import entities.Order;
import entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) {
		
		Order ordem = new Order(1080, LocalDateTime.now(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(ordem);
		
	}

}
