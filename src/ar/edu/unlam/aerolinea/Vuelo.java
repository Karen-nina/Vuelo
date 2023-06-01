package ar.edu.unlam.aerolinea;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.HashSet;

public class Vuelo {

	private Integer nroDeVuelo;
	private String origen;
	private String destino;
	private String ciudadDeEscala;
	private LocalDate fecha;
	private LocalTime hora;
	private Integer idAvion;
	private Integer cantidadDeAsientosDisponibles;
	private HashSet <Personal> personal;
	private HashSet <Pasajero> pasajeros;
	
	
	public Vuelo(Integer nroDeVuelo, String origen, String destino, String ciudadDeEscala, LocalDate fecha,
			LocalTime hora, Integer idAvion, Integer cantidadDeAsientosDisponibles) {
		
		this.nroDeVuelo = nroDeVuelo;
		this.origen = origen;
		this.destino = destino;
		this.ciudadDeEscala = ciudadDeEscala;
		this.fecha = fecha;
		this.hora = hora;
		this.idAvion = idAvion;
		this.cantidadDeAsientosDisponibles = cantidadDeAsientosDisponibles;
		this.personal = new HashSet <Personal>();
		this.pasajeros = new HashSet <Pasajero>(); 
	}


	public Integer getNroDeVuelo() {
		return nroDeVuelo;
	}


	public void setNroDeVuelo(Integer nroDeVuelo) {
		this.nroDeVuelo = nroDeVuelo;
	}


	public String getOrigen() {
		return origen;
	}


	public void setOrigen(String origen) {
		this.origen = origen;
	}


	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public String getCiudadDeEscala() {
		return ciudadDeEscala;
	}


	public void setCiudadDeEscala(String ciudadDeEscala) {
		this.ciudadDeEscala = ciudadDeEscala;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public LocalTime getHora() {
		return hora;
	}


	public void setHora(LocalTime hora) {
		this.hora = hora;
	}


	public Integer getIdAvion() {
		return idAvion;
	}


	public void setIdAvion(Integer idAvion) {
		this.idAvion = idAvion;
	}


	public Integer getCantidadDeAsientosDisponibles() {
		return cantidadDeAsientosDisponibles;
	}


	public void setCantidadDeAsientosDisponibles(Integer cantidadDeAsientosDisponibles) {
		this.cantidadDeAsientosDisponibles = cantidadDeAsientosDisponibles;
	}


	public HashSet<Personal> getPersonal() {
		return personal;
	}


	public void setPersonal(HashSet<Personal> personal) {
		this.personal = personal;
	}


	public HashSet<Pasajero> getPasajeros() {
		return pasajeros;
	}


	public void setPasajeros(HashSet<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}
	
	
}
