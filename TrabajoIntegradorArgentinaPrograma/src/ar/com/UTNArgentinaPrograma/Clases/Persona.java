package ar.com.UTNArgentinaPrograma.Clases;

public class Persona {
	
	private Pronostico pronostico=null;
	String nombre;
	Integer puntaje=0;
	

	public Persona(Pronostico pronostico, String nombre) {
		super();
		this.pronostico = pronostico;
		this.nombre = nombre;
	}
	
	public Persona() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(Integer puntaje) {
		this.puntaje = puntaje;
	}

	public Pronostico getPronostico() {
		return pronostico;
	}

	public void setPronostico(Pronostico pronostico) {
		this.pronostico = pronostico;
	}

	public void actualizarPuntaje(Partido partidoPronostico, Partido partidoResultado) {
		if(partidoPronostico.getResultadoEquipoUno().equals(partidoResultado.getResultadoEquipoUno())
				&& partidoPronostico.getResultadoEquipoDos().equals(partidoResultado.getResultadoEquipoDos())) {
			this.puntaje = this.puntaje +1;
		} 
		
	}
	
	

}
