package com.uca.capas.domain;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(schema = "public", name="contribuyente")
public class Contribuyente {
	
	@Id
	@GeneratedValue(generator = "contribuyente_c_contirbuyente_seq",strategy = GenerationType.AUTO)
	@SequenceGenerator(sequenceName = "contribuyente_c_contirbuyente_seq",name = "contribuyente_c_contirbuyente_seq",allocationSize = 1)
	@Column(name = "c_contribuyente")
	private int ccontribuyente;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "c_importancia",referencedColumnName = "c_importancia")
	private Importancia importancia;
	
	@Column(name = "s_nombre")
	private String nombre;
	
	
	@Column(name = "s_apellido")
	private String apellido;

	@Column(name = "s_nit")
	private String nit;
	
	@Column(name = "f_fecha_ingreso")
	private Date fechaingreso;

	public int getCcontribuyente() {
		return ccontribuyente;
	}

	public void setCcontribuyente(int ccontribuyente) {
		this.ccontribuyente = ccontribuyente;
	}

	public Importancia getImportancia() {
		return importancia;
	}

	public void setImportancia(Importancia importancia) {
		this.importancia = importancia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public Date getFechaingreso() {
		return fechaingreso;
	}

	public void setFechaingreso(Date fechaingreso) {
		this.fechaingreso = fechaingreso;
	}

	public Contribuyente(int ccontribuyente, Importancia importancia, String nombre, String apellido, String nit,
			Date fechaingreso) {
		super();
		this.ccontribuyente = ccontribuyente;
		this.importancia = importancia;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nit = nit;
		this.fechaingreso = fechaingreso;
	}

	public Contribuyente() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
}
