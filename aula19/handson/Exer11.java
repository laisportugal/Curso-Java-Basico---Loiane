package com.loiane.cursojava.aula19.handson;

import java.util.Scanner;

public class Exer11 {
	public static void main(String[] args) {

		int vetorA[] = new int[10];
		Scanner scan = new Scanner(System.in);
		int count = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posição " + i + " do vetor A");
			vetorA[i] = scan.nextInt();
		}

		System.out.print(" Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
			if (vetorA[i] % 2 == 0) {
				count++;
			}

		}

		System.out.println();
		System.out.println("O número de pares é : " + count);
	}
}
