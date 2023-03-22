package ar.com.UTNArgentinaPrograma;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import ar.com.UTNArgentinaPrograma.Supermercado.Carrito;
import ar.com.UTNArgentinaPrograma.Supermercado.Producto;


public class ClaseDePrueba {

	public static void main(String[] args) {
		
		//METODO PARA CREAR UN TXT CON LOS ITEMS A COMPRAR Y DESPUES CONVERTIRLOS EN OBJETOS.
		String[] listaDeItems = {"jabon en polvo", "mermelada de frutilla","chocolate aguila","flan con dulce de leche"};
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\ArgentinaPrograma4.0UTNDesarrolloJavaWorkspace\\Clase5EjercicioPOOJavaArgentinaPrograma\\src\\ar\\com\\UTNArgentinaPrograma\\listaDeItemsAComprar.txt"));
			//writer.write("jabon en polvo, mermelada de frutilla, chocolate aguila, detergente");
			//writer.close();
			for(String item: listaDeItems) {
				writer.write(item+"\n");	
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//METODO PARA CREAR ARCHIVOS TEMPORALES EN C:\Users\leand\AppData\Local\Temp\
		
		/*
		Path tempFile1 = null;
		try {
			tempFile1 = Files.createTempFile("temporaryFile", ".txt");
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		System.out.println("tempFile1 = " + tempFile1);
		*/
		
		//METODO PARA LEER LA LISTADEITEMS[]
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("D:\\ArgentinaPrograma4.0UTNDesarrolloJavaWorkspace\\Clase5EjercicioPOOJavaArgentinaPrograma\\src\\ar\\com\\UTNArgentinaPrograma\\listaDeItemsAComprar.txt"));
			String line;
			Carrito carroDeSupermercado = new Carrito();
			while((line = reader.readLine()) != null) {
				carroDeSupermercado.agregarProducto(new Producto(line));
				System.out.println(line);
				
			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
