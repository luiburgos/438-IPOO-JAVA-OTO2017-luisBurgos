package com.luisburgos.ipoo.repuestos.datos.cliente;

import java.util.Date;

public class Acceso {

		private Date fechaHoraInicio;
		private Date fechaHoraFin;
		private String ip;
		private Cliente cliente;
		
		
		
		public Acceso (){
			
		}



		public Date getFechaHoraInicio() {
			return fechaHoraInicio;
		}



		public void setFechaHoraInicio(Date fechaHoraInicio) {
			this.fechaHoraInicio = fechaHoraInicio;
		}



		public Date getFechaHoraFin() {
			return fechaHoraFin;
		}



		public void setFechaHoraFin(Date fechaHoraFin) {
			this.fechaHoraFin = fechaHoraFin;
		}



		public String getIp() {
			return ip;
		}



		public void setIp(String ip) {
			this.ip = ip;
		}



		public Cliente getCliente() {
			return cliente;
		}



		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}
		
		
}
