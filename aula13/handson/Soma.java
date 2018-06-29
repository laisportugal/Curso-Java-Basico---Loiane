package com.loiane.cursojava.aula13.handson;

import java.util.Scanner;

public class Soma {

	@SuppressWarnings("resource")
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite dois números separados por espaço");
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		int soma = numero1 + numero2;
		System.out.println("A soma dos números digitados é " + soma);
	}

}
