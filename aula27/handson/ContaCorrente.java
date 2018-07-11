package aula27.handson;

public class ContaCorrente {

	String numero;
	String agencia;
	double saldo;
	double limiteEspecial;

	void sacar(double valor) {

		double saldoTotal = saldo + limiteEspecial;
		if (saldoTotal < valor) {
			System.out.println("Saldo insuficiente");
		} else if (saldo < valor && saldoTotal > valor) {
			double valorADeduzirDoLimite = valor - saldo;
			saldo = 0;
			limiteEspecial = limiteEspecial - valorADeduzirDoLimite;
		} else {
			saldo = saldo - valor;
		}
		verificarSaldo();
	}

	void verificarSaldo() {

		System.out.println("O valor do saldo é " + (saldo + limiteEspecial));
	}

	void depositar(double valor) {
		if (valor > 0) {
			saldo = saldo + valor;
			System.out.println("O valor depositado foi " + valor);
			return;
		}
		verificarSaldo();
	}

}
