package com.epn;

import java.util.ArrayList;

public class Lista {
private  ArrayList<Estudiante>listaestudiante;
private int tamaño;



public Lista(ArrayList<Estudiante> listaestudiante) {
	super();
	this.listaestudiante = listaestudiante;
}



public Lista() {
	super();
	listaestudiante = new ArrayList<Estudiante>();
}
public boolean verificador (Estudiante es){
	
	for (Estudiante estudiante : listaestudiante) {
		if(estudiante.getNombres().compareToIgnoreCase(es.getNombres())==0 && estudiante.getCedula()==es.getCedula()){
			return true;
		}break;
		
		
	}return false;	
}




public void agregar(Estudiante es){ 
	if(verificador(es)==false){ 
		listaestudiante.add(es) ;
		tamaño++;
		
		}else{ 
			
			System.out.println("El estudiante  "+es+"    Ya existe"); 
			} 
	}



@Override
public String toString() {
	String salida="";
	
	for (Estudiante estudiante : listaestudiante) {
		salida+=estudiante+"\t"+"\n";
		
	}
	return salida+"\ntamaño:"+tamaño;
} 


}

