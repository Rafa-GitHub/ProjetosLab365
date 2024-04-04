package bercario;

import java.sql.Date;

import bercarioEntidades.Bebe;
import bercarioEntidades.Mae;
import bercarioEntidades.Medico;

public class BercarioMain {

	public static void main(String[] args) {
		
		
		Mae mae01 = new Mae();
		mae01.setNomeCompleto("Maria de souza");
		mae01.setCelular("0001");

		Medico medico01 = new Medico();
		medico01.setNomeCompleto("Rafael");
		Medico medico02 = new Medico();
		medico02.setNomeCompleto("joao");
		
		Bebe bebe01 = new Bebe("Joao Felipe", new Date(0), "av mov", medico01, mae01);
		Bebe bebe02 = new Bebe("Joao", new Date(1), "av mo", medico02, mae01);
		
		System.out.println(bebe01.equals(bebe02));
		System.out.println(bebe02.hashCode() + " | " + bebe01.hashCode());
		
		//System.out.println(bebe01.exibirInfo());
		
	}

}
