package aula46.handson;

public class Circulo extends Figura2D{
	public double raio;
	
	public double calculaArea() {
		area = Math.PI*(Math.pow(raio, 2));
		return area;
	}
}
