package com.gui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.model.Employee;

public class GuiEmployee {

	Scanner scan = new Scanner(System.in);
	List<Employee> employeeList = new ArrayList<>();

	public void menuFuncionario() {
		
		System.out.println("\nMenu Funcionario" + "\n" + "[1] Adicionar" + "\n" + "[2] Consultar" + "\n" + "[3] Voltar");
		int opt = scan.nextInt();
		
		switch (opt) {
		case 1: {
			Employee employee = new Employee();
			System.out.println("Preencha os dados a baixo para adicionar um novo funcionario" + "\n");
			System.out.println("Nome: ");
			employee.setName(scan.next());
			System.out.println("Idade: ");
			employee.setAge(scan.nextInt());
			System.out.println("Cpf: ");
			employee.setCpf(scan.next());
			System.out.println("Cidade: ");
			employee.setCity(scan.next());
			System.out.println("Função: ");
			employee.setFunction(scan.next());
			System.out.println("Qual o seu status?");
			System.out.println("[1] Ativo" + "\n" + "[2] Inativo");
			int resp = scan.nextInt();
			if (resp == 1) {
				employee.setStatus(true);
			} else if (resp == 2) {
				employee.setStatus(false);
			} else {
				System.out.println("Erro no cadastro: Resposta inválida, retornando ao menu");
				menuFuncionario();
			}

			employeeList.add(employee);
			System.out.println("Cadastro realizado com sucesso");
			menuFuncionario();
			break;
		}
		case 2: {
			
//			for (int i = 0; i < employeeList.size(); i++) {
//				employee = employeeList.get(i);
//				System.out.println("Funcionário" + (i + 1) + "\n");
//				System.out.println(employeeList.toString());
//			}
			menuFuncionario();
			break;
		}

		case 3: {
			GuiMenu contMenu = new GuiMenu();
			contMenu.mainMenu();
			break;
		}
		default:
			System.out.println("Opção Inválida, retornando ao menu cliente");

		}
		scan.close();
	}
}
