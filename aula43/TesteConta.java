package com.loiane.cursojava.aula43;

public class TesteConta {

	public static void main(String[] args) {

		ContaBancaria conta = new ContaBancaria();
		conta.setNomeCliente("Maria");
		conta.setNumConta("5559956");
		conta.setSaldo(500);
		conta.depositar(200);
		conta.imprimeDadosCliente();
		conta.imprimeSaldo();
		
		System.out.println("\n");

		ContaPoupanca poupanca = new ContaPoupanca();
		poupanca.setNomeCliente("Joao");
		poupanca.setNumConta("4545936");
		poupanca.setSaldo(300);
		poupanca.calcularNovoSaldo(0.01);
		poupanca.imprimeDadosCliente();
		poupanca.imprimeNovoSaldo();
	}

}
