package controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.PedidosDto;
import dtos.VentasDto;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
//Clase principal de la aplicacion
//@author= CMR - 01/03/2024
public class Inicio {
	//Metodo principal de entrada de nuestra aplicacion
	//@author= CMR - 01/03/2024
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<PedidosDto> listaPedidos = new ArrayList<PedidosDto>();
		List<VentasDto> listaVentas = new ArrayList<VentasDto>();

		MenuInterfaz mi = new MenuImplementacion();

		boolean cerrarMenu = false;
		int opcionSeleccion;

		do {
			opcionSeleccion = mi.menuYSeleccionPrincipal(sc);

			switch (opcionSeleccion) {
			case 0:
				System.out.println("Se ha cerrado la aplicacion");
				cerrarMenu = true;
				break;

			case 1:
				System.out.println("Has seleccionado menu Empleado");
				mi.accesoMenuEmpleado( sc , listaVentas);
				break;

			case 2:
				System.out.println("Has seleccionado menu Gerencia");
				mi.accesoMenuGerencia(sc);
				break;

			default:
				System.out.println("La opcion indicada no corresponde con ninguna");
				break;

			}

		} while (!cerrarMenu);

	}

}
