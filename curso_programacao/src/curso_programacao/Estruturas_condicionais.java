package curso_programacao;

import java.util.Scanner;
import java.util.Locale;

public class Estruturas_condicionais {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int min;
		double custo = 50.0;
		
		System.out.println("Digite a quantia de minutos gastos: ");
		min = sc.nextInt();
		
		if (min <= 100) {
			System.out.printf("Quantia de minutos gastos: %d%n", min);
			custo = 50;
			System.out.printf("Quantia a ser paga: R$%.2f%n", custo);
		} else {
			System.out.printf("Quantia de minutos gastos: %d%n", min);
			custo += (min - 100) * 2.0;
			System.out.printf("Quantia a ser paga: R$%.2f%n", custo);
		}
		
		sc.close();
	}
}
