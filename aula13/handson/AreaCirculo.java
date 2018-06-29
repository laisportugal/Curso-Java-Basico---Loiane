package com.loiane.cursojava.aula13.handson;

import java.util.Scanner;

public class AreaCirculo {
	@SuppressWarnings("resource")

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor do raio");
		double raio = scan.nextDouble();
		double pi = 3.14159;
		double area = 2*pi*raio;
		
		System.out.println("A área do círculo é " + area);
	}

}
