package curso_programacao;

import java.util.Scanner;
import java.util.Locale;

public class Switch_case_treino {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int escolha;

		System.out.println("1- Segunda");
		System.out.println("2- Terça");
		System.out.println("3- Quarta");
		System.out.println("4- Quinta");
		System.out.println("5- Sexta");
		System.out.println("6- Sabado");
		System.out.println("7- Domingo");
		System.out.printf("Escolha um dia da semana: ");
		escolha = sc.nextInt();

		switch (escolha) {
		case 1:
			System.out.println("Você escolheu Segunda!");
			break;
		case 2:
			System.out.println("Você escolheu Terça!");
			break;
		case 3:
			System.out.println("Você escolheu Quarta!");
			break;
		case 4:
			System.out.println("Você escolheu Quinta!");
			break;
		case 5:
			System.out.println("Você escolheu Sexta!");
			break;
		case 6:
			System.out.println("Você escolheu Sabado!");
			break;
		case 7:
			System.out.println("Você escolheu Domingo!");
			break;
		default:
			System.out.println("Você escolheu uma opção inválida!");
		}

		sc.close();
	}
}
