package poo;

public class ProjetoBanco {

	public static void main(String[] args) {
		
		Conta c01 = new ContaPoupanca();//polimorfismo
		Conta c02 = new ContaPagamento();
		
		c01.nomeTitular = "José";
		c01.numConta = 01;
		
		c02.nomeTitular = "Rafael";
		c02.numConta = 02;
		
		c01.depositar(50);
		c02.depositar(50);
		
		System.out.println("Saldo c01 R$: " + c01.getSaldo());
		System.out.println("Saldo c02 R$: " + c02.getSaldo());
	}

}
