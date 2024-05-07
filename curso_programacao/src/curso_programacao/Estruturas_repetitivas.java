package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Estruturas_repetitivas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int escolha = 0;

		while (escolha != 4) {
			System.out.println("1- Álcool");
			System.out.println("2- Gasolina");
			System.out.println("3- Diesel");
			System.out.println("4- Sair");
			System.out.print("Escolha o combustível da sua preferência: ");
			escolha = sc.nextInt();
			if (escolha == 1) {
				alcool += 1;
			}
			else if (escolha == 2) {
				gasolina += 1;
			}
			else if (escolha == 3) {
				diesel += 1;
			}
		}
		
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		

		sc.close();
	}
}
