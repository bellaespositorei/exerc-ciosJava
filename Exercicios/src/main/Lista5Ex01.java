package main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Lista5Ex01 {
	
public static void main (String[] Args) {
		
		Scanner sc = new Scanner (System.in);
		
		String color;
		
		ArrayList <String> colorList = new ArrayList <>();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite a cor desejada");
			color = sc.nextLine();
			
			colorList.add(color);
		}
		
		
		System.out.println(colorList);
		Collections.sort(colorList);
		System.out.println(colorList);
		
		sc.close();
}
}
