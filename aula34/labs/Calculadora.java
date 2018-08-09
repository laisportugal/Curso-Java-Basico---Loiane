package aula34.labs;

public class Calculadora {

	private static int resultado;
	private static double resultadoReal;
	
	public static int somar(int num1, int num2) {
		resultado =  num1 + num2;
		return resultado;
	} 

	public static int subtrair(int num1, int num2) {
		resultado = num1 - num2;
		return resultado;
	}

	public static int multiplicar(int num1, int num2) {
		resultado= num1 * num2;
		return resultado;
	}

	public static double dividir(double num1, double num2) {
		resultadoReal =num1 / num2;
		return resultadoReal;
	}

	public static double potencia(double num1, double potencia) {
		resultadoReal= Math.pow(num1, potencia);
		return resultadoReal;
	}
	
	public static void imprimirResultado(){
		System.out.println(resultado);
	}
	
	public static void imprimirResultadoReal(){
		System.out.println(resultadoReal);
	}
}
