package dtos;



import java.util.Date;


public class VentasDto {

	long idVenta;
	double euros = 11.111;
	Date fechaEntrega = new Date();
	
	public VentasDto(long idVenta, double euros, Date fechaEntrega) {
		super();
		this.idVenta = idVenta;
		this.euros = euros;
		this.fechaEntrega = fechaEntrega;
	}



	
	public long getIdVenta() {
		return idVenta;
	}






	public void setIdVenta(long idVenta) {
		this.idVenta = idVenta;
	}






	public double getEuros() {
		return euros;
	}






	public void setEuros(double euros) {
		this.euros = euros;
	}






	public Date getFechaEntrega() {
		return fechaEntrega;
	}






	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}







	
	public VentasDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
