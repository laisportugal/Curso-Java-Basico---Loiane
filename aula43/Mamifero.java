package aula43;

public class Mamifero extends Animal {
	
	String alimento;

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	public void ImprimirAnimal() {
		System.out.println("Nome: " + nome);
		System.out.println("Comprimento em centímetros: " + comprimentoEmCentimetro);
		System.out.println("Quantidade de patas: " + patas);
		System.out.println("Cor: " + cor);
		System.out.println("Ambiente: " + ambiente);
		System.out.println("Velocidade em metros por segundo: " + ambiente);
		System.out.println("Alimento : " + alimento);
	}

}
