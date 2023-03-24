package ar.com.UTNArgentinaPrograma.Supermercado;

public class Producto {
	String nombre;
	int cantidad;
	int precio;
	String codigo;
	
	public Producto(int cantidad, String nombre, int precio, String codigo) {
		super();
		this.cantidad =  cantidad;
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
