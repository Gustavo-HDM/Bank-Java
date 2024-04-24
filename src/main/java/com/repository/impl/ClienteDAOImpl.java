package com.repository.impl;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;

import com.model.Cliente;
import com.repository.ClienteDAO;

public class ClienteDAOImpl implements ClienteDAO{

	private List<Cliente> listaCliente = new ArrayList<Cliente>();

	public List<Cliente> getListaCliente() {
		return listaCliente;
	}

	@Override
	public void create(Cliente cliente) {
		this.listaCliente.add(cliente);
	}

	@Override
	public List<Cliente> readAll() {
		return listaCliente;
	}

	@Override
	public void delete(String cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Cliente cliente, String cpf) {
		// TODO Auto-generated method stub
		
	}

//	List<Cliente> listaCliente = new ArrayList<>();
//	List<Funcionario> listaFuncionario = new ArrayList<>();
//	List<Conta> listaContas = new ArrayList<>();
	//USAR LISTAS PARA CLIENTE E FUNCIONARIO OU PARA PESSOA?
	//List<Pessoa> listaPessoas = new ArrayList<>();
}
