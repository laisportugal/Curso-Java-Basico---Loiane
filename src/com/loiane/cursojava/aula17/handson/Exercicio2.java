package com.loiane.cursojava.aula17.handson;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String user;
		String senha;
		boolean userOk = false;

		do {
			System.out.println("Digite seu nome de usuario");
			user = scan.next();

			System.out.println("Digite sua senha");
			senha = scan.next();

			if (user.equalsIgnoreCase(senha)) {
				System.out.println("Senha igual a usuario,tente novamente");
				userOk=false;
			} else {
				System.out.println("Senha e usuario validos");
				userOk=true;
			}
		} while (!userOk);

	}

}
