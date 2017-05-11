package com.luisburgos.ipoo.repuestos.datos.cliente;
	//Inicio de la Clase

public class Marca {

	private int id;
	private String nombre;
	private String descripcion;
	
	// constructor 1
	
public Marca () {
		
	}
	
	//constructor 2

public Marca(int id, String nombre, String descripcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}


	//metodos


public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

	
	


}
