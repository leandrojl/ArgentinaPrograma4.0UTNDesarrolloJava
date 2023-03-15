package ar.com.UTNArgentinaPrograma;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class ClaseDePrueba {

	public static void main(String[] args) {
		
		imprimirDesdeNumeroInicialANumeroFinal();
		imprimirSoloLosNumerosPares();
		imprimirNumerosParesONumerosImparesSegunLoPedido(); //para imprimir los pares
		imprimirNumerosParesONumerosImparesSegunLoPedido(); //para imprimir los impares
		imprimirLosNumerosParesEnOrdenInvertidoUtilizandoUnFor();
		determinarSiPerteneceALaSegmentacionAltaSegunIngresosMensualesYCantidadDeVehiculosSegunSuAntiguedadYCantidadDeInmueblesYSiEsTitularDeActivosOEmbarcacionOAeronave();
	}
	
	

	private static void determinarSiPerteneceALaSegmentacionAltaSegunIngresosMensualesYCantidadDeVehiculosSegunSuAntiguedadYCantidadDeInmueblesYSiEsTitularDeActivosOEmbarcacionOAeronave() {
		
		String ingresosMensuales = JOptionPane.showInputDialog("Escriba el monto de sus ingresos mensuales Ej: 572386");
		Integer ingresosMensualesParsed = Integer.parseInt(ingresosMensuales);
		String cantidadDeVehiculos = JOptionPane.showInputDialog("Tiene 3 o mas vehiculos con una antiguedad menor a 5 años? Respuesta: si o no");
		String cantidadDePropiedades = JOptionPane.showInputDialog("Tiene 3 o mas propiedades? Respuesta si o no");
		String cantidadDeActivos = JOptionPane.showInputDialog("Posee una embarcación, una aeronave de lujo o es titular de activos? Respuesta si o no");
		
		if(ingresosMensualesParsed >= 489083 && cantidadDeVehiculos.equals("si") && cantidadDePropiedades.equals("si")&& cantidadDeActivos.equals("si") ) {
			System.out.println("Usted pertenece a la Segmentacion Alta");
			
		}else {
			System.out.println("Usted no pertenece a la Segmentacion Alta");
		}
	}



	public static void imprimirDesdeNumeroInicialANumeroFinal() {
		int numeroInicial = 1;
		int numeroFinal = 10;
		int[] numeros = new int[10];
		boolean salida = true;
		int i=0;
		int contador =0;
		while(salida) {
			contador = contador + numeroInicial;
			numeros[i] = contador;
			i++;
			if(contador == numeroFinal) {
				salida = false;
			}
		}
		System.out.println("Imprimir desde el numero inicial hasta el numero final = "+Arrays.toString(numeros));
	}
	
	public static void imprimirNumerosParesONumerosImparesSegunLoPedido() {
		int numeroInicial = 1;
		int numeroFinal = 10;
		int[] numeros = new int[5];
		boolean salida = true;
		int i=0;
		int contador =0;
		String pedido= JOptionPane.showInputDialog("Que numeros desea mostrar? Ingrese par o impar (en minuscula)");
		if(pedido.equals("par")) {
			while(salida) {
				
				contador = contador + numeroInicial;
				if(contador%2==0) {
					numeros[i] = contador;
					i++;
				}
				
				
				if(contador == numeroFinal) {
					salida = false;
				}
			}
			System.out.println("Los numeros pares son = "+Arrays.toString(numeros));
		} else if(pedido.equals("impar")) {
			while(salida) {
				
				contador = contador + numeroInicial;
				if(contador%2!=0) {
					numeros[i] = contador;
					i++;
				}
				
				
				if(contador == numeroFinal) {
					salida = false;
				}
			}
			System.out.println("Los numeros pares son = "+Arrays.toString(numeros));
		}
		
	}
	
	public static void imprimirLosNumerosParesEnOrdenInvertidoUtilizandoUnFor() {
		int numeroInicial = 1;
		int numeroFinal = 10;
		int[] numeros = new int[5];
		int unNumero =0;
		int k =0;
		for(int i =0; i< numeros.length;) {
			unNumero = numeroFinal - k;
			if(unNumero%2==0) {
				numeros[i] = unNumero;
				i++;
			}
			k++;
		}
		System.out.println("Los numeros pares son utilizando un for son = "+Arrays.toString(numeros));
	}
	
	public static void imprimirSoloLosNumerosPares() {
		int numeroInicial = 1;
		int numeroFinal = 10;
		int[] numeros = new int[5];
		boolean salida = true;
		int i=0;
		int contador =0;
		while(salida) {
			
			contador = contador + numeroInicial;
			if(contador%2==0) {
				numeros[i] = contador;
				i++;
			}
			
			
			if(contador == numeroFinal) {
				salida = false;
			}
		}
		System.out.println("Los numeros pares son = "+Arrays.toString(numeros));
	}

}