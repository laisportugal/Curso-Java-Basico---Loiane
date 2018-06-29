package com.loiane.cursojava.aula13.handson;

import java.util.Scanner;

public class Media {
	@SuppressWarnings("resource")

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite as quatro notas do bimestre separadas por espaço");
		double nota1 = scan.nextInt();
		double nota2 = scan.nextInt();
		double nota3 = scan.nextInt();
		double nota4 = scan.nextInt();
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println("A média é " + media);
	}

}
