package aula29;

public class Carro {

	String marca;
	String modelo;
	int numeroPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;
	
	Carro (){
		System.out.println("A classe carro foi instanciada");
		numeroPassageiros=4;
	}
	
	

	public Carro(String marca, String modelo, int numeroPassageiros, double capacidadeCombustivel,
			double consumoCombustivel) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numeroPassageiros = numeroPassageiros;
		this.capacidadeCombustivel = capacidadeCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}



	void exibirAutonomia() {
		System.out.println("A autonomia do carro é " + capacidadeCombustivel * consumoCombustivel + "km");
	}

	double obterAutonomia() {
		System.out.println("Método obter autonomia foi chamado.");
		return capacidadeCombustivel * consumoCombustivel;
	}
}
