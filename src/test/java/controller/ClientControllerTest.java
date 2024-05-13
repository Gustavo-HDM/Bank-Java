package controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.controller.ClientController;
import com.model.Client;

public class ClientControllerTest {

	ClientController controller = new ClientController();
	Client client = new Client("Gustavo", "Maringa", 27, "3232323232");
	
	@Test
	public void inserir() {
		controller.create(client);
		Client clientResult = controller.read(client.getCpf());
		assertEquals("3232323232", clientResult.getCpf());
		assertEquals(27, clientResult.getAge());
		assertEquals("Maringa", clientResult.getCity());
		assertEquals("Gustavo", clientResult.getName());
	}
	
	@Test
	public void atualizar() {
		controller.create(client);
		Client newClient = new Client("Guilherme", "Londrina", 30, "6565656565");
		controller.update(newClient, client.getCpf());
		Client clientResult = controller.read(newClient.getCpf());
		assertEquals("6565656565", clientResult.getCpf());
		assertEquals(30, clientResult.getAge());
		assertEquals("Londrina", clientResult.getCity());
		assertEquals("Guilherme", clientResult.getName());
	}
	
	@Test
	public void deletar() {
		controller.create(client);
		controller.delete(client.getCpf());
		Client clientResult = controller.readAll().get(0);
		assertNull(clientResult);
	}
}
