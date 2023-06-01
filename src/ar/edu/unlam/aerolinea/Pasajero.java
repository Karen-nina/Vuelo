package ar.edu.unlam.aerolinea;

import java.util.ArrayList;

public class Pasajero {

	private String pasaporte;
	private ArrayList <Vuelo> vuelosComprados;
	public String getPasaporte() {
		return pasaporte;
	}
	public void setPasaporte(String pasaporte) {
		this.pasaporte = pasaporte;
	}
	public ArrayList<Vuelo> getVuelosComprados() {
		return vuelosComprados;
	}
	public void setVuelosComprados(ArrayList<Vuelo> vuelosComprados) {
		this.vuelosComprados = vuelosComprados;
	}
	
	
	
}
