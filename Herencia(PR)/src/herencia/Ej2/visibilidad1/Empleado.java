package herencia.Ej2.visibilidad1;

public class Empleado {
	
	public Empleado() {
		System.out.println("En empleado"); // 1.- Entra en empleado. Deja usar todo menos private
	}
	private int sueldo;
	String nombre;
	protected String direccion;
	public int edad;
}