package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		
		Scanner scan = new Scanner(System.in);
	/*	System.out.println("Digite seu nome completo:");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo �: "+ nomeCompleto);
		
		System.out.println("Digite seu primero nome:");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome �: "+ primeiroNome); 
		
		System.out.println("Digite sua idade:");
		int idade = scan.nextInt();
		System.out.println("Sua idade �: "+ idade); 

		System.out.println("Digite sua altura:");
		double altura = scan.nextDouble();
		System.out.println("Sua altura �: "+ altura); */
	
		System.out.println("Digite seu primeiro nome, idade, qtd de filhos, altura e se tem bichinho de estima��o");
		String primeiroNome= scan.next();
		int idade= scan.nextInt();
		byte qtfilhos = scan.nextByte();
		float altura= scan.nextFloat();
		boolean tempet= scan.nextBoolean();
		
		System.out.println("Voc� digitou os seguintes valores");
		System.out.println("Primeiro nome: "+primeiroNome);
		System.out.println("Idade: "+idade);
		System.out.println("Quantidade de filhos: "+qtfilhos);
		System.out.println("Altura: "+altura);
		System.out.println("Tem bichinho de estima��o? "+ tempet);
		
		
	}

}
