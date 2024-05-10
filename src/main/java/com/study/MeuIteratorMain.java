package com.study;

import java.util.StringJoiner;

public class MeuIteratorMain {

	public static void main(String[] args) {
		
		String[] nomes = {"Lucas", "Marcos", "Leonardo", "Gustavo", "Leonardo"};
		
		MeuIterator<String> iterator = new MeuIterator<>(nomes);
		
		while(iterator.hasNext()) {
			String nome = iterator.next();
			System.out.println(nome);
		}
		
		StringJoiner lista = new StringJoiner(",");
		lista.add("Lucas");
		lista.add("Marcos");
		lista.add("Pedro");
		
		System.out.println(lista.toString());
	}
}
