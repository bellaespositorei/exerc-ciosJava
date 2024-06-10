package main;

import java.util.Locale;
import java.util.Scanner;

public class Lista4Ex03 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int linhas, colunas, sumPrincipal = 0, sumSecundaria = 0;

        System.out.println("Digite a quantidade de linhas: ");
        linhas = sc.nextInt();

        System.out.println("Digite a quantidade de colunas: ");
        colunas = sc.nextInt();

        int[][] mat = new int[linhas][colunas];

        for(int i = 0; i < linhas; i++) {
            for(int j = 0; j < colunas; j++) {
                System.out.println("elementos: ");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Elementos da diagonal Principal: ");
        for(int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }

        System.out.println();

        System.out.println("Elementos da diagonal secundária: ");
        for(int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][2 - i] + " ");
        }

        System.out.println();

        System.out.println("Soma dos Elementos da Diagonal Principal: ");
        for(int i = 0; i < mat.length; i++) {
            sumPrincipal += mat[i][i];
        }
        System.out.print(sumPrincipal);

        System.out.println();

        System.out.println("Soma dos Elementos da Diagonal Secundária: ");
        for(int i = 0; i < mat.length; i++) {
            sumSecundaria += mat[i][2 - i];
        }
        System.out.print(sumSecundaria);
        sc.close();

    }


}
