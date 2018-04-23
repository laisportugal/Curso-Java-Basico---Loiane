package com.loiane.cursojava.aula15.handson;

import java.util.Scanner;

public class DoisNumeros {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Escreva o primeiro numero");
		int primeiroNumero = scan.nextInt();

		System.out.println("Escreva o segundo numero");
		int segundoNumero = scan.nextInt();

		if (primeiroNumero > segundoNumero) {
			System.out.println(primeiroNumero);
		} else {
			System.out.println(segundoNumero);
		}

	}

}
