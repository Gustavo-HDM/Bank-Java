package com.gui;

import java.util.Scanner;

public class GuiMenu {
	
	Telas tela = new Telas();
	Scanner scan = new Scanner(System.in);

	public void menuPrincipal() {
		
		tela.telaPrincipal();
		int opt = scan.nextInt();
		
		switch (opt) {
		case 1: {
			GuiCliente contCliente = new GuiCliente();
			contCliente.menuCliente();
			break;
		}
		case 2: {
			GuiFuncionario contFunc = new GuiFuncionario();
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
