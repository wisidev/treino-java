package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle001;

public class Exercicio001 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle001 rect = new Rectangle001();
		
		System.out.println("Enter rectangle width and height: ");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		
		System.out.println(rect.toString());
		
		sc.close();
	}
}
