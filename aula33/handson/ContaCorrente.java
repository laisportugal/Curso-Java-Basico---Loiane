package aula33.handson;

public class ContaCorrente {

	private String numero;
	private String agencia;
	private double saldo;
	private double limiteEspecial;

	public ContaCorrente(String numero, String agencia, double saldo, double limiteEspecial) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.limiteEspecial = limiteEspecial;
	}

	public ContaCorrente() {
		// TODO Auto-generated constructor stub
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}

	public void sacar(double valor) {

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

	public void verificarSaldo() {

		System.out.println("O valor do saldo é " + (saldo + limiteEspecial));
	}

	public void depositar(double valor) {
		if (valor > 0) {
			saldo = saldo + valor;
			System.out.println("O valor depositado foi " + valor);
			return;
		}
		verificarSaldo();
	}

}
