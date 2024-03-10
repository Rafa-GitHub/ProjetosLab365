package poo;

public class Conta {

	public String nomeTitular;
	public int numConta;
	private double saldo;
	protected double taxaSaque = 0.0;
	
	public boolean depositar(double valor) {
		this.saldo += valor;
		return true;
	}
	public boolean sacar(double valor) {
		if(valor + this.taxaSaque <= this.saldo) {
			//permite saque
			this.saldo = this.saldo - valor - taxaSaque;
			return true;
		}else {
			//não permite saque
			return false;
		}
	}
	public boolean transferir(Conta contaDestino, double valor) {
		if(this.sacar(valor) == true) {
			contaDestino.depositar(valor);
			return true;
		}else {
			return false;
		}

	}
	public double getSaldo() {
		return this.saldo;
	}
	
}
