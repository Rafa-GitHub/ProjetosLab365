package aulasEntra21;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteArrayListNumeros {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite um numeros: ");
			numeros.add(tc.nextInt());
		}
		
		if(numeros.contains(10) || numeros.contains(100) || numeros.contains(1000)) {
			System.out.println("Parabéns VC ganhou R$ 50,00");
		}
		
		tc.close();
	}

}
