package com.gui;

import java.util.Scanner;

import com.controller.EmployeeController;
import com.model.Employee;

public class GuiEmployee {

	Scanner scan = new Scanner(System.in);
	GuiMenu mainMenu = new GuiMenu();
	EmployeeController controller = new EmployeeController();

	public void employeeMenu() {
		
		System.out.println("\nMenu Funcionario" + "\n" + "[1] Adicionar" + "\n" + "[2] Consultar" + "\n" + "[3] Voltar");
		int opt = scan.nextInt();
		
		switch (opt) {
		case 1: {
			Employee employee = new Employee();
			System.out.println("Preencha os dados a baixo para adicionar um novo funcionario" + "\n");
			System.out.print("Nome: ");
			employee.setName(scan.next());
			System.out.print("Idade: ");
			employee.setAge(scan.nextInt());
			System.out.print("Cpf: ");
			employee.setCpf(scan.next());
			System.out.print("Cidade: ");
			employee.setCity(scan.next());
			System.out.print("Função: ");
			employee.setFunction(scan.next());
			System.out.print("Salario: ");
			employee.setSalary(scan.nextDouble());
			System.out.println("Qual o seu status?");
			System.out.println("[1] Ativo" + "\n" + "[2] Inativo");
			int resp = scan.nextInt();
			if (resp == 1) {
				employee.setStatus(true);
			} else if (resp == 2) {
				employee.setStatus(false);
			} else {
				System.out.println("Erro no cadastro: Resposta inválida, retornando ao menu");
				employeeMenu();
			}
			controller.create(employee);
			System.out.println("\nCadastro realizado com sucesso");
			employeeMenu();
			break;
		}
		case 2: {
			listing();
			employeeMenu();
			break;
		}

		case 3: {
			mainMenu.mainMenu();
			break;
		}
		default:
			System.out.println("Opcao Inválida");
			employeeMenu();
		}
	}
	
	private void listing() {
		for(int i = 0; i < controller.readAll().length; i++) {
			Employee employee = controller.readAll()[i];
			if (employee != null) {
				System.out.println(employee.toString());
			}
		}
	}
	
	
}
