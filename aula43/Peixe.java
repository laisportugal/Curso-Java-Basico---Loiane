package aula43;

public class Peixe extends Animal {
	String caracteristicas;

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
	public void ImprimirAnimal() {
		System.out.println("Nome: " + nome);
		System.out.println("Comprimento em centímetros: " + comprimentoEmCentimetro);
		System.out.println("Quantidade de patas: " + patas);
		System.out.println("Cor: " + cor);
		System.out.println("Ambiente: " + ambiente);
		System.out.println("Velocidade em metros por segundo: " + ambiente);
		System.out.println("Caracteristicas : " + caracteristicas);
	}
}
