package main;

import java.util.Scanner;

public class Lista3Ex02 {

	public static void main (String[] Args) {
		
		Scanner sc = new Scanner (System.in);
		
		int qtdPares = 0, qtdImpares = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Informe o número " + (i+1) + ": ");
			int numero = sc.nextInt();
			
			if (numero % 2 == 0) {
				qtdPares++;
			} else {
				qtdImpares++;
			}
			
		}
		
		System.out.println("Total de números pares: " + qtdPares);
		System.out.println("Total de números impares: " + qtdImpares);
		
		sc.close();
	}
	
}
