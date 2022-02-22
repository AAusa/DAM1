package herencia2.Ej2new;

import java.util.Scanner;

public class Empleado {
	String nombre;
	int sueldoB;
	int edad;
	public Empleado() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Nombre: ");
		nombre = teclado.nextLine();
		System.out.print("sueldoB: ");
		sueldoB = teclado.nextInt();
		System.out.print("Edad: ");
		edad = teclado.nextInt();	
		System.out.println();
	}
	
	void visualizarTodosLosDatos() {
		System.out.println();
		System.out.print("Nombre: "+nombre+" ");
		System.out.print("sueldoB: "+sueldoB+" ");
		System.out.print("Edad: "+edad+" ");
	}
}

/*
 * 	PLANTEAMIENTO:
	empleados
		constructor()
			se asigna  nombre, sueldoB, edad
	
		visualizarTodosDatos()
			syso Datos
	
	adm maq
	constructor(parametros)
			
	
		visualizarTodosDatos()
			super()
	Main
		numEmpleados = teclado
		numAdm = teclado
		numMaq = teclado
		totalD = numEmpleados + numAdm + numMaq
		vectorEmpleado [totalD]
		for numEmpleados
			if(i < numEmpleados)
				pidenDatos
				instanciaObjeto
			if(i < numMaq)
				pidenDatos
				instanciaObjeto
			if(i < numAdm)
				pidenDatos
				instanciaObjeto
	for de total
		emp[i] instanceof Empleados
			visualiza
		emp[i] instanceof Administrativos
			visualiza
		emp[i] instanceof Maquinistas
			visualiza
 */


