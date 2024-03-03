package sistema_votacao;

import java.util.Scanner;
import entidades.Candidato;

public class ProgramaVotacao2_0 {

	public static void main(String[] args) {

		Scanner tc = new Scanner(System.in);
		Candidato candidato[] = new Candidato[4];

		candidato[0] = new Candidato("Joãozito da Lua");
		candidato[1] = new Candidato("Rafael Kraetzer");
		candidato[2] = new Candidato("Darthi Veidaera");
		candidato[3] = new Candidato("Patolin Donaldi");

		int op = 0;
		do {
			System.out.println("0-|SAIR");
			for (int i = 0; i < candidato.length; i++) {
				System.out.println(i + 1 + "-|" + candidato[i].name);
			}
			System.out.println("5-|Mostrar resultado");
			System.out.print("->");
			op = tc.nextInt();
			switch (op) {
			case 0:
				break;
			case 1:
				candidato[0].voto += 1;
				break;
			case 2:
				candidato[1].voto += 1;
				break;
			case 3:
				candidato[2].voto += 1;
				break;
			case 4:
				candidato[3].voto += 1;
				break;
			case 5:
				int maior = 0;
				String vencedor = "";
				for (int i = 0; i < candidato.length; i++) {
					System.out.println(candidato[i].toString());
					if (candidato[i].voto > maior) {
						maior = candidato[i].voto;
						vencedor = candidato[i].name;
					}
				}
				System.out.println("\nVENCEDOR: " + vencedor.toUpperCase());
				op = 0;
				break;
			default:
				System.out.println("\nOpção INVALIDA!\n");
				break;
			}
		} while (op != 0);

		System.out.println("\nFim da execução.");
		tc.close();
	}
}
