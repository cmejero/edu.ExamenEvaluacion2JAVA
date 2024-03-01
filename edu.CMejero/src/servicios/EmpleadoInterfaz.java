package servicios;

import java.util.List;
import java.util.Scanner;

import dtos.VentasDto;
//Clase que se encarga de las acciones del menu de empleado.
//@author= CMR - 01/03/2024
public interface EmpleadoInterfaz {

	//método que se encarga de calcular las ventas diarias
		// @author= CMR - 01/03/2024
	public void calculoVentasDiarias(Scanner sc);
	
	
	//método que se encarga de aniadir una nueva venta
		// @author= CMR - 01/03/2024
	public void aniadirVenta(List<VentasDto> listaVentas , Scanner sc);
}
