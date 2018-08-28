package com.loiane.cursojava.aula43;

public class ContaBancaria {
	private String nomeCliente;
	private String numConta;
	protected double saldo;

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double sacar(double valorSacado) {
		if (saldo - valorSacado > 0) {
			saldo = saldo - valorSacado;
		} else {
			System.out.println("Saldo insuficiente");
		}
		return saldo;
	}

	public double depositar(double valorDepositar) {
		saldo = saldo + valorDepositar;
		return saldo;
	}
	
	public void imprimeSaldo(){
		System.out.println("O saldo é: "+getSaldo());
	}
	
	public void imprimeDadosCliente() {
		System.out.println("Nome do cliente: "+getNomeCliente());
		System.out.println("Numero da conta: "+getNumConta());
	}

}
