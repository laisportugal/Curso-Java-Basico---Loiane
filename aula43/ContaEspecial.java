package com.loiane.cursojava.aula43;

public class ContaEspecial extends ContaBancaria {
	
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double sacar(double valor) {

		double saldoTotal = saldo + limite;
		if (saldoTotal < valor) {
			System.out.println("Saldo insuficiente");
		} else if (saldo < valor && saldoTotal > valor) {
			double valorADeduzirDoLimite = valor - saldo;
			saldo = 0;
			limite = limite - valorADeduzirDoLimite;
		} else {
			saldo = saldo - valor;
		}
		return saldo;
	}


}
