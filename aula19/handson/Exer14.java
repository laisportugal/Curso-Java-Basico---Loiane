package com.loiane.cursojava.aula19.handson;

import java.util.Scanner;

public class Exer14 {
	public static void main(String[] args) {

		int vetorA[] = new int[10];
		Scanner scan = new Scanner(System.in);
		int soma = 0;
		int media = 0;
		int qtImpares=0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posi��o " + i + " do vetor A");
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 != 0) {
				soma += vetorA[i];
				qtImpares++;
			}
		}
		 media = soma/qtImpares;
		
		System.out.print(" Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();
		System.out.println("A m�dia dos elementos �mpares do vetor � : " + media);
	}
}
