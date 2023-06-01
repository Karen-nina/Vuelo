package ar.edu.unlam.aerolinea;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

import org.junit.Test;
public class TestAerolinea {


	@Test
	public void queSePuedaAgregarNuevoVuelo() {
		Aerolinea boa = new Aerolinea();
		
		Integer nroDeVuelo = 2;
		String origen = "buenos aires";
		String destino = "cordoba";
		String ciudadDeEscala = "rosario";
		LocalDate fecha = LocalDate.of(2022, Month.MAY, 04);
		LocalTime hora = LocalTime.of(9, 30);
		Integer idAvion = 023;
		Integer cantidadDeAsientosDisponibles = 130;
		
		Vuelo vuelo = new Vuelo(nroDeVuelo, origen, destino, ciudadDeEscala, fecha, hora, idAvion, cantidadDeAsientosDisponibles);
		boa.agregarNuevoVuelo(vuelo);
		
		assertEquals(vuelo, boa.buscarVueloPorId(nroDeVuelo));
	}
	@Test
	public void queSePuedaAsignarUnAvionAVuelo() {

	}
	@Test
	public void queNoSePuedanSumarMasDe2Pilotos() {
		

	}
	@Test
	public void queNoSePuedanAsignarMasDe4Azafatas() {
	
	}
	
	@Test
	public void queAunPasajeroSeLeAsigneUnAsientoDeVuelo() {
	
	}

	@Test
	public void queSePuedaSubirPasajeroAlVuelo() {
		
		
	}
}
