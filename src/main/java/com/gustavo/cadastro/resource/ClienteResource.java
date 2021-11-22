package com.gustavo.cadastro.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gustavo.cadastro.domain.Cliente;
import com.gustavo.cadastro.repository.ClienteRepository;



@RestController
@RequestMapping(value="/api")

@CrossOrigin(origins="*")
public class ClienteResource {
	@Autowired
	ClienteRepository clienteRepository;
	
	@GetMapping("/clientes")

	public List<Cliente> listaClientes(){
		return clienteRepository.findAll();
	}
	@GetMapping("/cliente/{id}")

	public Optional<Cliente> listaClienteUnico(@PathVariable Integer id){
		return clienteRepository.findById(id);
	}
	@PostMapping("/cliente")

	public Cliente salvarCliente(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	@DeleteMapping("/cliente")

	public void deletaCliente(@RequestBody Cliente cliente) {
		clienteRepository.delete(cliente);
	}
	@PutMapping("/cliente")

	public Cliente atualizaCliente(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
}