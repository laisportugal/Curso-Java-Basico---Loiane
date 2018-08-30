package com.loiane.cursojava.aula43;

public class TesteImposto {

	public static void main(String[] args) {
		
		PessoaFisica maria = new PessoaFisica();
		maria.nomeContribuinte= "Maria";
		maria.calcularImpostoPessoaFisica(0);
		maria.imprimirValorImposto();
		
		PessoaFisica joao = new PessoaFisica();
		joao.nomeContribuinte= "Joao";
		joao.calcularImpostoPessoaFisica(1500);
		joao.imprimirValorImposto();
		
		PessoaFisica mario = new PessoaFisica();
		mario.nomeContribuinte= "Mario";
		mario.calcularImpostoPessoaFisica(2200);
		mario.imprimirValorImposto();
		
		PessoaJuridica sicoob = new PessoaJuridica();
		sicoob.nomeContribuinte= "Sicoob";
		sicoob.calcularImpostoPessoaJuridica(50000);
		sicoob.imprimirValorImposto();

		PessoaJuridica sicredi = new PessoaJuridica();
		sicredi.nomeContribuinte= "Sicredi";
		sicredi.calcularImpostoPessoaJuridica(20000);
		sicredi.imprimirValorImposto();
		
		PessoaJuridica itau = new PessoaJuridica();
		itau.nomeContribuinte= "Itau";
		itau.calcularImpostoPessoaJuridica(80000);
		itau.imprimirValorImposto();
	}

}
