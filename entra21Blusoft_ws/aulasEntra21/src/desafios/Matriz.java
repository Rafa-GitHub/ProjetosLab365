package desafios;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		/*
		 * 01 - Faça um programa que permita ao usuário entrar com uma matriz de tamanho
		 * 3 × 3 de números inteiros. Em seguida, calcule um vetor contendo três
		 * posições, em que cada posição deverá armazenar a soma dos números de cada
		 * coluna da matriz. Exiba na tela esse array
		 */

		Scanner tc = new Scanner(System.in);
		int mat[][] = new int[3][3];
		int vetSoma[] = new int[3];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print("Linha " + (i + 1) + "/Coluna " + (j + 1) + ": ");
				mat[i][j] = tc.nextInt();
				vetSoma[j] += mat[i][j];
			}

		}

		for (int i = 0; i < vetSoma.length; i++) {
			System.out.println("Soma " + (i + 1) + "° Coluna: " + vetSoma[i]);
		}
		
		tc.close();
	}

}
