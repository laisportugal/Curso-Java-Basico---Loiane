package com.loiane.cursojava.aula13.handson;

import java.util.Scanner;

public class Numero {

	@SuppressWarnings("resource")
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número");
		int numero = scan.nextInt();
		System.out.println("O numero digitado foi " + numero);
	}

}
