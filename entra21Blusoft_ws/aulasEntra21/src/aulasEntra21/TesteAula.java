package aulasEntra21;

import java.util.Scanner;

public class TesteAula {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		System.out.print("Quantidade produtos: ");
		int productQuantity = tc.nextInt();
		int op = -1;
		
		do {
			System.out.printf("[ 1 ]Adicionar +1"
					+ "\n[ 2 ]Remover -1\n[ 0 ]SAIR\n-> ");
				op = tc.nextInt();
			switch(op) {
				case 0:
					break;
				case 1:
					productQuantity += 1;
					break;
				case 2:
					productQuantity -= 1;
					break;
				default:
					System.out.println("Valor invalido!");
			}
			System.out.printf("%d produtos\n", productQuantity);
		}while (productQuantity != 0 && op != 0);
		System.out.println("Fim da execução.");
		
		tc.close();
	}

}
