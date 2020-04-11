package com.marlonourives.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marlonourives.cursomc.domain.Categoria;
import com.marlonourives.cursomc.repositories.CategoriaRepository;
import com.marlonourives.cursomc.services.exceptions.ObjectNotFoundException;

import java.util.Optional;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria find(Integer id) {
		 Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		 "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	} 
}
