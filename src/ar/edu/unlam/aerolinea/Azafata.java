package ar.edu.unlam.aerolinea;

public class Azafata extends Personal {


	private boolean hablaMasDeUnIdioma;

	public Azafata(String nombre, String apellido, String areaAsignada, boolean hablaMasDeUnIdioma) {
		super(nombre, apellido, areaAsignada);
		this.hablaMasDeUnIdioma = hablaMasDeUnIdioma;
	}

	public boolean isHablaMasDeUnIdioma() {
		return hablaMasDeUnIdioma;
	}

	public void setHablaMasDeUnIdioma(boolean hablaMasDeUnIdioma) {
		this.hablaMasDeUnIdioma = hablaMasDeUnIdioma;
	}
	
	

}
