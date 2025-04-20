package application;

import java.util.Scanner;

public class Exercicio009 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		int[] num = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			num[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.print("NUMEROS PARES: ");
		for (int i = 0; i < n; i++) {
			if (num[i] % 2 == 0) {
				System.out.print(num[i] + " ");
			}
		}
		
		int par = 0;
		for (int i = 0; i < n; i++) {
			if (num[i] % 2 == 0) {
				par++;
			}
		}
		
		System.out.println();
		System.out.print("QUANTIDADE DE PARES =  " + par);
		
		sc.close();
	}
}
