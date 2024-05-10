package com.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListaSet {

	
	public static void main(String[] args) {
		
		List<String> listaNomes = new ArrayList<>(Arrays.asList("Lucas", "Matheus", "Antonio", "Caio", "Antonio"));
		Set<String> setNomes = new HashSet<>();
		
		for (String nomes : listaNomes) {
			setNomes.add(nomes);
		}
		
		Iterator<String> iterator = setNomes.iterator();
		
		while(iterator.hasNext()) {
			String nome = iterator.next();
			System.out.println(nome);
		}
	}
}
