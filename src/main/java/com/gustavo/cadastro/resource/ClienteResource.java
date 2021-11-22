package com.gustavo.cadastro.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gustavo.cadastro.domain.Cliente;
import com.gustavo.cadastro.repository.ClienteRepository;

@RestController
@RequestMapping(value="api")
public class ClienteResource {
	@Autowired
	ClienteRepository clienteRepository;
	
	@GetMapping("/cliente")
	public List<Cliente> listaClientes(){
		return clienteRepository.findAll();
	}
}
