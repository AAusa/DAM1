package herencia.Ej2.visibilidad1;

import herencia.Ej2.visibilidad2.EmpleadoEspecial;

public class JefeEspecial extends EmpleadoEspecial{
	public JefeEspecial(){
		super();
		System.out.println("En jefe especial"); // 2.- Entra en empleado especial, deja acceder excepto a private y variable de la propia clase
		nombreEs = "";
		//sueldoEs = 0;
		direccionEs = "";
		//edad = 0;
	}
}