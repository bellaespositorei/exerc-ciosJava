package main;

import java.util.Scanner;

public class Lista2Ex05 {
	
public static void main (String[] Args) {
	
	Scanner sc = new Scanner (System.in);
	
	float result;
	int amount, product;
	
	System.out.println("Seja bem vindo à lanchonete. Digite o produto desejado: \n");
	System.out.println("1 - Cachorro Quente \n"
			+ "2 - X-Salada \n"
			+ "3 - X-Bacon \n"
			+ "4 - Bauru \n"
			+ "5 - Refrigerante \n "
			+ "6 - Suco de Laranja \n");
	product = sc.nextInt();
	
	switch (product) {
	case 1:
		System.out.println("Qual a quantidade que gostaria? ");
		amount = sc.nextInt();
		
		result = 10 * amount;
		
		System.out.printf("Valor total: R$ " + result);
		break;
		
	case 2:
		System.out.println("Qual a quantidade que gostaria? ");
		amount = sc.nextInt();
		
		result = 15 * amount;
		
		System.out.printf("Valor total: R$ " + result);
		break;
		
	case 3:
		System.out.println("Qual a quantidade que gostaria? ");
		amount = sc.nextInt();
		
		result = 18 * amount;
		
		System.out.printf("Valor total: R$ " + result);
		break;
		
	case 4:
		System.out.println("Qual a quantidade que gostaria? ");
		amount = sc.nextInt();
		
		result = 12 * amount;
		
		System.out.printf("Valor total: R$ " + result);
		break;
		
	case 5:
		System.out.println("Qual a quantidade que gostaria? ");
		amount = sc.nextInt();
		
		result = 8 * amount;
		
		System.out.printf("Valor total: R$ " + result);
		break;
		
	case 6:
		System.out.println("Qual a quantidade que gostaria? ");
		amount = sc.nextInt();
		
		result = 13 * amount;
		
		System.out.printf("Valor total: R$ " + result);
		break;
		
		default: 
			System.out.println("Opção inválida");
			break;
		
	}
	
	
	sc.close();
	
}

}