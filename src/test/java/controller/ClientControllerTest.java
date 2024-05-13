package controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

import com.controller.ClientController;
import com.model.Client;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ClientControllerTest {

	ClientController controller = new ClientController();
	Client client = new Client("Gustavo", "Maringa", 27, "3232323232");
	
	@Test
	@Order(1)
	public void inserir() {
		controller.create(client);
		Client clientResult = controller.read(client.getCpf());
		assertEquals("3232323232", clientResult.getCpf());
		assertEquals(27, clientResult.getAge());
		assertEquals("Maringa", clientResult.getCity());
		assertEquals("Gustavo", clientResult.getName());
	}
	
	@Test
	@Order(2)
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
	@Order(3)
	public void deletar() {
		controller.create(client);
		controller.delete(client.getCpf());
		Client clientResult = controller.read(client.getCpf());
		assertNull(clientResult);
	}
}
