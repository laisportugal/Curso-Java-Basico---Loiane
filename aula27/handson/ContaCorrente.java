package aula27.handson;

public class ContaCorrente {

	String numero;
	String agencia;
	double saldo;
	double saldoTotal;
	double limiteEspecial;
	boolean especial = false;

	double sacar(double valor) {
		if ((saldoTotal>= 0) && (especial = true)) {
			saldoTotal = saldoTotal - valor;
			System.out.println("O valor sacado foi " + valor);
		} else {
			System.out.println("Saldo insuficiente para saque.");
		}
		return saldo;
	}

	double depositar(double valor) {
		saldo = saldo + valor;
		System.out.println("O valor depositado foi " + valor);
		return saldo;
	}

	double verificarSaldo(){
		saldoTotal = saldo + limiteEspecial; 
		System.out.println("O saldo é " + saldoTotal);
	return saldoTotal;
	}
	
	
}
