package aula26;

public class Carro {

	String marca;
	String modelo;
	int numeroPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;

	void exibirAutonomia() {
		System.out.println("A autonomia do carro � " + capacidadeCombustivel * consumoCombustivel + "km");
	}

	double obterAutonomia() {
		System.out.println("M�todo obter autonomia foi chamado.");
		return capacidadeCombustivel * consumoCombustivel;
	}
}
