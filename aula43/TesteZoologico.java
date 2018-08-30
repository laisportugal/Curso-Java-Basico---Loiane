package aula43;

public class TesteZoologico {

	public static void main(String[] args) {
		Animal camelo = new Animal();
		camelo.setNome("Camelo");
		camelo.comprimentoEmCentimetro = 150d;
		camelo.setPatas(4);
		camelo.setAmbiente("Terra");
		camelo.setCor("Amarelo");
		camelo.velocidadeEmMetroPorSegundo = 2d;

		Peixe tubarao = new Peixe();
		tubarao.setNome("Tubarao");
		tubarao.comprimentoEmCentimetro = 300d;
		tubarao.setPatas(0);
		tubarao.setAmbiente("Mar");
		tubarao.setCor("Cinzento");
		tubarao.velocidadeEmMetroPorSegundo = 1.5d;
		tubarao.setCaracteristicas("Barbatanas e cauda");

		Mamifero ursoDoCanada = new Mamifero();
		ursoDoCanada.setNome("Urso do Canada");
		ursoDoCanada.comprimentoEmCentimetro = 180d;
		ursoDoCanada.setPatas(4);
		ursoDoCanada.setAmbiente("Terra");
		ursoDoCanada.setCor("Vermelho");
		ursoDoCanada.velocidadeEmMetroPorSegundo = 0.5d;
		ursoDoCanada.setAlimento("Mel");
		
		camelo.imprimirAnimal();
		System.out.println("-------------");
		tubarao.ImprimirAnimal();
		System.out.println("-------------");
		ursoDoCanada.ImprimirAnimal();
				
	}

}
