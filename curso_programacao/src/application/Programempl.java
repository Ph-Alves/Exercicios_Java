package application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;

public class Programempl {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println("Employee: " + emp);
		
		System.out.print("Which percentage to increase salary?");
		double percentage = sc.nextDouble();		
		emp.increaseSalary(percentage);
		
		System.out.println("Updated data: " + emp);
		
		sc.close();
	}

}
