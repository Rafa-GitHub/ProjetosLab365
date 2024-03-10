package poo;

public class ContaPoupanca extends Conta{

	public boolean sacar(double valor) {
		super.taxaSaque = 0.50;
		return super.sacar(valor);
	}
	
}
