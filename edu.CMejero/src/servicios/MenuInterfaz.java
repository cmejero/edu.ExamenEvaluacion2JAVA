package servicios;

import java.util.List;
import java.util.Scanner;

import dtos.VentasDto;
//Clase que se encarga de las acciones del menu de gerencia.
//@author= CMR - 01/03/2024
public interface MenuInterfaz {

	//método que se encarga del menu principal de la aplicacion
	// @author= CMR - 01/03/2024
	public int menuYSeleccionPrincipal(Scanner sc);
	
	//método que se encarga del acceso al menu de empleado
		// @author= CMR - 01/03/2024
	public void accesoMenuEmpleado(Scanner sc , List<VentasDto> listaVentas);
	
	//método que se encarga del acceso al menu de gerencia
		// @author= CMR - 01/03/2024
	public void accesoMenuGerencia(Scanner sc);
}
