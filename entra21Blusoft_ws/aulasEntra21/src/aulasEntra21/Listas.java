package aulasEntra21;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Listas {

	public static void main(String[] args) {
		
		
		//Listas
		List <String> stringLista = new ArrayList<>();
		
		stringLista.add("Rafa");
		stringLista.add("Lika");
		stringLista.add("João");
		
		stringLista.forEach(System.out::println);
		//------------------------------------------------------------------
		//Filas
		Queue<Integer> filaNumeros = new LinkedList<>();
		
		//adiciona elementos na fila
		for(int i = 0; i < 5; i++) {
			filaNumeros.add(i);
		}
		//removendo o 1° elemento da fila
		System.out.println("Elementos da fila: " + filaNumeros);
		int itemRemovido = filaNumeros.remove();
		System.out.println("Elemento removido: " + itemRemovido);
		
		System.out.println("Elementos da fila atualizada: " + filaNumeros);
		//visualizando o 1° elemento da fila
		int primeiro = filaNumeros.peek();
		System.out.println("1° elemento da fila: " + primeiro);
		//------------------------------------------------------------------
		
		PriorityQueue<Integer> integerQueue = new PriorityQueue<>();
		integerQueue.add(9);
		integerQueue.add(2);
		integerQueue.add(4);
		int first = integerQueue.poll();
		int second = integerQueue.poll();
		int third = integerQueue.poll();
		System.out.println("first:" + first);
		System.out.println("second:" + second);
		System.out.println("third:" + third);
		
		
	}

}
