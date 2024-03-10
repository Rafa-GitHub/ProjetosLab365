package poo;

public class ProjetoBanco {

	public static void main(String[] args) {
		
		Conta c01 = new Conta();
		Conta c02 = new Conta();
		
		c01.nomeTitular = "José";
		c01.numConta = 01;
		
		c02.nomeTitular = "Rafael";
		c02.numConta = 02;
		
		System.out.println(c01.nomeTitular);
		
	}

}
