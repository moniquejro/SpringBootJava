package com.BoasPraticas.pratica.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BoasPraticas.pratica.model.postVeiculo;
import com.BoasPraticas.pratica.repository.praticaRepository;

@RestController
@RequestMapping("/praticas")
@CrossOrigin("*")
public class praticaController {
	
	@Autowired
	private praticaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<postVeiculo>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<postVeiculo> GetById(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/tipo/{tipo}")
	public ResponseEntity<List<postVeiculo>> GetByTipo(@PathVariable String tipo){
		return ResponseEntity.ok(repository.findAllByTipoContainingIgnoreCase(tipo));
	}
	
	@PostMapping
	public ResponseEntity<postVeiculo> post (@RequestBody postVeiculo tipo){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(tipo));
	}
	
	@PutMapping
	public ResponseEntity<postVeiculo> put (@RequestBody postVeiculo tipo){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(tipo));
	}
	
	@GetMapping("/modelo/{modelo}")
	public ResponseEntity<List<postVeiculo>> GetByModelo(@PathVariable String modelo){
		return ResponseEntity.ok(repository.findAllByModeloContainingIgnoreCase(modelo));
	}
	
	@DeleteMapping ("/{id}") //interpolação
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}

}
