package exercicios;

public class exercicio02 {

	public static void main(String[] args) {
		
		/*mostrarMensagem();
		System.out.println(somaValores(5,10));*/
		
		/*Carro carro01 = new Carro();
		carro01.cor = "Azul";
		carro01.qtdPortas = 4;
		carro01.acelerar();*/
		
		Conta c01 = new Conta();
		c01.nome = "João";
		c01.saldo = 100.0;
		
		System.out.printf("Cliente %s possui R$:%.2f de saldo na sua conta.%n", c01.nome, c01.saldo);
		
		c01.sacar(50);
		System.out.println("Saldo atual R$:" + c01.getSaldo());
		c01.deposito(250);
		System.out.println("Saldo atual R$:" + c01.getSaldo());
		
	}
	
	
	public static void mostrarMensagem() {
		System.out.println("dentro da função.");
	}
	public static int somaValores(int n1, int n2) {
		return n1 + n2;
		
	}

}
