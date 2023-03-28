package ar.com.UTNArgentinaPrograma.Clases;

public class Partido {
	
	private Equipo equipo1=null;
	private Equipo equipo2=null;
	
	private Integer golesEquipoUno=0;
	private Integer golesEquipoDos=0;
	
	private RESULTADO resultadoEquipoUno;
	private RESULTADO resultadoEquipoDos;
	

	public Partido() {
		super();
	}

	public Partido(Equipo equipo1, Equipo equipo2) {
		super();
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
	}

	public RESULTADO getResultadoEquipoUno() {
		return resultadoEquipoUno;
	}

	public void setResultadoEquipoUno(RESULTADO resultadoEquipoUno) {
		this.resultadoEquipoUno = resultadoEquipoUno;
	}

	public RESULTADO getResultadoEquipoDos() {
		return resultadoEquipoDos;
	}

	public void setResultadoEquipoDos(RESULTADO resultadoEquipoDos) {
		this.resultadoEquipoDos = resultadoEquipoDos;
	}

	public void resultado() {
		
	}

	public void setGolesEquipoUno(Integer golesEquipoUno) {
		this.golesEquipoUno = golesEquipoUno;
	}

	public void setGolesEquipoDos(Integer golesEquipoDos) {
		this.golesEquipoDos = golesEquipoDos;
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

	public int getGolesEquipoUno() {
		return golesEquipoUno;
	}

	public void setGolesEquipoUno(int golesEquipoUno) {
		this.golesEquipoUno = golesEquipoUno;
	}

	public int getGolesEquipoDos() {
		return golesEquipoDos;
	}

	public void setGolesEquipoDos(int golesEquipoDos) {
		this.golesEquipoDos = golesEquipoDos;
	}

	public void agregarResultado(Equipo equipo, RESULTADO resultado) {
		switch(resultado) {
		
		case GANADOR:
			if(equipo.equals(getEquipo1())) {
				setResultadoEquipoUno(RESULTADO.GANADOR);
				setResultadoEquipoDos(RESULTADO.PERDEDOR);
			}else if(equipo.equals(getEquipo2())) {
				setResultadoEquipoDos(RESULTADO.GANADOR);
				setResultadoEquipoUno(RESULTADO.PERDEDOR);
			}
			break;
		case PERDEDOR:
			if(equipo.equals(getEquipo1())) {
				setResultadoEquipoUno(RESULTADO.PERDEDOR);
				setResultadoEquipoDos(RESULTADO.GANADOR);
			}else if(equipo.equals(getEquipo2())) {
				setResultadoEquipoDos(RESULTADO.PERDEDOR);
				setResultadoEquipoUno(RESULTADO.GANADOR);
			}
			break;
		case EMPATE:
			if(equipo.equals(getEquipo1())) {
				setResultadoEquipoUno(RESULTADO.EMPATE);
				setResultadoEquipoDos(RESULTADO.EMPATE);
			}else if(equipo.equals(getEquipo2())) {
				setResultadoEquipoDos(RESULTADO.EMPATE);
				setResultadoEquipoUno(RESULTADO.EMPATE);
			}
			break;
		
		}
		/*if(equipo.equals(getEquipo1())) {
			
			setResultadoEquipoUno(resultado);
			if(this.resultadoEquipoUno.equals(resultado)) {
				setResultadoEquipoDos(RESULTADO.P);
			}
		}else if(equipo.equals(getEquipo2())) {
			setResultadoEquipoDos(resultado);
		}
		*/
	}

	
}
