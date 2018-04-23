package com.loiane.cursojava.aula17.handson;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean notaValida = false;

		do {
			System.out.println("Digite uma nota entre 0 e 10");
			double nota = scan.nextDouble();

			if (nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("Valor de nota: " + nota);
			} else {
				System.out.println("Valor inválido, digite novamente");
			}
		} while (!notaValida);

	}

}
