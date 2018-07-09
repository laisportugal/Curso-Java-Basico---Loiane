package aula27;

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
	
	double calcularCombustivel(double km) {
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}
}