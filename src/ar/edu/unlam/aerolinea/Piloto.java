package ar.edu.unlam.aerolinea;

import java.time.LocalTime;

public class Piloto extends Personal {
	
	private LocalTime cantidadDeHorasDeVuelo;
	private String tipoDeAvionQuePilotea;
	
	public Piloto(String nombre, String apellido, String areaAsignada, LocalTime cantidadDeHorasDeVuelo, String tipoDeAvionQuePilotea) {
		super(nombre, apellido, areaAsignada);
		
		this.cantidadDeHorasDeVuelo = cantidadDeHorasDeVuelo;
		this.tipoDeAvionQuePilotea = tipoDeAvionQuePilotea;
		
	}

	public LocalTime getCantidadDeHorasDeVuelo() {
		return cantidadDeHorasDeVuelo;
	}

	public void setCantidadDeHorasDeVuelo(LocalTime cantidadDeHorasDeVuelo) {
		this.cantidadDeHorasDeVuelo = cantidadDeHorasDeVuelo;
	}

	public String getTipoDeAvionQuePilotea() {
		return tipoDeAvionQuePilotea;
	}

	public void setTipoDeAvionQuePilotea(String tipoDeAvionQuePilotea) {
		this.tipoDeAvionQuePilotea = tipoDeAvionQuePilotea;
	}

	
	
}
