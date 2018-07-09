package aula27.handson;

public class Lampada {
	String marca;
	double preco;
	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	String[] tipos;
	boolean ligada;

		
	void ligarLampada(){
		boolean ligada = true;
		System.out.println("A lampada está ligada");
	}
	
	void desligarLampada(){
		boolean ligada = false;
		System.out.println("A lampada está desligada");
	}
	
	

}

