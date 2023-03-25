package ar.com.UTNArgentinaProgramaTest;

public class Persona {
	
	private Pronostico pronostico=null;

	public void agregarPronostico(Pronostico pronostico) {
		this.pronostico = getPronostico();
		
	}

	public Pronostico getPronostico() {
		return pronostico;
	}

	public void setPronostico(Pronostico pronostico) {
		this.pronostico = pronostico;
	}
	
	

}
