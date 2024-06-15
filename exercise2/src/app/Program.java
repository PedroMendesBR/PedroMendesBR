package app;

import java.util.Locale;
import java.util.Scanner;

import entitites.Employee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Enter the attributes for the employee");
		
		employee.name = sc.nextLine();
		employee.tax = sc.nextDouble();
		employee.grossSalary = sc.nextDouble();
		
		System.out.println("Name: " + employee.name);
		System.out.println("Gross salary: " + employee.grossSalary);
		System.out.println("Tax: " + employee.tax);
		
		System.out.println("Employee: " + employee.name + ", $ " + employee.netSalary());
		
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		
		employee.increaseSalary(percentage);
		
		System.out.println("Updated data: " + employee.name + ", $ " + employee.netSalary());
	}
}
