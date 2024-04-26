package com.gui;

import java.util.Scanner;

import com.model.Account;
import com.model.CurrentAccount;
import com.model.SavingsAccount;

public class Testes {

	
	public static void main(String[] args) {
		
		//ContaCorrente contaCorrente = new ContaCorrente();
		Scanner scan = new Scanner(System.in);
		//Conta conta = new ContaCorrente();
		Double saldo = null;
		System.out.println("Qual o saldo");
		saldo = scan.nextDouble();
		Account conta = factoryContas(saldo);
		System.out.println(conta.toString());
	}
	
	public static Account factoryContas(Double saldo) {
		
		if(saldo <= 1000) {
			return new CurrentAccount(saldo);
		} else {
			return new SavingsAccount(saldo);
		}
	}
}
