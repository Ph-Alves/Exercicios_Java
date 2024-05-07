package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Membros_estaticos {
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI Value: %.2f%n", Calculator.PI);
		
		sc.close();
	}
	
}
