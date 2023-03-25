package ar.com.UTNArgentinaPrograma.Clases;

public class Partido {
	
	private Equipo equipo1=null;
	private Equipo equipo2=null;
	
	

	public Partido() {
		super();
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
	}

	public Partido(Equipo equipo1, Equipo equipo2) {
		super();
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
	}

	public void agregarEquipos(Equipo equipo1, Equipo equipo2) {
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
	}

	public Equipo getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}

	public Equipo getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}

	
}
