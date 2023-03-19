package ar.com.UTNArgentinaPrograma;

public class ClaseDePrueba {

	public static void main(String[] args) {
		bucleI: // etiqueta o label
			for ( int i = 0, j = 0; i < 100; i++){
			while ( true ) {
			if( (++j) > 5) { break bucleI; } // Finaliza ambos bucles
			else { break; } // Finaliza el bucle interior (while)
			}
			}

	}

}
