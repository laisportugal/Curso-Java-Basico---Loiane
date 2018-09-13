package aula46.handson;

public class Figura3D extends FiguraGeometrica implements DimensaoSuperficial, DimensaoVolumetrica{
	
	public double area;
	public double volume;
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	

}
