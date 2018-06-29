package com.loiane.cursojava.aula19.handson;

import java.util.Scanner;

public class Exer10 {
	public static void main(String[] args) {

		int vetorA[] = new int[10];
		int vetorB[] = new int[vetorA.length];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posição " + i + " do vetor A");
			vetorA[i]=scan.nextInt();
			vetorB[i]= vetorA[i]%2;
		}
		
		System.out.print(" Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();

		System.out.print(" Vetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
	}
}
