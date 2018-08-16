package aula35.labs;

public class MetodoRecursivo {
	/*
	 * escreva um metodo recursivo e estatico que receba um numero inteiro positivo
	 * N e calcule o somatorio dos numeros de 1 a N
	 **/
		public static int somatorio(int num) {
	
		return num + somatorio(num-1) ;

	}


	}

}
