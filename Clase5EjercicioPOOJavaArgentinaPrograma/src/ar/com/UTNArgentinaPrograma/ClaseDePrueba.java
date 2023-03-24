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
import ar.com.UTNArgentinaPrograma.Supermercado.ItemCarrito;
import ar.com.UTNArgentinaPrograma.Supermercado.Persona;
import ar.com.UTNArgentinaPrograma.Supermercado.Producto;


public class ClaseDePrueba {

	public static void main(String[] args) {
		
		//METODO PARA CREAR UN TXT CON LOS ITEMS A COMPRAR Y DESPUES CONVERTIRLOS EN OBJETOS.
		/*
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
		*/
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
		Carrito carroDeSupermercado = new Carrito(new Persona("Nahuel","Molina",37));
		try {
			BufferedReader reader = new BufferedReader(new FileReader("D:\\ArgentinaPrograma4.0UTNDesarrolloJavaWorkspace\\Clase5EjercicioPOOJavaArgentinaPrograma\\src\\ar\\com\\UTNArgentinaPrograma\\listaDeItemsAComprar.txt"));
			String line;
			String[] tokens;
			while((line = reader.readLine()) != null) {
				tokens = line.split(",");
				int cantidad = Integer.parseInt(tokens[0]);
				String nombreProducto = tokens[1];
				int precio = Integer.parseInt(tokens[2]);
				String codigo = tokens[3];
				carroDeSupermercado.agregarProducto(new ItemCarrito(cantidad,nombreProducto,precio,codigo));
				//System.out.println(line);
			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Los productos del carro del supermercado son: ");
		int precioTotal=0;
		for(int i=0; i< carroDeSupermercado.getProductos().size();i++) {
			System.out.println("Cantidad: "+carroDeSupermercado.getProductos().get(i).getCantidad() +" Nombre: "+carroDeSupermercado.getProductos().get(i).getNombre()+" Precio: $"+carroDeSupermercado.getProductos().get(i).getPrecio()+" y su codigo es= "+carroDeSupermercado.getProductos().get(i).getCodigo());
			precioTotal = precioTotal+ (carroDeSupermercado.getProductos().get(i).getPrecio()*carroDeSupermercado.getProductos().get(i).getCantidad());
		}
		System.out.println("El precio total es: $"+precioTotal);
	}

}
