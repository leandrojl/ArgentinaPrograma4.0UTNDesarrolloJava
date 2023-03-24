package ar.com.UTNArgentinaPrograma;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import ar.com.UTNArgentinaPrograma.Supermercado.Carrito;
import ar.com.UTNArgentinaPrograma.Supermercado.ItemCarrito;
import ar.com.UTNArgentinaPrograma.Supermercado.Persona;

public class ClaseDePrueba {

	public static void main(String[] args) {
		
		Carrito carroDeSupermercado = new Carrito(new Persona("Nahuel","Molina",37));
		try {
			BufferedReader reader = new BufferedReader(new FileReader("D:\\ArgentinaPrograma4.0UTNDesarrolloJavaWorkspace\\Clase7EjercicioHerenciaArgentinaPrograma\\src\\ar\\com\\UTNArgentinaPrograma\\listaDeItemsAComprar.txt"));
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
