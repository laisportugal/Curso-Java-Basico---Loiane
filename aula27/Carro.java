package aula27;

public class Carro {

	String marca;
	String modelo;
	int numeroPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;

	void exibirAutonomia() {
		System.out.println("A autonomia do carro é " + capacidadeCombustivel * consumoCombustivel + "km");
	}

	double obterAutonomia() {
		System.out.println("Método obter autonomia foi chamado.");
		return capacidadeCombustivel * consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}
}