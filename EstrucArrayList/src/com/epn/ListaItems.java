package com.epn;

import java.util.ArrayList;

public class ListaItems {
	
	private ArrayList<Item>listaItem;
	private int tamaño;

	public ListaItems(ArrayList<Item> listaItem) {
		super();
		this.listaItem = listaItem;
	}

	public ListaItems() {
		super();
		listaItem= new ArrayList<Item>();
	}
	
	public String capturadorDeItemsIncompletos (){
		String salida="";
		
		for (Item item : listaItem) {
			
		 
			if(item.getCantidad()==0){
				salida+=item.getNomitem()+"\n";
				
			}
			
			
		}
		return salida;
	}

	
	public void agregar(Item es){ 
		 
			listaItem.add(es) ;
			tamaño++;
		 
		}
	
	public String verificadorDeCompra(Item es){
		if(es.getCantidad()==0 || es.getNomitem().equals(" ")){
			return "No esta listo";
		}else{
			return "Listo";
		}
	}

	@Override
	public String toString() {
		String salida="";
		for (Item item : listaItem) {
			salida+=item.getNomitem()+"\t"+item.getCantidad()+"\t"+verificadorDeCompra(item)+"\n";
			
			
		}
		return salida;
	}
	
	
	


}
