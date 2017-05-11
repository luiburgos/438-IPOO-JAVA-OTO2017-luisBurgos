package com.luisburgos.ipoo.repuestos.storage;

import com.luisburgos.ipoo.repuestos.datos.cliente.Cliente;
import java.util.ArrayList;
import java.util.List;

public class DummyStorage implements Storage {

	//lista de lcientes de "guau"
		private List<Cliente> clientes;
	
		
		public DummyStorage (){

			//variable para simular in autonumerico de base de datos
			int id=0;
			
			//inicializo el vector
			clientes=new ArrayList<>();
			
			Cliente c=new Cliente();
			c.setId(++id);
			c.setNombre("Luis Burgos");
			c.setNroDoc("2240964");
			c.setTipoDoc("CI");
			c.setPassword("123");
			
			clientes.add(c)		;
			
		}
		

	public Cliente obtCliente(String tipoDoc, String nroDoc, String password) {
		for (Cliente c:clientes){
			if(
					c.getTipoDoc().equals(tipoDoc) &&
					c.getNroDoc().equals(nroDoc) &&
					c.getPassword().equals(password)
					
		){
			//entonces retorno ese cliente
			return c;
		
			}
		}		
		//si no retorno
		
		return null;
	}
	public static void main(String [] args){
		Storage s=new 
	}

	
}
