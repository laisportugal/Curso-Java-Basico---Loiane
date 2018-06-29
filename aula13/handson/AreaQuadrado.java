package com.loiane.cursojava.aula13.handson;

import java.util.Scanner;

public class AreaQuadrado {

// ver por que o resultado está incorreto
	
	@SuppressWarnings("resource")

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor do lado");
		int lado = scan.nextInt();
		int area = (lado  ^ 2);
		int areaDobrada = area*2;
		
		System.out.println("A área  é " + area);
		System.out.println("A área do quadrado multiplicado por  2 é " + areaDobrada);
	}

}
