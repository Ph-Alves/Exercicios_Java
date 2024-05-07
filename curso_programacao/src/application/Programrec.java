package application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Rectangle;

public class Programrec {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Rectangle rec = new Rectangle();
		
		System.out.println("Enter Rectangle width and height: ");
		rec.width = sc.nextDouble();
		rec.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rec.area());
		System.out.printf("PERIMETER = %.2f%n", rec.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rec.diagonal());
		
		sc.close();
	}

}
