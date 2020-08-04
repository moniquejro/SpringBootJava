package com.testep.testep.controller;

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

import com.testep.testep.model.ProdutorM;
import com.testep.testep.repository.ProdutorMrepository;

@RestController
@RequestMapping("/produtor")
@CrossOrigin("*")
public class ProdutorMcontroller {
	
	@Autowired
	private ProdutorMrepository repository;
	
	@GetMapping
	public ResponseEntity<List<ProdutorM>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ProdutorM> GetById(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<ProdutorM> post (@RequestBody ProdutorM produtor){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produtor));
	}
	
	@PutMapping
	public ResponseEntity<ProdutorM> put (@RequestBody ProdutorM produtor){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(produtor));
	}
	
	@DeleteMapping ("/{id}")
	public void delete (@PathVariable long id) {
		repository.deleteById(id);
	}
}
