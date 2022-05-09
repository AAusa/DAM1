

import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Principal {
	public static void main(String[]args) throws IOException {
		Random r = new Random();
		Pila p = new Pila();
		int cantidadCrear = (int)(Math.random()*p.MAXSIZE)+1;
		for(int i = 0; i < cantidadCrear; i++) {
			try {
				p.push((int)(Math.random()*10+1));
			} catch (PilaDesbordeException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}

		int cantidadBorrar = (int)(Math.random()*(cantidadCrear/2))+1;
		for(int i = 0; i < cantidadBorrar; i++) {
			try {
				p.pop();
			} catch (PilaVaciaException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}

		System.out.println("Nº de elementos: "+p.size());
		try {
			p.verElementos();
		} catch (PilaVaciaException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		FileReader in = null;

		try {
			int c;
			in = new FileReader("C:\\Users\\alu\\eclipseWorkspace\\programacion\\Ficheros(PR)\\bin\\fichero.txt");

			while ((c = in.read()) != -1) {
				System.out.print((char)c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
		}

	}
}
