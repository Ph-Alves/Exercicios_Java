package Entities;

public class Employee {

    String name;
    String email;
    Double salary;

    public Employee(String email, String name, Double salary) {
        this.email = email;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    
}
