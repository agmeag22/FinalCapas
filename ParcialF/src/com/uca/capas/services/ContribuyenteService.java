package com.uca.capas.services;

import java.util.List;

import com.uca.capas.domain.Contribuyente;

public interface ContribuyenteService {
	public void saveContribuyente(Contribuyente contribuyente);
	public List<Contribuyente> findAllContribuyente();
}
