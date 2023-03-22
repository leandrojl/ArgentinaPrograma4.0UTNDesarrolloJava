package ar.com.UTNArgentinaPrograma;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ClaseDePrueba {

	

	public static void main(String[] args) throws IOException {
		
		
		int[] resultadoEjercicio1A= dadosTresNumerosYUnOrdenAscendenteQueLosOrdeneYRetorneEnUnVector(9,2,8,"a");
		System.out.println(Arrays.toString(resultadoEjercicio1A));
		
		int[] resultadoEjercicio1ABis= dadosTresNumerosYUnOrdenDescendenteQueLosOrdeneYRetorneEnUnVector(9,2,8,"d");
		System.out.println(Arrays.toString(resultadoEjercicio1ABis));
		
	//	int[] resultadoEjercicioB= dadosTresNumerosYUnOrdenAscendenteQueLosOrdeneYRetorneEnUnVectorYLosPidePorConsola();
		//System.out.println(Arrays.toString(resultadoEjercicioB));
		
		dadoQueEnvioUnaRutaPorParametroDebeMostrarPorConsolaLaSumaDeNumerosQueLeeEnElArchivo();
	}
	
	

	private static void dadoQueEnvioUnaRutaPorParametroDebeMostrarPorConsolaLaSumaDeNumerosQueLeeEnElArchivo() throws IOException {
		Scanner teclado = new Scanner(System.in);
		boolean exitWhile = true;
		do {
			System.out.println("--------------------------------------------");
			System.out.println("Bienvenido al Lector de Archivos para sumar numeros!\n");
			System.out.println("Ingrese la ruta del archivo que desea leer y sumar:");
			System.out.println("--------------------------------------------");
			
			String ingresarRuta = teclado.next();
			//File file2 = new File("."); //Muestra donde esta parado el archivo que ejecuta la funcion
			//for(String fileNames : file2.list()) System.out.println(fileNames); //Sirve para verificar donde estoy parado en los archivos
			File file = new File(ingresarRuta);
			
			
			
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String trackOfCurrentLine;
			Integer sumOfFileNumbers =0;
			Integer multiplyOfFileNumbers=1;
			System.out.println("--------------------------------------------");
			System.out.println("Elija la operacion:");
			System.out.println("Ingrese 's' para sumar o ingrese 'm' para multiplicar");
			System.out.println("--------------------------------------------");
			String elegirOperacion = teclado.next();
			switch(elegirOperacion) {
			case "s":
				while((trackOfCurrentLine =  br.readLine())!=null) {
					
					sumOfFileNumbers+= Integer.parseInt(trackOfCurrentLine);
					System.out.println(trackOfCurrentLine);
					
				}
				System.out.println("La suma de los numeros en el archivo es ="+sumOfFileNumbers);
				exitWhile=false;
				break;
			case "m":
				while((trackOfCurrentLine =  br.readLine())!=null) {
					
					multiplyOfFileNumbers*= Integer.parseInt(trackOfCurrentLine);
					System.out.println(trackOfCurrentLine);
					
				}
				System.out.println("La multiplicacion de los numeros en el archivo es ="+multiplyOfFileNumbers);
				exitWhile=false;
				break;
			
			default:
				System.out.println("Ingrese un caracter valido");
			}
			
			
			
			
		}while(exitWhile);
		teclado.close();
		
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
		teclado.close();
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