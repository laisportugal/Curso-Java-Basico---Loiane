package com.loiane.cursojava.aula17.handson;

public class Exercicio4 {

	
	public static void main(String[] args) {
		int populacaoA = 80000;
		int populacaoB = 200000;
		double taxaCrescimentoA = 0.03;
		double taxaCrescimentoB = 0.015;
		int count=0;
	
		while (populacaoA<=populacaoB) {
			populacaoA += populacaoA*taxaCrescimentoA;
			populacaoB += populacaoB*taxaCrescimentoB;
			count++;
		}
		
		System.out.println(count);
	}
	
}
