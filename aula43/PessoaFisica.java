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
			calculoImposto = calcularImposto(rendaBruta, 0.1, 100);
		} else if ((rendaBruta > 2100) && (rendaBruta <= 2800)) {
			calculoImposto = calcularImposto(rendaBruta, 0.15, 270);
		} else if ((rendaBruta > 2800) && (rendaBruta <= 3600)) {
			calculoImposto = calcularImposto(rendaBruta, 0.25, 500);

		} else {
			calculoImposto = calcularImposto(rendaBruta, 0.30, 700);
		}

		return calculoImposto;
	}

	private double calcularImposto(double rendaBruta, double Aliquota, double ParcelaReduzir) {
		return (rendaBruta * aliquota) - parcelaDeduzir;
	}

}
