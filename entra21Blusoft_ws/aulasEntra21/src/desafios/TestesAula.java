package desafios;

import java.util.Scanner;

public class TestesAula {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Qtd numeros: ");
		int vet[] = new int[scan.nextInt()];
		
		
		System.out.println(vet.length);
		scan.close();
	}

}
