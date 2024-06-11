package main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Lista6Ex01 {

	public static void main (String[] Args) {
		
		Scanner sc = new Scanner (System.in);
		
		String nomeCliente;
		
		
		Queue <String> fila = new LinkedList<>();
		
		for (int option = 0; option <= 4;) {
		System.out.println("\nQual a opção desejada?\n"
				+ "1 - Adicionar Cliente na fila\n"
				+ "2 - Listar todos os clientes\n"
				+ "3 - Retirar Cliente da fila\n"
				+ "0 - Sair");
		option = sc.nextInt();
		
		switch (option) {
		
		case 1: 
			System.out.println("\nQual o nome do cliente que deseja adicionar?");
			sc.skip("\\R?");
			nomeCliente = sc.nextLine();
			
			fila.add(nomeCliente);
			System.out.println("\nCliente Adicionado\n");
			break;
			
		case 2:
			if (fila.isEmpty()) {
				System.out.println("A fila está vazia!\n");
			}else {
			System.out.println("Lista de clientes na fila: \n");
			for (String obj : fila) {
				System.out.println(obj + "\n");
			}
			}
			break;
			
		case 3: 
			if (fila.isEmpty()) {
				System.out.println("A fila está vazia! ");
			}else {
				fila.poll();
				System.out.println("O cliente foi chamado! \n");
				System.out.println("Clientes na fila:\n");
				for (String obj : fila) {
					System.out.println(obj + "\n");
				}
			}
			
			break;
			
		case 0:
			System.out.println("Programa Finalizado");
			return;
			
		default: 
			System.out.println("Opção inválida. Escolha um número do menu. \n");
			continue;
		}
		}
		sc.close();
	}
	
}
