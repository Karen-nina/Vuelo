package ar.edu.unlam.aerolinea;

import java.util.HashSet;

public class Aerolinea {

	private HashSet<Avion> listaAviones  ;
	private HashSet<Personal> listaPersonal;
	private HashSet<Vuelo> listaVuelos;
	
	
	public Aerolinea() {
		this.listaAviones = new HashSet<Avion>();
		this.listaPersonal = new HashSet<Personal>();
		this.listaVuelos = new HashSet<Vuelo>();
	}


	public HashSet<Avion> getListaAviones() {
		return listaAviones;
	}


	public void setListaAviones(HashSet<Avion> listaAviones) {
		this.listaAviones = listaAviones;
	}


	public HashSet<Personal> getListaPersonal() {
		return listaPersonal;
	}


	public void setListaPersonal(HashSet<Personal> listaPersonal) {
		this.listaPersonal = listaPersonal;
	}


	public HashSet<Vuelo> getListaVuelos() {
		return listaVuelos;
	}


	public void setListaVuelos(HashSet<Vuelo> listaVuelos) {
		this.listaVuelos = listaVuelos;
	}

	public void agregarNuevoVuelo(Vuelo vuelo) {
		this.listaVuelos.add(vuelo);
		
	}
	public Vuelo buscarVueloPorId(Integer nroDeVuelo) {
		for(Vuelo vuelo : listaVuelos) {
			if(vuelo.getNroDeVuelo() == nroDeVuelo) {
				return vuelo;
			}
		}
		return null;
	}
	
}
