package ar.com.UTNArgentinaPrograma.Clases;

import java.util.ArrayList;

public class Pronostico {
	
	private ArrayList<Ronda> rondas = new ArrayList<Ronda>();
	private RESULTADO resultado;
	

	public Pronostico(ArrayList<Ronda> rondas) {
		super();
		this.rondas = rondas;
	}
	
	public Pronostico(ArrayList<Ronda> rondas, RESULTADO resultado) {
		super();
		this.rondas = rondas;
		this.resultado = resultado;
	}

	public Pronostico() {
		super();
		
	}

	public void agregarRonda(Ronda ronda) {
		this.rondas.add(ronda);
		
	}

	public ArrayList<Ronda> getRondas() {
		return rondas;
	}
	

	public RESULTADO getResultado() {
		return resultado;
	}

	public void setResultado(RESULTADO resultado) {
		this.resultado = resultado;
	}

	public void setRondas(ArrayList<Ronda> rondas) {
		this.rondas = rondas;
	}

	public void agregarRonda(Integer i, Ronda ronda) {
		rondas.add(i, ronda);
		
	}
	
	

}
