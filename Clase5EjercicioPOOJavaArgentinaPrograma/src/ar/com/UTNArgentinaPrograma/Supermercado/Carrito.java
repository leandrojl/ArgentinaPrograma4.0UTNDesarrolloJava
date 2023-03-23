package ar.com.UTNArgentinaPrograma.Supermercado;

import java.util.ArrayList;

public class Carrito {
	
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	
	public Carrito() {
		super();
		
	}
	public void agregarProducto(Producto producto) {
		productos.add(producto);	
	}
	public ArrayList<Producto> getProductos() {
		return productos;
	}
	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
}
