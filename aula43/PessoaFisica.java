package com.loiane.cursojava.aula43;

public class PessoaFisica extends Contribuinte {

	private double aliquota;
	private double parcelaDeduzir;

	public double getAliquota() {
		return aliquota;
	}

	public void setAliquota(double aliquota) {
		this.aliquota = aliquota;
	}

	public void calcularImposto(double rendaBruta) {
		if (rendaBruta < 0) {
			System.out.println("Valor de renda invalido");
		} else if ((rendaBruta >= 0) && (rendaBruta <= 1400)) {
			valorImposto = 0;
		} else if ((rendaBruta > 1400) && (rendaBruta <= 2100)) {
			aliquota = 0.1;
			parcelaDeduzir = 100;
			valorImposto = (rendaBruta * aliquota) - parcelaDeduzir;
		} else if ((rendaBruta > 2100) && (rendaBruta <= 2800)) {
			aliquota = 0.15;
			parcelaDeduzir = 270;
			valorImposto = (rendaBruta * aliquota) - parcelaDeduzir;
		} else if ((rendaBruta > 2800) && (rendaBruta <= 3600)) {
			aliquota = 0.25;
			parcelaDeduzir = 500;
			valorImposto = (rendaBruta * aliquota) - parcelaDeduzir;
		} else if ((rendaBruta > 2800) && (rendaBruta <= 3600)) {
			aliquota = 0.30;
			parcelaDeduzir = 700;
			valorImposto = (rendaBruta * aliquota) - parcelaDeduzir;
		}
	}

}
