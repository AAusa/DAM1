package herencia.Ej1;

import java.util.Scanner;

public class Empleado {
	String nombre = "";
	int sueldo = 0;
	public Empleado() {
		PedirDatos();
	}
	private void PedirDatos() {
		System.out.println("Datos empleado:");
		System.out.print("	Nombre: ");
		Scanner teclado = new Scanner(System.in);
		nombre = teclado.nextLine();
		System.out.print("	Sueldo: ");
		sueldo = teclado.nextInt();
	}

	public void verDatos() {
		System.out.println("Resumen empleado:");
		System.out.print("	Nombre: "+nombre);
		System.out.print("	Sueldo: "+sueldo);
		System.out.println();
	}
}
