package herencia.Ej2.visibilidad1;

import herencia.Ej2.visibilidad2.EmpleadoEspecial;

public class Jefe extends EmpleadoEspecial{
	public Jefe() {
		super();
		System.out.println("En jefe");
		EmpleadoEspecial emp = new EmpleadoEspecial();
		 //EJ1:
		 //sueldo = 0;
		 //nombre = "";
		 //direccion = "";
		 //edad = 0;
		 
		 //EJ3:
		 nombreEs = "";
		 //sueldoEs = 0;
		 direccionEs = "";
		 //edad = 0;
	}
}

