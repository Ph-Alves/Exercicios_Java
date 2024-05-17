package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxCompany;
import entities.TaxIndividual;
import entities.TaxPayer;

public class MainPayer {

	public static void main(String[] args) {
		
		// locale para tradução e criação do scanner
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// alocação de quantas pessoas pagarão os impostos (fisicas ou juridicas)
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		ArrayList<TaxPayer> payersList = new ArrayList<>();
		
		// loop for para cadastras todas as pessoas e adicionar a lista
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c): ");
			char answer = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			double anualIncome = sc.nextDouble();
			if (answer == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				payersList.add(new TaxIndividual(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				payersList.add(new TaxCompany(name, anualIncome, numberOfEmployees));
			}
		}
		
		// loop for para impressão de quantia de imposto paga
		System.out.println();
		double totalTaxes = 0;
		// Por pessoa
		System.out.println("TAXES PAID: ");
		for(TaxPayer tp : payersList) {
			System.out.println(tp);
			totalTaxes += tp.tax();
		}
		// Total
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTaxes));
		sc.close();
	}

}
