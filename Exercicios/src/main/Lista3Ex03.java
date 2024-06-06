package main;

import java.util.Scanner;

public class Lista3Ex03 {
public static void main (String[] Args) {
		
		Scanner sc = new Scanner (System.in);
		
		int idade = 0, menorIdade = 0, maiorIdade = 0;
		
		while (idade >= 0) {
			System.out.println("Digite uma idade: ");
			idade = sc.nextInt();
			
			if(idade < 21 && idade > 0) {
				menorIdade++;
			}else if (idade > 50) {
				maiorIdade++;
			}
		}
		
		System.out.println("Total de pessoas menores que 21: " + menorIdade);
		System.out.println("Total de pessoas maiores que 50: " + maiorIdade);
		
		
		sc.close();
}
}
