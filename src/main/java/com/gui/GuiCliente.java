package com.gui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.model.Cliente;

public class GuiCliente {
	
	Telas tela = new Telas();
	Scanner scan = new Scanner(System.in);
	List<Cliente> listaCliente = new ArrayList<>();
	
	public void menuCliente() {
	
		Cliente cliente = new Cliente();
		tela.telaCliente();
		int opt = scan.nextInt();
		
		switch (opt) {
		case 1: {
			System.out.println("Preencha os dados a baixo para adicionar um novo cliente" + "\n");
			System.out.println("Nome: ");
			cliente.setNome(scan.next());
			System.out.println("Idade: ");
			cliente.setIdade(scan.nextInt());
			System.out.println("Cpf: ");
			cliente.setCpf(scan.next());
			System.out.println("Cidade: ");
			cliente.setCidade(scan.next());
			
			
			listaCliente.add(cliente);
			System.out.println("Cadastro realizado com sucesso");
			menuCliente();
			break;
		}
		case 2: {
			for (int i = 0; i < listaCliente.size(); i++) {
				cliente = listaCliente.get(i);
				System.out.println("Cliente " + (i + 1) + "\n");
				System.out.println(cliente.toString());;
			}
			menuCliente();
			break;
		}
		
		case 3: {
			GuiMenu contMenu = new GuiMenu();
			contMenu.menuPrincipal();
			break;
		}
		default:
			System.out.println("Opção Inválida, retornando ao menu cliente");
			
		}
		scan.close();
	}
	
}
