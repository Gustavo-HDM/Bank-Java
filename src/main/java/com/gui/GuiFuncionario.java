package com.gui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.model.Funcionario;

public class GuiFuncionario {
	
	Telas tela = new Telas();
	Scanner scan = new Scanner(System.in);
	List<Funcionario> listaFuncionario = new ArrayList<>();
	
	public void menuFuncionario() {
	
		Funcionario funcionario = new Funcionario();
		tela.telaFuncionario();
		int opt = scan.nextInt();
		switch (opt) {
		case 1: {
			System.out.println("Preencha os dados a baixo para adicionar um novo funcionario" + "\n");
			System.out.println("Nome: ");
			funcionario.setNome(scan.next());
			System.out.println("Idade: ");
			funcionario.setIdade(scan.nextInt());
			System.out.println("Cpf: ");
			funcionario.setCpf(scan.next());
			System.out.println("Cidade: ");
			funcionario.setCidade(scan.next());
			System.out.println("Função: ");
			funcionario.setFuncao(scan.next());
			System.out.println("Qual o seu status?");
			System.out.println("[1] Ativo" + "\n" +
							   "[2] Inativo");
			int resp = scan.nextInt();
			
			//PODERIA SER UM SWITCH CASE
			if (resp == 1) {
				funcionario.setStatus(true);
			} else if (resp == 2) {
				funcionario.setStatus(false);
			} else {
				System.out.println("Erro no cadastro: Resposta inválida, retornando ao menu");
				menuFuncionario();
			}
			
			listaFuncionario.add(funcionario);
			System.out.println("Cadastro realizado com sucesso");
			menuFuncionario();
			break;
		}
		case 2: {
			for (int i = 0; i < listaFuncionario.size(); i++) {
				funcionario = listaFuncionario.get(i);
				System.out.println("Funcionário" + (i + 1) + "\n");
				System.out.println(funcionario.toString());
			}
			menuFuncionario();
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
