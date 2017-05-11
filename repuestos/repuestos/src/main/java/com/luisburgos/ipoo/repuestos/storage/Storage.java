package com.luisburgos.ipoo.repuestos.storage;

import com.luisburgos.ipoo.repuestos.datos.cliente.Cliente;

// declaracion de interface 
public interface Storage {

	Cliente obtCliente(String tipoDoc, String nroDoc, String password);
	
	
	
}
