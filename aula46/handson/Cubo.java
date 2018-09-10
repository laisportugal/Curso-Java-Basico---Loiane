package aula46.handson;

public class Cubo extends Figura3D {
	double aresta;
	
	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}

	public void CalcularArea() {
		area= 6*(Math.pow(aresta, 2));
		
	}
}
