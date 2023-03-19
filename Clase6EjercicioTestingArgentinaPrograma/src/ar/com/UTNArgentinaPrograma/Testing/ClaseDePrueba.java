package ar.com.UTNArgentinaPrograma.Testing;

public class ClaseDePrueba {

	public static void main(String[] args) {
		
		dadaLaCuenta80Por3Da240();
		dadaLaCuenta150Mas180divido3Da110();
		dadaLaCuenta90Menos50MultiplicadoPor15NoDa605();
		dadaLaCuenta70Mas40MultiplicadoPor25NoDa2700();
		

	}

	private static void dadaLaCuenta70Mas40MultiplicadoPor25NoDa2700() {
		Calculadora calcu = new Calculadora();
		Double resultadoPrimero =calcu.sumar(70.0, 40.0);
		Double resultadoFinal = calcu.multiplicar(resultadoPrimero, 25.0);
		System.out.println("El resultado del ejercicio 4 es la cuenta es = "+resultadoFinal);
	}

	private static void dadaLaCuenta90Menos50MultiplicadoPor15NoDa605() {
		Calculadora calcu = new Calculadora();
		Double resultadoPrimero =calcu.restar(90.0, 50.0);
		Double resultadoFinal = calcu.multiplicar(resultadoPrimero, 15.0);
		System.out.println("El resultado del ejercicio 3 es la cuenta es = "+resultadoFinal);
		
	}

	private static void dadaLaCuenta150Mas180divido3Da110() {
		Calculadora calcu = new Calculadora();
		Double resultadoPrimero =calcu.sumar(150.0, 180.0);
		Double resultadoFinal = calcu.dividir(resultadoPrimero, 3.0);
		System.out.println("El resultado del ejercicio 2 es la cuenta es = "+resultadoFinal);
		
	}

	private static void dadaLaCuenta80Por3Da240() {
		Calculadora calcu = new Calculadora();
		Double resultadoFinal =calcu.multiplicar(80.0, 3.0);
		System.out.println("El resultado del ejercicio 1 es la cuenta es = "+resultadoFinal);
		
	}

}
