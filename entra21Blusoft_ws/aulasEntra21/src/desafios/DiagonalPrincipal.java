package desafios;

import java.util.Random;

public class DiagonalPrincipal {

	public static void main(String[] args) {

		/*
		 * 03 - Crie um algoritmo que calcule a soma dos valores da diagonal principal
		 * de uma matriz 5x5.
		 */
		Random numeros = new Random();
		int mat[][] = new int[5][5];
		int somaMatDiagonal = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				mat[i][j] = numeros.nextInt(10);
				if (i == j) {
					somaMatDiagonal += mat[i][j];
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.print("\n");
		}
		System.out.println("Soma: " + somaMatDiagonal);

	}

}
