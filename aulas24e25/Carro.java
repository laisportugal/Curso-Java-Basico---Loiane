package aulas24e25;

public class Carro {

		String marca;
		String modelo;
		int numeroPassageiros;
		double capacidadeCombustivel;
		double consumoCombustivel;
		
		
		void exibirAutonomia () {
			System.out.println("A autonomia do carro � " +capacidadeCombustivel * consumoCombustivel+ "km");
		}
}

