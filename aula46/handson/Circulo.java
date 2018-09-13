package aula46.handson;


public class Circulo extends Figura2D {
	public double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return area = Math.PI * (Math.pow(raio, 2));
	}
}
