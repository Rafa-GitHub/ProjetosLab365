package aulasEntra21;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		
		List <String> stringLista = new ArrayList<>();
		
		stringLista.add("Rafa");
		stringLista.add("Lika");
		stringLista.add("João");
		
		stringLista.forEach(System.out::println);
		

	}

}
