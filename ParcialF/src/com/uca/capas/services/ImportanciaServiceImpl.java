package com.uca.capas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Importancia;
import com.uca.capas.repositories.ImportanciaRepository;

@Service
public class ImportanciaServiceImpl implements ImportanciaService{

	
	@Autowired
	ImportanciaRepository imRepo;
	
	
	public List<Importancia> findAll(){
		return imRepo.findAll();
	}

	@Override
	public Importancia findOne(int i) {
		return imRepo.getOne(i);
	}
}
