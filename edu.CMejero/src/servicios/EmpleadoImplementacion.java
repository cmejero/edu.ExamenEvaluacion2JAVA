package servicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import dtos.VentasDto;

//Clase que implementa al EmpleadoInterfaz
// @author= CMR - 01/03/2024
public class EmpleadoImplementacion implements EmpleadoInterfaz {
	public void calculoVentasDiarias(Scanner sc) {

		String fechaUsuario;
		System.out.println("Introduzca una fecha en formato : dd-MM-yyyy");
		fechaUsuario = sc.next();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate fecha = LocalDate.parse(fechaUsuario, formatter);

	}

	public void aniadirVenta(List<VentasDto> listaVentas, Scanner sc) {

		double importe;
		System.out.println("Introduzca el importe la venta realizada");
		importe = sc.nextDouble();

		Date fechaImporte = new Date();

		long idVenta = creacionIdVenta(listaVentas);

		VentasDto nuevaVenta = new VentasDto(idVenta, importe, fechaImporte);

	}

//Metodo que encarga de la creacion de un nuevo id
//@author= CMR - 01/03/2024

	private long creacionIdVenta(List<VentasDto> listaVentas) {

		long idGenerado;
		int tamanioLista = listaVentas.size();

		if (tamanioLista == 0) {

			idGenerado = 1;
		} else {
			idGenerado = listaVentas.get(tamanioLista - 1).getIdVenta() + 1;
		}
		return idGenerado;

	}

}
