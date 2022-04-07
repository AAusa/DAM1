package Ej3;

public class Clase {
	
	final int NUMALUMNOS = 50;
	Alumno[] a = new Alumno[NUMALUMNOS];
	int contadorAlumnos = 0;
	
	public void matricular(String nombre, String apellido) {
		for (int i = 0; i < contadorAlumnos; i++) {
			if (a[i].nombre.equals(nombre) && a[i].apellido.equals(apellido)) {
				return;
			}
		}
		if (contadorAlumnos < a.length) {
			a[contadorAlumnos++] = new Alumno(nombre, apellido);
		}
	}

	
}
