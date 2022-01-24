package ClasesObjetos2.Ej2;

/**
 * @author Álvaro
 *
 */
import java.util.Scanner;
public class EmpleadoMain {

	/**
	 * @param nombre, numEmpleado
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado empleado1 = new Empleado();
		
		// Se obtiene nombre y numEmpleado y se inserta en el atributo del objeto:
		System.out.println("Introduzca nombre:");
		Scanner teclado = new Scanner (System.in);
		String nombre = teclado.nextLine();	
		
		
		System.out.println("Introduzca numEmpleado:");
		int numEmpleado = teclado.nextInt();	

		empleado1.leerDatos(nombre,numEmpleado);
		
		//Se muestra el método toString:
		System.out.println(empleado1.verDatos());
	}

}
