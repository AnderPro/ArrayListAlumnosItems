package com.epn;

public class Item {
	private String nomitem;
	private int cantidad;
	
	public Item(String nomitem, int cantidad) {
		super();
		this.nomitem = nomitem;
		this.cantidad = cantidad;
	}
	public Item() {
		super();
	}
	
	
	public String getNomitem() {
		return nomitem;
	}
	public void setNomitem(String nomitem) {
		this.nomitem = nomitem;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "Item" + nomitem + cantidad ;
	}
	
	
	
	

}
