package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Lista5Ex04 {
	
	public static void main (String[] Args) {
		
		Scanner sc = new Scanner (System.in);
		int num;
		HashSet <Integer> listaNum = new HashSet <>(Arrays.asList(2,5,1,3,4,9,7,8,10,6));
		
		
		System.out.println("Digite o número que deseja encontrar: ");
		num = sc.nextInt();
		
		if (listaNum.contains(num)) {
			System.out.println("O número " + num + " foi encontrado!");
		} else {
			System.out.println("O número " + num + " não foi encontrado!");
		};
		
		sc.close();
	}
}
