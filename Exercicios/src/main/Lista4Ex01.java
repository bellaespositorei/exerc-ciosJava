package main;

import java.util.Scanner;

public class Lista4Ex01 {
	
public static void main (String[] Args) {
		
		Scanner sc = new Scanner (System.in);
		
		int vetorExercicio [] = {2,5,1,3,4,9,7,8,10,6};
		int numeroInteiro;
		
		System.out.println("Digite o número que gostaria de pesquisar: ");
		numeroInteiro = sc.nextInt();
		
		for (int i = 0; i<vetorExercicio.length; i++) {
			if(numeroInteiro == vetorExercicio[i]) {
				System.out.printf("O número %d está na posição %d", numeroInteiro, i);
			return;
			}
		}
		
		System.out.println("Poxa vida, não temos esse número");
		
		sc.close();
	}
}
