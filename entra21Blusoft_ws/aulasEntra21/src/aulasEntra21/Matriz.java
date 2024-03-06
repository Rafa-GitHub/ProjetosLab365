package aulasEntra21;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		int matriz[][] = new int[3][3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("insira um valor: ");
				matriz[i][j] = tc.nextInt();
			}
		}
		
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.print("\n");
		}
		
		tc.close();

	}

}
