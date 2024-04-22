package com.study;

public class MainImutavel {

	public static void main(String[] args) {
		PessoaImutavel pImu = new PessoaImutavel("Gustavo", 20);
		PessoaImutavel pImu2 = new PessoaImutavel("Gustavo", 20);
		
		System.out.println(pImu.getNome());
		
		PessoaRecord pRec = new PessoaRecord("Antonio", "12345678945");
		
		System.out.println(pRec.nome());
	}
}
