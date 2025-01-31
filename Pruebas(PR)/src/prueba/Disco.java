package prueba;
/**
 * @author �lvaro
 * @params titulo, nCanciones, precio y fechaCompra
 */
public class Disco {
	
	//Se crean atributos privados
	private String titulo;
	private int nCanciones;
	private double precio;
	private String fechaCompra;
	
	// Se crean los get y set p�blicos para que se les pueda dar valor a los atributos de los objetos
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getnCanciones() {
		return nCanciones;
	}
	public void setnCanciones(int nCanciones) {
		this.nCanciones = nCanciones;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	
	// Se crea un constructor por defecto
	public Disco() {
		this.titulo="";
		this.nCanciones=0;
		this.precio=0;
		this.fechaCompra="";
	}
	
	// Se crea un constructor con los par�metros que necesitamos
	public Disco(String titulo, int nCanciones, int precio, String fechaCompra) {
		this.titulo=titulo;
		this.nCanciones=nCanciones;
		this.precio=precio;
		this.fechaCompra=fechaCompra;
	}
	
}
