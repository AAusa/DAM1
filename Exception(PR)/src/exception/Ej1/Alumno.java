package exception.Ej1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Alumno {
	//COMPROBACIONES INTERNAS
	Scanner teclado = new Scanner(System.in);
	String nombre;
	int edad;
	int altura;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public void PedirDatos() {
		System.out.print("Nombre: ");
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
	
	public String Comparar(Alumno alu1, Alumno alu2) {
		String respuesta = "";
		if(alu1.altura > alu2.altura) {
			respuesta = "Alu1 mayor";
		}
		else if(alu1.altura < alu2.altura) {
			respuesta = "Alu1 menor";
		}
		else {
			respuesta = "Iguales";
		}
		return respuesta;
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
