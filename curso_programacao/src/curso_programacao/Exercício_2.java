package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercício_2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double area;
		double raio;
		
		Locale.setDefault(Locale.US);
		System.out.print("Digite o valor do raio para que calcule-se a area do círculo: ");
		raio = sc.nextDouble();
		area = pi * Math.pow(raio, 2);
		System.out.printf("O resultado é: %.4f%n", area);
		
		sc.close();
	}
	
}
