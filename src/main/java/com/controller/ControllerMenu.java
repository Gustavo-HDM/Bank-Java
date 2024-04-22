package com.controller;

import java.util.Scanner;

import com.tela.Telas;

public class ControllerMenu {
	
	Telas tela = new Telas();
	Scanner scan = new Scanner(System.in);

	public void menuPrincipal() {
		
		tela.telaPrincipal();
		int opt = scan.nextInt();
		
		switch (opt) {
		case 1: {
			ControllerCliente contCliente = new ControllerCliente();
			contCliente.menuCliente();
			break;
		}
		case 2: {
			ControllerFuncionario contFunc = new ControllerFuncionario();
			contFunc.menuFuncionario();
			break;
		}
		case 3: {
			
			break;
		}
		default:
			System.out.println("Opção Inválida, retornando ao menu principal");
		}
		scan.close();
	}
}
