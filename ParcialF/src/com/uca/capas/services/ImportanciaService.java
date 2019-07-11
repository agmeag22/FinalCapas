package com.uca.capas.services;

import java.util.List;
import java.util.Optional;

import com.uca.capas.domain.Importancia;

public interface ImportanciaService {

	
	public List<Importancia> findAll();
	public Importancia findOne(int i);
}
