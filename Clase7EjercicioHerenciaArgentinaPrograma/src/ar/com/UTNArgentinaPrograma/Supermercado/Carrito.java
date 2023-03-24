package ar.com.UTNArgentinaPrograma.Supermercado;

import java.util.ArrayList;

public class Carrito {
	Persona persona;
	Descuento descuento;
	
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	
	public Carrito(Persona persona) {
		super();
		this.persona = persona;
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
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public Descuento getDescuento() {
		return descuento;
	}
	public void setDescuento(Descuento descuento) {
		this.descuento = descuento;
	}
}
