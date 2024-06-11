package main;

import java.util.Scanner;
import java.util.Stack;

public class Lista6Ex02 {

	public static void main (String[] Args) {
		
		Scanner sc = new Scanner (System.in);
		
		String nomeLivro;
		
		
		Stack <String> pilha = new Stack <>();
		
		for (int option = 0; option <= 4;) {
		System.out.println("\nQual a opção desejada?\n"
				+ "1 - Adicionar livro na pilha\n"
				+ "2 - Listar todos os livros\n"
				+ "3 - Retirar livro da pilha\n"
				+ "0 - Sair");
		option = sc.nextInt();
		
		switch (option) {
		
		case 1: 
			System.out.println("\nQual o nome do livro que deseja adicionar?");
			sc.skip("\\R?");
			nomeLivro = sc.nextLine();
			
			pilha.push(nomeLivro);
			System.out.println("\nLivro Adicionado\n");
			break;
			
		case 2:
			if (pilha.isEmpty()) {
				System.out.println("A pilha está vazia!\n");
			}else {
			System.out.println("Lista de livros na pilha: \n");
			for (String obj : pilha) {
				System.out.println(obj + "\n");
			}
			}
			break;
			
		case 3: 
			if (pilha.isEmpty()) {
				System.out.println("A pilha está vazia! ");
			}else {
				pilha.pop();
				System.out.println("Um livro foi retirado da pilha! \n");
				System.out.println("Pilha:\n");
				for (String obj : pilha) {
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
