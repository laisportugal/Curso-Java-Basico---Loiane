package com.loiane.cursojava.aula13.handson;

import java.util.Scanner;

public class ConversaoTemperaturaFarenheitParaCelcius {
	@SuppressWarnings("resource")

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor da tempratura em graus Farenheit");
		double temperaturaFarenheit = scan.nextDouble();
		
		double temperaturaCelcius= (5*(temperaturaFarenheit-32)/9);
		System.out.println("A temperatura em Celcius é " +temperaturaCelcius+ "ºC");

	}

}
