package ar.com.UTNArgentinaPrograma.Clases;

import java.util.ArrayList;

public class Ronda {
	
	private ArrayList<Partido> partidos = new ArrayList<Partido>(2);
	
	public Ronda(ArrayList<Partido> partidos) {
		super();
		this.partidos = partidos;
	}
	
	public Ronda() {
		super();
		
	}

	public void agregarPartido(Partido partido) {
		partidos.add(partido);
		
	}

	public ArrayList<Partido> getPartidos() {
		return partidos;
	}

	public void setPartidos(ArrayList<Partido> partidos) {
		this.partidos = partidos;
	}

	
	
	

}
