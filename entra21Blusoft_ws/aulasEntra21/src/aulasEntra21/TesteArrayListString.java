package aulasEntra21;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteArrayListString {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		ArrayList<String> lista01 = new ArrayList<>();
		ArrayList<String> lista02 = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite uma palavra: ");
			lista01.add(tc.nextLine());
		}
		
		lista01.forEach(nome -> {
			if(nome.length() < 3) {
				lista02.add(nome);
			}
		});
		
		lista01.removeAll(lista02);
		
		System.out.println("Tamanho da lista 01: " + lista01.size() + " " + lista01);
		System.out.println("Tamanho da lista 01: " + lista02.size() + " " + lista02);
		
		tc.close();
	}

}
