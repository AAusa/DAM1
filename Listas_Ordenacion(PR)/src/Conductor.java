import java.util.Random;

public class Conductor {
	public static void main(String[]args) {
		final int TAM = 100_000;
		final int MAX = 1_000_000;
		Random r = new Random();
		int [] vector = new int[TAM];
		// Crear una lista en vector de 100000 elementos de una longitud entre 1 - 1Millon
		for(int i = 0; i < TAM; i++) {	
			vector[i] = r.nextInt(MAX)+1;
		}
		
		//Ejecucion de metodos:
		Qsort qs = new Qsort(vector);
		System.out.println("Qsort: "+qs.tiempo());
		
		Shell s = new Shell(vector);
		System.out.println("Shell: "+s.tiempo());
		
		Burbuja b = new Burbuja(vector);
		System.out.println("Burbuja: "+b.tiempo());
	
	}
}
