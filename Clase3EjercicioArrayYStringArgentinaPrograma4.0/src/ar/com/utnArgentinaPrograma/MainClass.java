package ar.com.utnArgentinaPrograma;

import java.util.Arrays;

public class MainClass {

	

	public static void main(String[] args) {
		String resultadoEjercicioA= dadoQueTengoUnStringYUnaLetraContarCuantasVecesApareceLaLetra("La bufanda asusta", 'a');
		System.out.println(resultadoEjercicioA);
		
		int[] resultadoEjercicioB= dadosTresNumerosYUnOrdenAscendenteQueLosOrdeneYRetorneEnUnVector(9,2,8,"ascendente");
		System.out.println(Arrays.toString(resultadoEjercicioB));
		
		int[] resultadoEjercicioBbis= dadosTresNumerosYUnOrdenDescendenteQueLosOrdeneYRetorneEnUnVector(9,2,8,"ascendente");
		System.out.println(Arrays.toString(resultadoEjercicioBbis));
		
		int resultadoEjercicioC = dadoUnVectorDeNumerosYUnNumeroXQueSumeLosNumerosMayoresQueXYDevuelvaElResultado();
		System.out.println("La suma de los numeros mayores al solicitado es = "+resultadoEjercicioC);
	}
	
	private static int dadoUnVectorDeNumerosYUnNumeroXQueSumeLosNumerosMayoresQueXYDevuelvaElResultado() {
		
		int[] vectorDeNumeros = {2,2,3,1,1,1,1};
		int unNumero=1;
		int contador=0;
		for(int i=0; i<vectorDeNumeros.length;i++) {
			if(vectorDeNumeros[i]> unNumero) {
				contador= contador+vectorDeNumeros[i];
			}
		}
		
		
	return contador;	
	}

	private static int[] dadosTresNumerosYUnOrdenAscendenteQueLosOrdeneYRetorneEnUnVector(int numero1,int numero2, int numero3, String unOrden) {
		int[] arrayDeNumeros = {numero1, numero2, numero3};
		boolean huboUnCambio = true;
		if(unOrden.equals("ascendente")) {
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
		if(unOrden.equals("ascendente")) {
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
