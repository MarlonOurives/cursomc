package com.marlonourives.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marlonourives.cursomc.domain.Pedido;
import com.marlonourives.cursomc.repositories.PedidoRepository;
import com.marlonourives.cursomc.services.exceptions.ObjectNotFoundException;

import java.util.Optional;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;

	public Pedido find(Integer id) {
		 Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		 "Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	} 
}
