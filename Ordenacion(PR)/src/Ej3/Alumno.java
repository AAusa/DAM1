package Ej3;

public class Alumno {
	final int NUMEXAMENES = 3;
	String nombre;
	String apellido;
	int contadorNotas = 0;
	int[] notas = new int[NUMEXAMENES];
	
	public Alumno(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public Alumno(String nombre, String apellido, int[] notas) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.notas = notas;
	}
	
	public void añadirNota(int nota) {
		if (contadorNotas <= 3) {
			notas[contadorNotas++] = nota;
		}
	}
}
