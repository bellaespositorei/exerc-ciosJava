package main;

import java.util.Scanner;

public class Lista3Ex05 {
	
public static void main (String[] Args) {
		
		Scanner sc = new Scanner (System.in);
		
		int numero = 1;
		int somaPositivos = 0;
		
		do {
			System.out.println("Digite um número: ");
			numero = sc.nextInt();
			
			if (numero > 0) {
				somaPositivos+= numero;
			}
			
		} while(numero != 0);
		
		System.out.println("A some dos número positivos é: " + somaPositivos);
		
		sc.close();
}
}
