package ar.com.UTNArgentinaPrograma.Clases;

public class Persona {
	
	private Pronostico pronostico=null;
	String nombre;
	
	

	public Persona(Pronostico pronostico, String nombre) {
		super();
		this.pronostico = pronostico;
		this.nombre = nombre;
	}
	
	public Persona() {
	}
	

	public Pronostico getPronostico() {
		return pronostico;
	}

	public void setPronostico(Pronostico pronostico) {
		this.pronostico = pronostico;
	}
	
	

}
