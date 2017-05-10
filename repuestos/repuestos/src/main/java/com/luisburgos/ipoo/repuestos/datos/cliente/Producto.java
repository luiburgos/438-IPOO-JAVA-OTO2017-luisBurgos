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

		
		//metodo (source - generate getters and setters - seleccionar last member
		
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

		public String getImagen() {
			return imagen;
		}

		public void setImagen(String imagen) {
			this.imagen = imagen;
		}

		public Double getPrecio() {
			return precio;
		}

		public void setPrecio(Double precio) {
			this.precio = precio;
		}		
	
		
		
		
		// fin de la clase
		
	
	
}
