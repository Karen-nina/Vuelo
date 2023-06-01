package ar.edu.unlam.aerolinea;

public class Avion {

	private String modelo;
	private String fabricante;
	private Integer capacidad;
	private String hangar;
	private String tipoDeAvión;
	
	public Avion(String modelo, String fabricante, Integer capacidad, String hangar, String tipoDeAvión) {
	
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.capacidad = capacidad;
		this.hangar = hangar;
		this.tipoDeAvión = tipoDeAvión;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public String getHangar() {
		return hangar;
	}

	public void setHangar(String hangar) {
		this.hangar = hangar;
	}

	public String getTipoDeAvión() {
		return tipoDeAvión;
	}

	public void setTipoDeAvión(String tipoDeAvión) {
		this.tipoDeAvión = tipoDeAvión;
	}
	
	
	
}
