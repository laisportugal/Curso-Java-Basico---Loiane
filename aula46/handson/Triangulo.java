package aula46.handson;

public class Triangulo extends Figura2D {
	public double base;

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

	public double altura;

	@Override
	public void calcularArea() {
		area = (base * altura) / 2;
	}
}
