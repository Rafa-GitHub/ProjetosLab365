package exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		int n1 = tc.nextInt();
		int n2 = tc.nextInt();
		int n3 = tc.nextInt();
		int maior = n1;
		
		
		if(n2 > maior && n2 > n3) {
			System.out.println("Maior: " + n2);
		}else if(n3 > maior) {
			System.out.println("Maior: " + n3);
		}else {
			System.out.println("Maior: " + maior);
		}
		tc.close();
	}

}
