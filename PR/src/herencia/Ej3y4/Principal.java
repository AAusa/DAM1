package herencia.Ej3y4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Empleado e = new Empleado();
		Empleado j = new Jefe();
		e.LeerDatos();
		((Jefe) j).LeerDatosJefe();
		System.out.println("MENU:");
		System.out.println("	1. Mod. sueldo base empleado");
		System.out.println("	2. Mod. plus jefes");
		System.out.println("	3. Ver datos empleados");
		System.out.println("	4. Salir");
		System.out.print("OPCI�N: ");
		Scanner teclado = new Scanner(System.in);
		int opcion = teclado.nextInt();
		switch(opcion) {
		case 1:
			System.out.print("Sueldo nuevo: ");
			int sueldoNuevo = teclado.nextInt();
			e.setSueldoBase(sueldoNuevo);break;
		case 2:
			System.out.print("Plus nuevo: ");
			int plusNuevo = teclado.nextInt();
			((Jefe) j).setIncSueldo(plusNuevo);break;
		case 3:
			e.LeerDatos();
			((Jefe) j).LeerDatosJefe();break;	
		case 4:break;
		default:
			System.out.println("Dato erroneo");
		}
		
	}

}
