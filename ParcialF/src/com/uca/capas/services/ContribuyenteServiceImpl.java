package com.uca.capas.services;

import java.util.*;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Contribuyente;
import com.uca.capas.repositories.ContribuyenteRepository;

@Service
public class ContribuyenteServiceImpl implements ContribuyenteService {

	@Autowired
	private ContribuyenteRepository coRepo;
	
	
	@Transactional
	public void saveContribuyente(Contribuyente contribuyente) {
		coRepo.save(contribuyente);
		
	}
	
	public List<Contribuyente> findAllContribuyente() {
		return coRepo.findAll();
	}	
	
}
