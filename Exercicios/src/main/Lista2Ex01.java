package main;

import java.util.Scanner;

public class Lista2Ex01 {
	
public static void main (String[] Args) {
	
	Scanner sc = new Scanner (System.in);
	
	int numA, numB, numC;
	
	System.out.println("Digite o número A desejado: ");
	numA = sc.nextInt();
	System.out.println("Digite o número B desejado: ");
	numB = sc.nextInt();
	System.out.println("Digite o número C desejado: ");
	numC = sc.nextInt();
	
	if (numA + numB > numC) {
		System.out.println("A soma de A + B é maior que C");
	} 
	else if (numA + numB < numC) {
		System.out.println("A soma de A + B é menor que C");
	} else {
		System.out.println("A soma de A + B é igual a C");
	}
	
	sc.close();
	
}

}
