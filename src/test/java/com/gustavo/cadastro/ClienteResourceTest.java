package com.gustavo.cadastro;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.gustavo.cadastro.domain.Cliente;
import com.gustavo.cadastro.resource.ClienteResource;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class ClienteResourceTest {
	@Autowired
	private ClienteResource cr;
	
	@Test
	public void listaClienteUnicoTest() {
		Cliente  cliente= new Cliente();
		cliente.setNome("Yoshi");
		assertEquals("1", cr.listaClienteUnico(1));
		assertEquals("Yoshi", cliente.getNome());
	}
	
}
