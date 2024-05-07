package curso_programacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		int resultado;
		
		System.out.print("Digite um número para a soma: ");
		num1 = sc.nextInt();
		System.out.print("Digite outro número para a soma: ");
		num2 = sc.nextInt();
		resultado = num1 + num2;
		System.out.printf("O resultado da soma é: %d", resultado);
		
		sc.close();	
	}

}
