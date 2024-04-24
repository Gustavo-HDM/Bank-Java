package com.gui;

import java.util.Scanner;

import com.model.Conta;
import com.model.ContaCorrente;
import com.model.ContaPoupanca;

public class Testes {

	
	public static void main(String[] args) {
		
		//ContaCorrente contaCorrente = new ContaCorrente();
		Scanner scan = new Scanner(System.in);
		//Conta conta = new ContaCorrente();
		Double saldo = null;
		System.out.println("Qual o saldo");
		saldo = scan.nextDouble();
		Conta conta = factoryContas(saldo);
		System.out.println(conta.toString());
	}
	
	public static Conta factoryContas(Double saldo) {
		
		if(saldo <= 1000) {
			return new ContaCorrente(saldo);
		} else {
			return new ContaPoupanca(saldo);
		}
	}
}
