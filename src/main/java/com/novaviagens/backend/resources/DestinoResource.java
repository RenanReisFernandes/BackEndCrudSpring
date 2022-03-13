package com.novaviagens.backend.resources;

import java.util.List;

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

import com.novaviagens.backend.domain.Destino;
import com.novaviagens.backend.services.DestinoService;


@RestController
@RequestMapping("/meusdestinos")
@CrossOrigin(origins = "http://localhost:3000/")
public class DestinoResource {
	
	
	@Autowired
	private DestinoService service;
	
	
	
	@GetMapping
	public List<Destino> findAll(){
		return service.findAll();
	}
	
	@PostMapping
	public Destino save(@RequestBody Destino obj) {
		return service.save(obj);
	}
	
	@PutMapping
	public Destino update(@RequestBody Destino obj) {
		return service.save(obj);
	}
	
	
	@DeleteMapping(value ="/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
	
	

}
