package com.loiane.cursojava.aula13.handson;

import java.util.Scanner;

public class ConversaoTemperaturaCelciusParaFarenheit {

	@SuppressWarnings("resource")

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor da tempratura em graus Celcius");
		double temperaturaCelcius = scan.nextDouble();
		double temperaturaFarenheit = ((temperaturaCelcius * 1.8) + 32);
		System.out.println("A temperatura em Farenheit é " + temperaturaFarenheit + "ºF");
	}
}