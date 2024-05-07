package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Employeelist;

public class Programlist {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//criação da lista
		List <Employeelist> list = new ArrayList<>();
		
		//número n limitador do For
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		//Cadastro dos usuários - Id, Nome, Salário e acrescentando isso na lista
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employeelist emp = new Employeelist(id, name, salary);
			
			list.add(emp);
		}
		
		//Aumento de salário do id requisitado
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase :");
		int idSalary = sc.nextInt();
		Integer verif = verification(list, idSalary);
		
		//Cobertura para caso o usuário digite um id inválido
		if(verif == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			Double increase = sc.nextDouble();
			list.get(verif).increaseSalary(increase);
		}
		
		//Mostrar na tela todos os funcionários
		System.out.println();
		System.out.println("List of Employees: ");
		for (Employeelist emp : list) {
			System.out.println(emp);
		}
		
		sc.close();
	}
	
	public static Integer verification(List <Employeelist> list, int Id) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == Id) {
				return i;
			}
		}
		return null;
	}

}
