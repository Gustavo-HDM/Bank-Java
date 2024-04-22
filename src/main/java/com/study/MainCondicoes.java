package com.study;

public class MainCondicoes {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 30;
		
		String escreve = "";
		
		if(a != b) {
			escreve = "É diferente";
		}else {
			escreve = "É igual";
		}
		
		System.out.println(escreve);
		
		// comparacao ? verdadeiro : falso
		
		escreve = a != b ? "É diferente" : "É igual";
		
		System.out.println(escreve);
		
	}
	
}
