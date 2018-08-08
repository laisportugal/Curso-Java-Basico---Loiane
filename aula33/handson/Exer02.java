package aula33.handson;


public class Exer02 {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();
		conta.setNumero("123");
		conta.setAgencia("0102");
		conta.setSaldo(200);
		conta.setLimiteEspecial(250);
		
		conta.sacar(450);
		conta.depositar(100);
		conta.verificarSaldo();

	}
}
