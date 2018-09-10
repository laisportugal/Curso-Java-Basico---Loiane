package aula46.handson;

public class Quadrado extends Figura2D {

	public double medidaLadoEmCm;

	public double calculaArea() {
		area = Math.pow(medidaLadoEmCm, 2);
		return area;
	}
}
