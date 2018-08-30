package com.loiane.cursojava.aula43;

public class PessoaJuridica extends Contribuinte {

	public double calcularImpostoPessoaJuridica(double rendaEmpresa)  {
		if (rendaEmpresa != 0) {
			valorImposto = rendaEmpresa * 0.1;
		} else {
			System.out.println("Valor incorreto");
		}
		return valorImposto;
	}
}
