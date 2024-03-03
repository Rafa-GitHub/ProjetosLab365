package sistema_votacao;

import java.util.Scanner;
import entidades.Candidato;

public class ProgramaVotação {

	public static void main(String[] args) {

		Scanner tc = new Scanner(System.in);

		Candidato candidato01 = new Candidato("João");
		Candidato candidato02 = new Candidato("Rafa");
		Candidato candidato03 = new Candidato("Kaje");
		Candidato candidato04 = new Candidato("Loki");

		int op = 0;
		do {
			System.out.println("---------------------------");
			System.out.println("|0--SAIR");
			System.out.println("|1--" + candidato01.name);
			System.out.println("|2--" + candidato02.name);
			System.out.println("|3--" + candidato03.name);
			System.out.println("|4--" + candidato04.name);
			System.out.println("|5--Mostrar resultado");
			System.out.printf("---------------------------\n->");

			op = tc.nextInt();
			switch (op) {
			case 0:
				break;
			case 1:
				candidato01.voto += 1;
				break;
			case 2:
				candidato02.voto += 1;
				break;
			case 3:
				candidato03.voto += 1;
				break;
			case 4:
				candidato04.voto += 1;
				break;
			case 5:
				if(candidato01.voto > candidato02.voto && candidato01.voto > candidato03.voto && candidato01.voto > candidato04.voto) {
					System.out.println(candidato01.toString() + "--->VENCEDOR<---");
					System.out.println(candidato02.toString());
					System.out.println(candidato03.toString());
					System.out.println(candidato04.toString());
				}else if(candidato02.voto > candidato03.voto && candidato02.voto > candidato04.voto) {
					System.out.println(candidato01.toString());
					System.out.println(candidato02.toString() + "--->VENCEDOR<---");
					System.out.println(candidato03.toString());
					System.out.println(candidato04.toString());
				}else if(candidato03.voto > candidato04.voto) {
					System.out.println(candidato01.toString());
					System.out.println(candidato02.toString());
					System.out.println(candidato03.toString() + "--->VENCEDOR<---");
					System.out.println(candidato04.toString());
				}else {
					System.out.println(candidato01.toString());
					System.out.println(candidato02.toString());
					System.out.println(candidato03.toString());
					System.out.println(candidato04.toString() + "--->VENCEDOR<---");
				}
				op = 0;
				break;
			}
		} while (op != 0);
		System.out.println("\nFim da execução.");
		tc.close();
	}
}
