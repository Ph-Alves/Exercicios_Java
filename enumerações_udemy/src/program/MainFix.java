package program;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.FixClient;
import entities.FixOrder;
import entities.FixOrderItem;
import entities.FixProduct;
import entities.enums.FixOrderStatus;

public class MainFix {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter client Data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		LocalDate birthDate = LocalDate.parse(sc.next(), fmt1);
		FixClient client = new FixClient(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		FixOrderStatus status = FixOrderStatus.valueOf(sc.next());
		
		FixOrder order = new FixOrder(LocalDateTime.now(), status, client);
		
		System.out.print("How many items to this order: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter #" + (i + 1) + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String prodName = sc.nextLine();
			System.out.print("Product price: ");
			double prodPrice = sc.nextDouble();
			FixProduct product = new FixProduct(prodName, prodPrice);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			FixOrderItem orderItem = new FixOrderItem(quantity, prodPrice, product);
			order.addItem(orderItem);
		}
		
		System.out.println("\nORDER SUMMARY: ");
		System.out.print(order);
		
		sc.close();
	}

}
