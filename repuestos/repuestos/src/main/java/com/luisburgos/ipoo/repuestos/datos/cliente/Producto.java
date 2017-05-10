package com.luisburgos.ipoo.repuestos.datos.cliente;


//Inicio de la clase
//nomenclatura: visibilidad class nombre de la clase
public class Producto {

	//atributos
	private int id;
	private String nombre;
	private String descripcion;
	private String imagen;
	private Double precio;
	
	//constructor 1
		public Producto () {
			
		}

		//constructor 2 (source- generate constructor using field
		
		public Producto(int id, String nombre, String descripcion, String imagen, Double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.precio = precio;
	}		
	
		//metodo
		
		
	
	
}
