package aula43;

public class Animal {

	String nome;
	Double comprimentoEmCentimetro;
	int patas;
	String cor;
	String ambiente;
	Double velocidadeEmMetroPorSegundo;


	public Double getComprimentoEmCentimetro() {
		return comprimentoEmCentimetro;
	}

	public void setComprimentoEmCentimetro(Double comprimentoEmCentimetro) {
		this.comprimentoEmCentimetro = comprimentoEmCentimetro;
	}

	public Double getVelocidadeEmMetroPorSegundo() {
		return velocidadeEmMetroPorSegundo;
	}

	public void setVelocidadeEmMetroPorSegundo(Double velocidadeEmMetroPorSegundo) {
		this.velocidadeEmMetroPorSegundo = velocidadeEmMetroPorSegundo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String amibiente) {
		this.ambiente = amibiente;
	}

	public Double getVelocidade() {
		return velocidadeEmMetroPorSegundo;
	}

	public void setVelocidade(Double velocidade) {
		this.velocidadeEmMetroPorSegundo = velocidade;
	}

	public void imprimirAnimal() {
		System.out.println("Nome: " + nome);
		System.out.println("Comprimento em centímetros: " + comprimentoEmCentimetro);
		System.out.println("Quantidade de patas: " + patas);
		System.out.println("Cor: " + cor);
		System.out.println("Ambiente: " + ambiente);
		System.out.println("Velocidade em metros por segundo: " + velocidadeEmMetroPorSegundo);
		
	}

}
