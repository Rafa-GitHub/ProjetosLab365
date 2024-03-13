package exercicios;

public class Conta {
	
	String nome;
	double saldo;
	
	void sacar(double valor) {;
		this.saldo -= valor;
	}
	
	double getSaldo() {
		return this.saldo;
	}
	void deposito(double valor) {
		this.saldo += valor;
	}

}
