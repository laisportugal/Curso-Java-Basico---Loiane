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

	void ligar() {
		ligada = true;
	}

	void desligar() {
		ligada = false;
	}

	void mostrarEstado() {
		if (ligada) {
			System.out.println("lampada está ligada");
		} else {
			System.out.println("lampada está desligada");
		}
	}

	void mudarEstado() {
		if (ligada) {
			desligar();
		} else {
			ligar();
		}
	}

}
