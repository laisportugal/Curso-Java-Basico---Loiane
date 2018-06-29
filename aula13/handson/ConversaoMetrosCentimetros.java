package com.loiane.cursojava.aula13.handson;

import java.util.Scanner;

public class ConversaoMetrosCentimetros {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor em Metros");
		double valorEmMetros = scan.nextDouble();
		double valorEmCentimetros = valorEmMetros * 1000;

		System.out.println("O valor em centimetros é " + valorEmCentimetros);

	}
}
