package com.epn;

public class AppMain {

	public static void main(String[] args) {
		
	System.out.println("*********LISTA DE ALUMNOS**************\n");
	
	System.out.println("NOMBRE                        CI");
		
	Lista lis = new Lista();
	Estudiante es = new Estudiante("ANderson REvelo",1 );
	lis.agregar(es);
	
	
	
	Estudiante es2= new Estudiante("Israel Perez",1767);
	lis.agregar(es2);
	
	Estudiante es3= new Estudiante ("Miguel Parra",1223);
	lis.agregar(es3);
	
	Estudiante es4= new Estudiante("Eliza Mena",1);
	lis.agregar(es4);
		System.out.println(lis);
	
	
	System.out.println("************BUSQUEDA DEL ESTUDIANTE(CONSULTA)************\n");	
	
	Estudiante esbuscar = new Estudiante("Isac Newton",1);

	if(lis.verificador(esbuscar)==true){
		System.out.println("El estudiante   "+esbuscar+"   esta en la asigantura");
	}else{
		System.out.println("El estudiante  "+esbuscar+"  No existe ");
	}
	
	
	System.out.println("\n***************** ITEMS COMPRA*****************\n");
	String itemsinCompletar="";
	ListaItems listaitems= new ListaItems();
	
	Item it= new Item("Atún",3);
	listaitems.agregar(it);
	
	Item it2= new Item("Arroz",0);
	listaitems.agregar(it2);
			
	
	Item it3= new Item("Azúcar",3);
	listaitems.agregar(it3);
	
	Item it4= new Item("Arina",0);
	listaitems.agregar(it4);
	
	System.out.println(listaitems);
	
	System.out.println("**************PRODUCTOS INCOMPLETOS******************");
	
	System.out.println(listaitems.capturadorDeItemsIncompletos());
	
	
	


	
	
	
	

	}

}

