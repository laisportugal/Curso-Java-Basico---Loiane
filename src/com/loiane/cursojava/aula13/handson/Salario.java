package com.loiane.cursojava.aula13.handson;

import java.util.Scanner;

public class Salario {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor recebido por hora");
		double valorHora = scan.nextDouble();
		System.out.println("Digite o valor de horas trabalhadas neste m�s");
	    double qtHorasTrabalhadas = scan.nextDouble();
	    
	    double salario = valorHora * qtHorasTrabalhadas;
	    System.out.println("O valor do seu sal�rio �:" + salario);
	}

}
