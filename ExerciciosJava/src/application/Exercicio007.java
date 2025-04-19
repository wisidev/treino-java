package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio007 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] vet = new double[n];
		
		for (int i = 0; i < n; i++ ) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.print("VALORES = ");
		for (int i = 0; i < n; i++ ) {
			System.out.printf("%.2f ", vet[i]);
		}
		
		double soma = 0.0;
		for (int i = 0; i < n; i++ ) {
			soma += vet[i];
		}
		System.out.println();
		System.out.printf("SOMA = %.2f%n", soma);
		
		double media = soma / 4;
		System.out.printf("MEDIA = %.2f%n", media);
		
		sc.close();
	}

}
