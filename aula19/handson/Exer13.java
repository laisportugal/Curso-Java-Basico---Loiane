package com.loiane.cursojava.aula19.handson;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {

		int vetorA[] = new int[10];
		Scanner scan = new Scanner(System.in);
		int soma = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posição " + i + " do vetor A");
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 5 == 0) {
				soma += vetorA[i];
			}
		}

		System.out.print(" Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();
		System.out.println("A soma dos elementos do vetor é : " + soma);
	}

}
