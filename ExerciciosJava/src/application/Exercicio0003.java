package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student003;

public class Exercicio0003 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student003 stu = new Student003();
		
		System.out.print("Name:");
		stu.name = sc.nextLine();
		System.out.print("GRADE 1:");
		stu.grade1 = sc.nextDouble();
		System.out.print("GRADE 2:");
		stu.grade2 = sc.nextDouble();
		System.out.print("GRADE 3:");
		stu.grade3 = sc.nextDouble();
		
		System.out.println();
		System.out.printf("FINAL GRADE = %.2f%n", stu.finalGrade());
		
		if (stu.finalGrade() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", stu.missingPoints());
		} else { 
			System.out.println("PASS");
		}
		
		sc.close();
	}
}