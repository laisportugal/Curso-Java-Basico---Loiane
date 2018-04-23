package com.loiane.cursojava.aula17.handson;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		boolean infoValida = false;
		String nome;
		int idade;
		double salario;
		String sexo;
		String estadoCivil;

		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Digite seu nome");
			nome = scan.next();

			if (nome.length() >= 3) {
				infoValida = true;
			} else {

			}
		} while (!infoValida);

		infoValida = false;

		do {
			System.out.println("Digite sua idade");
			idade = scan.nextInt();
			if (idade > 0 && idade <= 150) {
				infoValida = true;
			} else {
				System.out.println("Você tem certeza que possui esse idade?");
			}
		} while (!infoValida);

		infoValida = false;

		do {
			System.out.println("Digite seu salario");
			salario = scan.nextDouble();
			if (salario > 0) {
				infoValida = true;
			} else {
				System.out.println("Salário inválido");
			}
		} while (!infoValida);

		infoValida = false;

		do {
			System.out.println("Digite seu sexo. M ou F.");
			sexo = scan.next();
			if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
				infoValida = true;
			} else {
				System.out.println("Inválido");
			}
		} while (!infoValida);

		do {
			System.out.println("Digite seu estado civil");
			estadoCivil = scan.next();
			switch (estadoCivil) {
			case "s":
				break;
			case "c":
				break;
			case "v":
				break;
			case "d":
				break;
			default:
				infoValida = false;
				System.out.println("Inválido");

			}
		} while (!infoValida);
		
		System.out.println("Nome:"+nome+", idade: "+idade+", sexo:"+sexo+", estado civil: "+estadoCivil);
	}
}
