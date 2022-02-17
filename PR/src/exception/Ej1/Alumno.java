package exception.Ej1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Alumno {
	String nombre;
	int edad;
	int altura;
	public void PedirDatos() {
		System.out.print("Nombre: ");
		Scanner teclado = new Scanner(System.in);
		nombre = teclado.nextLine();
		
		System.out.print("Edad: ");
		edad = teclado.nextInt();
		
		System.out.print("Altura: ");
		altura = teclado.nextInt();
	}
	
	public void VerDatos() {
		System.out.print("Nombre: "+nombre+" ");
		System.out.print("Edad: "+edad+" ");
		System.out.print("Altura: "+altura+" ");
	}
	
	public void accionComprobacion() {
		try {
			PedirDatos();
		} catch(InputMismatchException e) {
			System.out.println("ERROR");
			accionComprobacion();
		}
	}

	public Alumno() {
		accionComprobacion();
		VerDatos();
	}
}
