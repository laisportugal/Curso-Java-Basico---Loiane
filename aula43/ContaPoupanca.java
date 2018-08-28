package com.loiane.cursojava.aula43;

public class ContaPoupanca extends ContaBancaria {

	private int diaRendimento;
	private double novoSaldo;
	
	public double getNovoSaldo() {
		return novoSaldo;
	}

	public void setNovoSaldo(double novoSaldo) {
		this.novoSaldo = novoSaldo;
	}

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	public double calcularNovoSaldo(double rendimento) {
		novoSaldo = (saldo + (saldo * rendimento));
		return novoSaldo;
	}
	
	public void imprimeNovoSaldo() {
		System.out.println("O novo saldo é: " + getNovoSaldo());
	}
}
