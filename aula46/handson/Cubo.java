package aula46.handson;

public class Cubo extends Figura3D {
	double aresta;

	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}

	@Override
	public double calcularArea() {
		return 6 * (Math.pow(aresta, 2));
	}

	@Override
	public double calcularVolume() {
		return (Math.pow(aresta, 3));
	}
}
