package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class MainProduct {

	public static void main(String[] args) {
		
		// formatador de data, locale para tradução e scanner
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// inserção de dados para a quantia de produtos que vão ser inseridos
		System.out.print("Enter the number of Products: ");
		int n = sc.nextInt();
		
		ArrayList<Product> productList = new ArrayList<>();
		
		// loop for para inserir todos os produtos com base em N
		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char answer = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if (answer == 'u') {
				System.out.print("Manufacture date: ");
				LocalDate manufactureDate = LocalDate.parse(sc.next(), fmt1);
				productList.add(new UsedProduct(name, price, manufactureDate));
			} else if (answer == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				productList.add(new ImportedProduct(name, price, customsFee));
			} else {
				productList.add(new Product(name, price));
			}
		}
		
		// loop for each para imprimir todos os produtos da lista
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for (Product p: productList) {
			System.out.println(p.priceTag());
		}
		
		sc.close();
	}

}
