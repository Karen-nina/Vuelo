package ar.edu.unlam.aerolinea;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.HashSet;

public class Vuelo {

	private Integer idVuelo;
	private String origen;
	private String destino;
	private LocalDate fecha;
	private LocalTime hora;
	private Integer idAvion;
	private Integer cantidadDeAsientosDisponibles;
	private HashSet <Personal> personal;
	private HashSet <Pasajero> pasajeros;
	
	public Vuelo(Integer idVuelo, String origen, String destino, LocalDate fecha, LocalTime hora, Integer idAvion,
			Integer cantidadDeAsientosDisponibles) {
		this.idVuelo = idVuelo;
		this.origen = origen;
		this.destino = destino;
		this.fecha = fecha;
		this.hora = hora;
		this.idAvion = idAvion;
		this.cantidadDeAsientosDisponibles = cantidadDeAsientosDisponibles;
		this.personal = new HashSet <Personal>();
		this.pasajeros = new HashSet <Pasajero>(); 
	}
	
	
	
}
