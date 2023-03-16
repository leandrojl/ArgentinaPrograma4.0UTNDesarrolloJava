package ar.com.UTNArgentinaPrograma;

import java.util.Arrays;
import java.util.Scanner;

public class ClaseDePrueba {

	

	public static void main(String[] args) {
		
		
		int[] resultadoEjercicio1A= dadosTresNumerosYUnOrdenAscendenteQueLosOrdeneYRetorneEnUnVector(9,2,8,"a");
		System.out.println(Arrays.toString(resultadoEjercicio1A));
		
		int[] resultadoEjercicio1ABis= dadosTresNumerosYUnOrdenDescendenteQueLosOrdeneYRetorneEnUnVector(9,2,8,"d");
		System.out.println(Arrays.toString(resultadoEjercicio1ABis));
		
		int[] resultadoEjercicioB= dadosTresNumerosYUnOrdenAscendenteQueLosOrdeneYRetorneEnUnVectorYLosPidePorConsola();
		System.out.println(Arrays.toString(resultadoEjercicioB));
		
		dadoQueEnvioUnaRutaPorParametroDebeMostrarPorConsolaLaSumaDeNumerosQueLeeEnElArchivo();
	}
	
	

	private static void dadoQueEnvioUnaRutaPorParametroDebeMostrarPorConsolaLaSumaDeNumerosQueLeeEnElArchivo() {
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("--------------------------------------------");
			System.out.println("Bienvenido al Lector de Archivos para sumar numeros!\n");
			System.out.println("Ingrese la ruta del archivo que desea leer y sumar:");
			System.out.println("--------------------------------------------");
			
			
		}while(true);
		
	}



	private static int[] dadosTresNumerosYUnOrdenAscendenteQueLosOrdeneYRetorneEnUnVectorYLosPidePorConsola() {
		
		Scanner teclado = new Scanner(System.in);
		int [] arrayDeNumeros = new int [3];
		boolean exitWhile = true;
		
		do {
		System.out.println("--------------------------------------------");
		System.out.println("Bienvenido al Ordenador de numeros\n");
		System.out.println("Ingrese tres numeros\n");
		System.out.println("--------------------------------------------");
		
		for(int i=0; i<arrayDeNumeros.length ;i++) {
			int numeroSolicitado=teclado.nextInt();
			arrayDeNumeros[i]=numeroSolicitado;
		}
		System.out.println("--------------------------------------------");
		System.out.println("Debera ingresa 'a' para orden ascedente o 'd' para descendente");
		System.out.println("--------------------------------------------");
		String eleccionDelUsuarioRespectoAlOrden = teclado.next();
		switch(eleccionDelUsuarioRespectoAlOrden) {
		
		case "a":
			System.out.println("Orden ascendete procesando...");
			boolean huboUnCambio = true;
				while(huboUnCambio) {
					huboUnCambio = false;
					for(int i = 0; i<(arrayDeNumeros.length-1);i++) {
						if(arrayDeNumeros[i]> arrayDeNumeros[i+1]) {
							huboUnCambio=true;
							int numeroTemporario = arrayDeNumeros[i];
							arrayDeNumeros[i]= arrayDeNumeros[i+1];
							arrayDeNumeros[i+1]=numeroTemporario;
						}
					}
				}
			exitWhile = false;
			break;
		
		case "d":
			System.out.println("Orden descendete procesando...");
			boolean huboUnCambio1 = true;
			while(huboUnCambio1) {
				huboUnCambio1 = false;
				for(int i = 0; i<(arrayDeNumeros.length-1);i++) {
					if(arrayDeNumeros[i]< arrayDeNumeros[i+1]) {
						huboUnCambio1=true;
						int numeroTemporario = arrayDeNumeros[i];
						arrayDeNumeros[i]= arrayDeNumeros[i+1];
						arrayDeNumeros[i+1]=numeroTemporario;
					}
				}
			}
		exitWhile = false;
		break;
		
		default:
			exitWhile=true;
			
			
		}
		
		
		
		}while(exitWhile);
		
		return arrayDeNumeros;
	}


	private static int[] dadosTresNumerosYUnOrdenAscendenteQueLosOrdeneYRetorneEnUnVector(int numero1,int numero2, int numero3, String unOrden) {
		int[] arrayDeNumeros = {numero1, numero2, numero3};
		boolean huboUnCambio = true;
		if(unOrden.equals("a")) {
			while(huboUnCambio) {
				huboUnCambio = false;
				for(int i = 0; i<(arrayDeNumeros.length-1);i++) {
					if(arrayDeNumeros[i]> arrayDeNumeros[i+1]) {
						huboUnCambio=true;
						int numeroTemporario = arrayDeNumeros[i];
						arrayDeNumeros[i]= arrayDeNumeros[i+1];
						arrayDeNumeros[i+1]=numeroTemporario;
					}
				}
			}
			
		}
		
		return arrayDeNumeros;
		
	}
	
	private static int[] dadosTresNumerosYUnOrdenDescendenteQueLosOrdeneYRetorneEnUnVector(int numero1,int numero2, int numero3, String unOrden) {
		int[] arrayDeNumeros = {numero1, numero2, numero3};
		boolean huboUnCambio = true;
		if(unOrden.equals("d")) {
			while(huboUnCambio) {
				huboUnCambio = false;
				for(int i = 0; i<(arrayDeNumeros.length-1);i++) {
					if(arrayDeNumeros[i]< arrayDeNumeros[i+1]) {
						huboUnCambio=true;
						int numeroTemporario = arrayDeNumeros[i];
						arrayDeNumeros[i]= arrayDeNumeros[i+1];
						arrayDeNumeros[i+1]=numeroTemporario;
					}
				}
			}
			
		}
		
		return arrayDeNumeros;
		
	}

	public static String dadoQueTengoUnStringYUnaLetraContarCuantasVecesApareceLaLetra(String palabra, char letra) {
		int contador=0;
		for(int i =0; i<palabra.length();i++) {
			if(palabra.charAt(i) == letra) {
				contador++;
			}
			
		}
		
		return "La cantidad de letras '"+letra+"' en el String '"+palabra+"' es = "+contador;
		
	}
	
	
}