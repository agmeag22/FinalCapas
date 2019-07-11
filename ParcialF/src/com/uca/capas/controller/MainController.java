package com.uca.capas.controller;

import java.util.Calendar;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Contribuyente;
import com.uca.capas.domain.Importancia;
import com.uca.capas.services.ContribuyenteService;
import com.uca.capas.services.ImportanciaService;

@Controller
public class MainController {
	
	@Autowired
	ContribuyenteService contribuyenteService;
	
	@Autowired
	ImportanciaService importanciaService;
	
	@RequestMapping(value="/")
	public ModelAndView main() {
		ModelAndView mav=new ModelAndView();
		List<Importancia> importancias=null;
		try {
			importancias=importanciaService.findAll();
		} catch (Exception e) {
			// TODO: handle exception
		}
		mav.addObject("importancias",importancias);
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping(value="/mostrar")
	public ModelAndView mostrar() {
		ModelAndView mav=new ModelAndView();
		List<Contribuyente> contribuyentes=null;
		try {
			contribuyentes=contribuyenteService.findAllContribuyente();
		} catch (Exception e) {
			// TODO: handle exception
		}
		mav.addObject("contribuyentes", contribuyentes);
		mav.setViewName("viewall");
		return mav;
	}
	@RequestMapping(value="/guardar",method=RequestMethod.POST)
	public ModelAndView guardar(@RequestParam(name = "nombre")String nombre,@RequestParam(name = "apellido")String apellido ,@RequestParam(name = "nit")String nit,@RequestParam(name = "importancia")int importancia) {
		Contribuyente contribuyente=new Contribuyente();
		contribuyente.setNombre(nombre);
		contribuyente.setApellido(apellido);
		contribuyente.setNit(nit);
		contribuyente.setFechaingreso(Calendar.getInstance().getTime());
		contribuyente.setImportancia(importanciaService.findOne(importancia));
		contribuyenteService.saveContribuyente(contribuyente);
		return new ModelAndView("redirect:/mostrar");
	}
}
