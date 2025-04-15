package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee002;

public class Exercicio002 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee002 emp = new Employee002();
		System.out.println("Name:");
		emp.name = sc.nextLine();
		System.out.println("Gross Salary:");
		emp.grossSalary = sc.nextDouble();
		System.out.println("Tax:");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Employee: %s, $ %.2f%n", emp.name, emp.netSalary());
		
		System.out.println();
		System.out.println("Which percentage to increase salary?");
		emp.percentage = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Updated data: %s, $ %.2f%n", emp.name, emp.increaseSalary(emp.percentage));
		
		sc.close();
	}
}
