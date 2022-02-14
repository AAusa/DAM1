package herencia.Ej1;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		//EMPLEADOS:
		System.out.print("Empleados a ingresar: ");
		Scanner teclado = new Scanner(System.in);
		int numEmpleados = teclado.nextInt();
		System.out.print("Jefes a ingresar: ");
		int numJefes = teclado.nextInt();
		
		Empleado [] emp = new Empleado[numEmpleados+numJefes];
		
		//INSERTAR DATOS:
		for(int i = 0; i < numEmpleados+numJefes; i++) {
			if(i < numEmpleados) {
				emp[i] = new Empleado();
			}
			else {
				emp[i] = new Jefe();
			}
		}
		
		// VER DATOS DE CADA UNO:
		for(int i = 0; i < numEmpleados+numJefes; i++) {
			if(i < numEmpleados) {
				emp[i].verDatos();
			}
			else {
				((Jefe) emp[i]).verDatosJefe();
			}
		}
	}
}
