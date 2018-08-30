package com.loiane.cursojava.aula43;

public class PessoaFisica extends Contribuinte {

	private double aliquota;
	private double parcelaDeduzir;

	public double getParcelaDeduzir() {
		return parcelaDeduzir;
	}

	public void setParcelaDeduzir(double parcelaDeduzir) {
		this.parcelaDeduzir = parcelaDeduzir;
	}

	public double getAliquota() {
		return aliquota;
	}

	public void setAliquota(double aliquota) {
		this.aliquota = aliquota;
	}

	public double calcularImpostoPessoaFisica(double rendaBruta) {
		double calculoImposto;
		
		if (rendaBruta <= 0) {
			return 0;
		} else if ((rendaBruta > 1400) && (rendaBruta <= 2100)) {
			setAliquota(0.1);
			setParcelaDeduzir(100);
			calculoImposto = (rendaBruta * aliquota) - parcelaDeduzir;
		} else if ((rendaBruta > 2100) && (rendaBruta <= 2800)) {
			setAliquota(0.15);
			setParcelaDeduzir(270);
			calculoImposto = (rendaBruta * aliquota) - parcelaDeduzir;
		} else if ((rendaBruta > 2800) && (rendaBruta <= 3600)) {
			setAliquota(0.25);
			setParcelaDeduzir(500);
			calculoImposto = (rendaBruta * aliquota) - parcelaDeduzir;
		} else {
			setAliquota(0.30);
			setParcelaDeduzir(700);
			calculoImposto = (rendaBruta * aliquota) - parcelaDeduzir;
		}
	
		return calculoImposto;
	}

}
