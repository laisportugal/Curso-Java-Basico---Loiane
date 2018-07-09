package aula27.handson;

public class Exer02 {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();
		conta.numero = "123";
		conta.agencia = "0102";
		conta.saldo = 200;
		conta.limiteEspecial = 250;
		conta.especial = true;

		ContaCorrente conta2 = new ContaCorrente();
		conta2.numero = "456";
		conta2.agencia = "5555";
		conta2.saldo = 200;
		conta2.especial = false;

		conta.verificarSaldo();
		conta.sacar(450);
//		conta.depositar(100);
//		conta.verificarSaldo();

//		conta2.verificarSaldo();
//		conta2.sacar(450);
//		conta2.depositar(250);
//		conta2.sacar(450);

	}

}
