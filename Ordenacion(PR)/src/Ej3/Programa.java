package Ej3;
import java.util.Random;

public class Programa {
	public static void main (String[]args) {
		final int NUMNOMBRES = 10;
		final int NUMALUMNOS = 50;
		final int MAXNOTA = 100;
		String[] nombre = new String[NUMNOMBRES];
		String[] apellido = new String[NUMNOMBRES];
		Alumno[] a = new Alumno[NUMALUMNOS];
		Random r = new Random();
		
		for (int i = 0; i < NUMALUMNOS; i++) {
			a[i] = new Alumno (nombre[r.nextInt(NUMNOMBRES)], apellido[r.nextInt(NUMNOMBRES)]);
			for (int j = 0; j < 3; j ++) {
				int nota = r.nextInt(MAXNOTA);
				//asignar a alumno
			}
			
		}
	}
}
