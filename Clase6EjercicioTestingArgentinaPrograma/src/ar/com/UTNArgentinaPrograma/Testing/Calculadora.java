package ar.com.UTNArgentinaPrograma.Testing;

public class Calculadora {
	
	private Double numeroX;
	private Double numeroY;
	
	public Calculadora(Double numeroX, Double numeroY) {
		super();
		this.numeroX = numeroX;
		this.numeroY = numeroY;
	}
	public Calculadora() {
		this.numeroX = numeroX;
		this.numeroY = numeroY;
	}
	
	public Double sumar(Double numeroX, Double numeroY) {
		return numeroX+numeroY;
	}
	public Double restar(Double numeroX, Double numeroY) {
		return numeroX-numeroY;
	}
	public Double multiplicar(Double numeroX,Double numeroY) {
		return numeroX*numeroY;
	}
	public Double dividir(Double numeroX,Double numeroY) {
		if(numeroX != 0) {
			return numeroX/numeroY;
		}
		return null;
	}
	public Double getNumeroX() {
		return numeroX;
	}

	public void setNumeroX(Double numeroX) {
		this.numeroX = numeroX;
	}

	public Double getNumeroY() {
		return numeroY;
	}

	public void setNumeroY(Double numeroY) {
		this.numeroY = numeroY;
	}
	
	

}
