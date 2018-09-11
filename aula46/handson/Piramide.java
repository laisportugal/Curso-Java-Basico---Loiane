package aula46.handson;

public class Piramide extends Figura3D {
	
	public double altura;
	public double areaBase;
	public double areaLateral;
	
	@Override
	public void calcularVolume() {
		super.calcularVolume();
		volume= 1/3*(areaBase*altura);
	}
	
	@Override
	public void calcularArea() {
		area = areaBase + areaLateral;
	}
		
}
