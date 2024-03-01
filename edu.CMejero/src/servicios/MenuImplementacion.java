package servicios;

import java.util.List;
import java.util.Scanner;

import dtos.VentasDto;

//metodo que implementa al Menu interfaz
// @author= CMR - 01/03/2024
public class MenuImplementacion implements MenuInterfaz {

	public int menuYSeleccionPrincipal(Scanner sc) {
		int opcionUsuario;
		System.out.println("#######################");
		System.out.println("0. Cerrar Aplicacion");
		System.out.println("1. Menu Empleado");
		System.out.println("2. Menu Gerencia");
		System.out.println("#######################");
		opcionUsuario = sc.nextInt();
		return opcionUsuario;
	}

	public void accesoMenuEmpleado(Scanner sc, List<VentasDto> listaVentas) {
		EmpleadoInterfaz ei = new EmpleadoImplementacion();
		int opcionUsuario;
		opcionUsuario = menuYSeleccionEmpleado(sc);
		switch (opcionUsuario) {
		case 0:
			break;

		case 1:
			System.out.println("Has seleccionado la opcion 1");
			ei.calculoVentasDiarias(sc);
			break;

		case 2:
			System.out.println("Has seleccionado la opcion 2");
			ei.aniadirVenta(listaVentas, sc);
			break;

		default:
			System.out.println("La opcion seleccionada no coincide con ninguna");
			break;

		}

	}

	// Metodo que encarga del menu del empleado
	// @author= CMR - 01/03/2024
	private int menuYSeleccionEmpleado(Scanner sc) {
		int opcionUsuario;
		System.out.println("#######################");
		System.out.println("0. Retroceder");
		System.out.println("1. Calculo total de ventas diarias ");
		System.out.println("2. Aniadir venta");
		System.out.println("#######################");
		opcionUsuario = sc.nextInt();
		return opcionUsuario;
	}

	public void accesoMenuGerencia(Scanner sc) {
		GerenciaInterfaz gi = new GerenciaImplementacion();
		int opcionUsuario;
		opcionUsuario = menuYSeleccionGerencia(sc);
		switch (opcionUsuario) {
		case 0:
			break;

		case 1:
			System.out.println("Has seleccionado la opcion 1");
			gi.mostrarVentasDia();
			break;

		case 2:
			System.out.println("Has seleccionado la opcion 2");
			gi.pedidoNuevo();
			break;

		default:
			System.out.println("La opcion seleccionada no coincide con ninguna");
			break;

		}
	}

	// Metodo que encarga del menu de la gerencia
	// @author= CMR - 01/03/2024
	private int menuYSeleccionGerencia(Scanner sc) {
		int opcionUsuario;
		System.out.println("#######################");
		System.out.println("0. Retroceder");
		System.out.println("1. Mostrar todas las ventas del dia");
		System.out.println("2. Crear nuevo pedido para proveedores");
		System.out.println("#######################");
		opcionUsuario = sc.nextInt();
		return opcionUsuario;
	}

}
