package com.loiane.cursojava.aula17.handson;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int populacaoA;
		int populacaoB;
		double taxaCrescimentoA;
		double taxaCrescimentoB;
		int count = 0;
		boolean valido = false;

		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Digite a populacao A");
			populacaoA = scan.nextInt();

			if (populacaoA > 0) {
				valido = true;
			} else {
				System.out.println("A populacao precisa ser maior do que zero.");
				valido = false;

			}

		} while (!valido);

		do {
			System.out.println("Digite a taxa de crescimento A");
			taxaCrescimentoA = scan.nextDouble();

			if (taxaCrescimentoA > 0) {
				valido = true;
			} else {
				System.out.println("A taxa precisa ser maior do que zero.");
				valido = false;
			}
		} while (!valido);

		do {
			System.out.println("Digite a populacao B");
			populacaoB = scan.nextInt();

			if (populacaoB > 0) {
				valido = true;
			} else {
				System.out.println("A populacao precisa ser maior do que zero.");
				valido = false;
				
			}
		} while (!valido);

		do {
			System.out.println("Digite a taxa de crescimento B");
			taxaCrescimentoB = scan.nextDouble();

			if (taxaCrescimentoB > 0)
				valido = true;
			else
				System.out.println("A taxa precisa ser maior do que zero.");
				valido = false;

		} while (!valido);

		while (populacaoA <= populacaoB) {
			populacaoA += (populacaoA / 100) * taxaCrescimentoA;
			populacaoB += (populacaoB / 100) * taxaCrescimentoB;
			count++;
		}

		System.out.println(count);
	}

}