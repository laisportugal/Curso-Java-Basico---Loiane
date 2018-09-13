package aula46.handson;

public class Quadrado extends Figura2D {

	public double medidaLadoEmCm;

	public double getMedidaLadoEmCm() {
		return medidaLadoEmCm;
	}

	public void setMedidaLadoEmCm(double medidaLadoEmCm) {
		this.medidaLadoEmCm = medidaLadoEmCm;
	}

	@Override
	public double calcularArea() {
		return area = Math.pow(medidaLadoEmCm, 2);
	}
}
