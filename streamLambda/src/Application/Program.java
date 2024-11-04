package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.Collectors;

import Entities.Employee;

public class Program {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        List<Employee> empList = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null) {
                String[] Line = line.split(",");
                String name = Line[0];
                String email = Line[1];
                Double salary = Double.parseDouble(Line[2]);

                empList.add(new Employee(email, name, salary));
            }

            System.out.print("Enter salary:");
            double salaryFilter = sc.nextDouble();
            System.out.print("Email of people whose salary is more than " + salaryFilter);
            System.out.println(empList.stream().filter(e -> e.getSalary() > salaryFilter).map(Employee::getEmail).collect(Collectors.toList()));

            double sum = empList.stream().map(e -> e.getSalary()).reduce(0.0, (x,y) -> x + y);
            System.out.println("Sum of salary of people whose name starts with 'M': " + sum);

        } catch (IOException e){
            System.out.println("Error reading file!!");
        }
    }
}
