package poo;

public class ContaPagamento extends Conta{

	public boolean sacar(double valor) {
		super.taxaSaque = 2.0;
		return super.sacar(valor);
	}
	
}
