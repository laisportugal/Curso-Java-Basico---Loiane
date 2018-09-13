package aula46.handson;

public class Triangulo extends Figura2D {
	public double base;
	public double altura;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return area = (base * altura) / 2;
	}
}
