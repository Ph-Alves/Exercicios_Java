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

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            List<Employee> empList = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                empList.add(new Employee(fields[1], fields[0], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.print("Enter salary:");
            double salaryFilter = sc.nextDouble();

            List<String> emails = empList.stream().filter(e -> e.getSalary() > salaryFilter).map(x -> x.getEmail()).sorted().collect(Collectors.toList());
            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salaryFilter) + ":");
            emails.forEach(System.out::println);

            double sum = empList.stream().filter(x -> x.getName().charAt(0) == 'M').map(e -> e.getSalary()).reduce(0.0, (x,y) -> x + y);
            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));

        } catch (IOException e){
            System.out.println("Error reading file!!");
        }
    }
}
