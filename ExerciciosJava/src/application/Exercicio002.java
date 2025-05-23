package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee002;

public class Exercicio002 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee002 emp = new Employee002();
		
		System.out.print("Name:");
		emp.name = sc.nextLine();
		System.out.print("Gross Salary:");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax:");
		emp.tax = sc.nextDouble();
		
		System.out.println(); 
		System.out.println("Employee: " + emp); 
		System.out.println(); 
		System.out.print("Which percentage to increase salary? "); 
	    double percentage = sc.nextDouble(); 
		emp.increaseSalary(percentage); 
		   
		System.out.println(); 
		System.out.println("Updated data: " + emp); 
		sc.close();
	}
}
