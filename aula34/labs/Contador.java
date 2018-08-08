package aula34.labs;

public class Contador {
	
	private static int valorIncrementado;
	
	public static int getValorIncrementado() {
		System.out.println(valorIncrementado);
		return valorIncrementado;
	}
	
	public static void setValorIncrementado(int valorIncrementado) {
		Contador.valorIncrementado = valorIncrementado;
	}
	
	public void incrementar() {
		valorIncrementado = valorIncrementado + 1;

	}
	
	public void zerar() {
		valorIncrementado=0;

	}
	
}
