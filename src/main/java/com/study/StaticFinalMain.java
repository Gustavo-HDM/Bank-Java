package com.study;

public class StaticFinalMain {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Gustavo");
		pessoa.idade = 50;
		System.out.println(pessoa.idade);
		
		Pessoa pessoa1 = new Pessoa();
		pessoa.setNome("Antonio");
		
		System.out.println(pessoa1.idade);
		
		System.out.println(Pessoa.ALTURA);
	}
	
}
