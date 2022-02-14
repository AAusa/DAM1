package herencia.Ej2.visibilidad2;

public class EmpleadoEspecial{
	public EmpleadoEspecial() {
		System.out.println("En empleado especial"); // 3.- Deja ver public, protected. No deja private y local
	}
	public String nombreEs;
	private float sueldoEs;
	protected String direccionEs;
	int edad;
}