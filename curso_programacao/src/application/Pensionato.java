package application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Vetorpens;

public class Pensionato {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Vetorpens[] pens = new Vetorpens[10];
		String name,email;
		int room;
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			sc.nextLine();
			System.out.printf("Rent #%d%n", i);
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			System.out.print("Room: ");
			room = sc.nextInt();
			
			pens[room] = new Vetorpens(name,email);
		}
		
		System.out.println("Busy rooms: ");
		for(int i=0; i<10; i++) {
			if (pens[i] != null) {
				System.out.println(i + ": " + pens[i]);
			}
		}
		
		sc.close();
	}

}
