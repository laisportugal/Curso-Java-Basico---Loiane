package aula35;

public class TesteCalculadora {

	public static void main(String[] args) {

		int fatorialNaoRecursivo = Calculadora.fatorialNaoRecursivo(5);
		System.out.println(fatorialNaoRecursivo);
		int fatorialRecursivo= Calculadora.fatorial(5);
		System.out.println(fatorialRecursivo);

	}

}
