package com.model;

public class Client extends Person {

	public Client() {
	}

	public Client(String nome, String cidade, int idade, String cpf) {
		super(nome, cidade, idade, cpf);
	}

	@Override
	public String toString() {

		return "\nNome: " + super.getName() + "\nIdade: " + super.getAge() + "\nCPF: " + super.getCpf() + "\nCidade: "
				+ super.getCity() + "\n------------------------------------------";
	}
}
