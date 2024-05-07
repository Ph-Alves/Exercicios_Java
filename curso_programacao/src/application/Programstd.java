package application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Student;

public class Programstd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Student std = new Student();
		
		System.out.print("Name: ");
		std.name = sc.nextLine();
		
		System.out.println("Put the Grades in order (1,2,3)");
		std.grade1 = sc.nextDouble();
		std.grade2 = sc.nextDouble();
		std.grade3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + std.finalGrade());
		if(std.finalGrade() > 60.0) {
			System.out.println("PASS!");
		} else {
			System.out.println("FAILED!");
			System.out.printf("MISSING %.2f POINTS", std.remainingPoints());
		}
		
		sc.close();
	}

}
