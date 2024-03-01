package dtos;

import java.time.LocalDate;

public class PedidosDto {
	


	long idPedido;
	String nombreProducto = "aaaaaa";
	int cantidadProducto = 1;
	LocalDate fechaEntrega;
	
	
	public long getIdPedido() {
		return idPedido;
	}




	public void setIdPedido(long idPedido) {
		this.idPedido = idPedido;
	}




	public String getNombreProducto() {
		return nombreProducto;
	}




	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}




	public int getCantidadProducto() {
		return cantidadProducto;
	}




	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}




	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}




	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}




	
	
	
	
	public PedidosDto(long idPedido, String nombreProducto, int cantidadProducto, LocalDate fechaEntrega) {
		super();
		this.idPedido = idPedido;
		this.nombreProducto = nombreProducto;
		this.cantidadProducto = cantidadProducto;
		this.fechaEntrega = fechaEntrega;
	}
	
	
	public PedidosDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
