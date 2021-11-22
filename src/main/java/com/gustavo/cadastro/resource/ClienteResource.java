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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Clientes")
@CrossOrigin(origins="*")
public class ClienteResource {
	@Autowired
	ClienteRepository clienteRepository;
	
	@GetMapping("/clientes")
	@ApiOperation(value="Retorna uma lista de clientes")
	public List<Cliente> listaClientes(){
		return clienteRepository.findAll();
	}
	@GetMapping("/cliente/{id}")
	@ApiOperation(value="Retorna um cliente unico")
	public Optional<Cliente> listaClienteUnico(@PathVariable Integer id){
		return clienteRepository.findById(id);
	}
	@PostMapping("/cliente")
	@ApiOperation(value="Salva um cliente")
	public Cliente salvarCliente(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	@DeleteMapping("/cliente")
	@ApiOperation(value="Deleta um cliente")
	public void deletaCliente(@RequestBody Cliente cliente) {
		clienteRepository.delete(cliente);
	}
	@PutMapping("/cliente")
	@ApiOperation(value="Atualiza um cliente")
	public Cliente atualizaCliente(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
}