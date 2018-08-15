package aula35.labs;

public class MetodoRecursivo {
	/*
	 * escreva um metodo recursivo e estatico que receba um numero inteiro positivo
	 * N e calcule o somatorio dos numeros de 1 a N
	 **/
	public static int recursivo(int num) {
		int resultado = 0;
		for (int i = 1; i <= num; i++) {
			resultado = i + (i+1);
			

		}
		return resultado;

	}

}
