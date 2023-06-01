package ar.edu.unlam.aerolinea;

public abstract class Personal {

	protected String nombre;
	protected String apellido;
	protected String areaAsignada;
	
	
	public Personal(String nombre, String apellido, String areaAsignada) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.areaAsignada = areaAsignada;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getAreaAsignada() {
		return areaAsignada;
	}


	public void setAreaAsignada(String areaAsignada) {
		this.areaAsignada = areaAsignada;
	}
	
	
}
