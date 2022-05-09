package Ej1;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException {
		Primo primo = new Primo();
		DataInputStream in = null;
		try {
			int c;
			in = new DataInputStream(
					new BufferedInputStream(
							new FileInputStream("C:\\\\Users\\\\alu\\\\eclipseWorkspace\\\\programacion\\\\Ficheros(PR)\\\\bin\\\\Ej1\\\\primo.txt")));
			while ((c = in.readInt()) != -1) {
				System.out.print(c+" ");
			}
		}catch ( EOFException e ) {
			
		} finally {
			if (in != null) {
				in.close();
			}
		}
	}
}
