package com.epn;

public class Estudiante {
	private String nombres;
	private long cedula;
	
	
	public Estudiante(String nombres, long cedula) {
		super();
		this.nombres = nombres;
		this.cedula = cedula;
	}


	public Estudiante() {
		super();
		this.nombres=null;
		//this.cedula=0;
	}
	
	


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public long getCedula() {
		return cedula;
	}


	public void setCedula(long cedula) {
		this.cedula = cedula;
	}


	@Override
	public String toString() {
		return nombres +"\t\t\t"+ cedula ;
	}
	
	
	
	
	

}
