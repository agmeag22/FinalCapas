package com.uca.capas.domain;

import javax.persistence.*;

@Entity
@Table(schema = "public",name = "importancia")
public class Importancia {
	
@Id
@GeneratedValue(generator = "importancia_c_importancia_seq",strategy = GenerationType.AUTO)
@SequenceGenerator(name = "importancia_c_importancia_seq",sequenceName = "importancia_c_importancia_seq",allocationSize = 1)
@Column(name = "c_importancia")
private int cimportancia;

@Column(name = "s_importancia")
private String simportancia;

public int getCimportancia() {
	return cimportancia;
}

public void setCimportancia(int cimportancia) {
	this.cimportancia = cimportancia;
}

public String getSimportancia() {
	return simportancia;
}

public void setSimportancia(String simportancia) {
	this.simportancia = simportancia;
}

public Importancia(int cimportancia, String simportancia) {
	super();
	this.cimportancia = cimportancia;
	this.simportancia = simportancia;
}

public Importancia() {
	super();
	// TODO Auto-generated constructor stub
}




}
