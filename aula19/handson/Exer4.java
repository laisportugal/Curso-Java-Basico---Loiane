package com.loiane.cursojava.aula19.handson;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer4 {

	
	public static void main(String[] args) {
		double vetorA[] = new double[15];
		double vetorB[] = new double[vetorA.length];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posição " + i);
			vetorA[i] = scan.nextDouble();
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		System.out.println("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i]);
		}
		
		DecimalFormat df =new DecimalFormat("###,###.###");

		System.out.println("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println(df.format(vetorB[i]));

		}

	}

}
