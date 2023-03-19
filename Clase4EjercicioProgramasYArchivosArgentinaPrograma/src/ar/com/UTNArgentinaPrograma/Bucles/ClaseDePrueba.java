package ar.com.UTNArgentinaPrograma.Bucles;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class ClaseDePrueba {

	public static void main(String[] args) {
		
		//DESCOMENTAR LOS METODOS PARA EFECTIVAMENTE TESTEARLOS.

		//Ejercicio 1
		/*Pedir que se ingrese por teclado un número y mostrar la tabla de multiplicar completa del 0 al 10. 
		 * Imprimir el multiplicando, el multiplicador y el producto. */
		
		//dadoQueSeIngresePorTecladoUnNumeroMostrarLaTablaDeMutiplicarDel0al10ImprimiendoElMultiplicandoMultiplicadorYElProducto();
		
		//Ejercicio 2
		/*Pida al usuario que ingrese 10 números y luego muestre solamente los múltiplos de 2.*/
		
		//dadoQueElUsuarioIngresa10NumerosSoloMuestroLosMultiplosDe2();
		
		//Ejercicio 3
		/*Pedir que se ingresen 20 números e imprimir cuántos son positivos, cuántos negativos y cuántos neutros.*/
		
		//dadoQueElUsuarioIngresa20NumerosImprimirCuantosSonPositivosNegativosYNeutros();
		
		//Ejercicio 4
		/*Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos de un día desde las 0:00:00 horas hasta las 23:59:59 horas.*/
		
		//dadoQueTengoUnRelojDigitalImprimirTodoElRangoHorarioDe00a23();
		
		//Ejercicio 5
		/*En un supermercado una clienta pone en su carrito los artículos que va tomando de los estantes. 
		 * La señora quiere asegurarse de que el cajero le cobre bien lo que ella ha comprado, por lo que 
		 * cada vez que toma un artículo anota su precio junto con la cantidad de artículos iguales que ha 
		 * tomado y determina cuánto dinero gastará en ese artículo; a esto, le suma lo que ira gastando en 
		 * los demás artículos, hasta que decide que ya tomó todo lo que necesitaba. Ayúdele a esta señora a 
		 * obtener el total de sus compras.*/
		
		//dadoQueComproNArticulosEnElSupermercadoConNValorSacarElTotal();
	}

	private static void dadoQueComproNArticulosEnElSupermercadoConNValorSacarElTotal() {
		// TODO Auto-generated method stub
		
	}

	private static void dadoQueTengoUnRelojDigitalImprimirTodoElRangoHorarioDe00a23() {
		
		  
	}

	private static void dadoQueElUsuarioIngresa20NumerosImprimirCuantosSonPositivosNegativosYNeutros() {
		
		int [] arrayDeNumeros = new int [20];
		int numeroAGuardar = 0;
		Scanner teclado = new Scanner (System.in);
		System.out.println("--------------------------------------------");
		System.out.println("Bienvenido a los Numeros Positivos, Negativos y Neutros");
		System.out.println("Ingrese 20 numeros y les mostrare cuales son Positivos, Negativos y Neutros");
		System.out.println("--------------------------------------------");
		for(int i = 0; i<arrayDeNumeros.length;i++) {
			System.out.println("Ingrese el numero "+(i+1)+")");
			numeroAGuardar= teclado.nextInt();
			arrayDeNumeros[i]=numeroAGuardar;		
		}
		System.out.println("--------------------------------------------");
		System.out.println("Los numeros guardados son "+Arrays.toString(arrayDeNumeros));
		System.out.println("--------------------------------------------");
		for(int i=0;i<arrayDeNumeros.length;i++) {
			if(arrayDeNumeros[i] > 0) {
				System.out.println("El numero "+arrayDeNumeros[i]+" es positivo");
			}else if(arrayDeNumeros[i] < 0) {
				System.out.println("El numero "+arrayDeNumeros[i]+" es negativo");
			}else {
				System.out.println("El numero "+arrayDeNumeros[i]+" es neutro");
			}
		}
		
	}

	private static void dadoQueElUsuarioIngresa10NumerosSoloMuestroLosMultiplosDe2() {
		int [] arrayDeNumeros = new int [10];
		int numeroAGuardar = 0;
		Scanner teclado = new Scanner (System.in);
		System.out.println("--------------------------------------------");
		System.out.println("Bienvenido a los Multiplos de 2\n");
		System.out.println("Ingrese 10 numeros aleatorios a medida que se los pida y le mostrare los multiplos de 2");
		System.out.println("--------------------------------------------");
		for(int i = 0; i<arrayDeNumeros.length;i++) {
			System.out.println("Ingrese el numero "+(i+1)+")");
			numeroAGuardar= teclado.nextInt();
			arrayDeNumeros[i]=numeroAGuardar;		
		}
		for(int i=0;i<arrayDeNumeros.length;i++) {
			if(arrayDeNumeros[i] % 2 == 0) {
				System.out.println("El numero "+arrayDeNumeros[i]+" es multiplo de 2.");
			}
		}
		System.out.println("Los numeros ingresados son"+ Arrays.toString(arrayDeNumeros));
	}

	private static void dadoQueSeIngresePorTecladoUnNumeroMostrarLaTablaDeMutiplicarDel0al10ImprimiendoElMultiplicandoMultiplicadorYElProducto() {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("--------------------------------------------");
		System.out.println("Bienvenido al Multiplicador de numeros\n");
		System.out.println("Ingrese el numero que desea multiplicar:");
		System.out.println("--------------------------------------------");
		int numeroAMultiplicar = teclado.nextInt();
		int resultadoAMostrar=0;
		
		for(int i = 0; i<=10;i++) {
			resultadoAMostrar= numeroAMultiplicar * i;
			System.out.println("Multiplicando: "+numeroAMultiplicar+" Multiplicador: "+i+" Producto: "+resultadoAMostrar);
		}
		
	}

}
