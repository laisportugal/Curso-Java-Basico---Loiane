package com.loiane.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {

		double[] temperaturas = new double[365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 31.1;

		System.out.println("O valor da temperatura do da 1 é: " + temperaturas[2]);
		System.out.println("O tamanho do array é " + temperaturas.length);

		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("O valor do dia " + (i + 1) + " é " + temperaturas[i]);

		}

		// for melhorado
		for (double temp : temperaturas) {
			System.out.println(temp);
		}

	}

}
