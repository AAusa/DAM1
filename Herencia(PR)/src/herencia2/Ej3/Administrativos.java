package herencia2.Ej3;

import java.util.Scanner;

public class Administrativos extends Empleados {
	String estudios = "";
	int numOrdenador = 0;
	public Administrativos() {
		System.out.println("Inf. administrativos:");
		pedirTodosDatos();
	}
	
	private void pedirTodosDatos() {
		System.out.println("Estudios:");
		Scanner teclado = new Scanner(System.in);
		estudios = teclado.nextLine();
		System.out.println("Nº ordenador: ");
		numOrdenador = teclado.nextInt();
	}

	public void visualizarTodosDatos() {
		super.visualizarTodosDatos();
		System.out.println("Inf. administrativo:");
		System.out.println("Estudios: "+estudios);
		System.out.println("Nº ordenador: "+numOrdenador);
		System.out.println();
	}
}
