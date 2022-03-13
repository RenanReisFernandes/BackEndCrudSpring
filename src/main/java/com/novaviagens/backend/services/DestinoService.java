package com.novaviagens.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.novaviagens.backend.domain.Destino;
import com.novaviagens.backend.repositories.DestinoRepository;

@Service
public class DestinoService {

	
	@Autowired
	private DestinoRepository repository;
	
	public Destino save(Destino obj) {
		return repository.save(obj);
	}
	
	public List<Destino> findAll(){
		return repository.findAll();
	}
	
	public Destino update(Destino obj) {
		return repository.save(obj);
		
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
