package aula35.labs;

public class Calculadora {

	// F_{n}=F_{n-1}+F_{n-2}
	// 0,1,1,2,3,5,8,13,21,34,55,89
	public int[] sequenciaFibonacci;

	public static int fibonacci(int num) {
		if (num<2) {
			return 1;
		}
		return fibonacci(num - 1) + fibonacci(num - 2);

	}

}
