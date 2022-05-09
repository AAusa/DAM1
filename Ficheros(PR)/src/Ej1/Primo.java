package Ej1;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Primo {
	//List<Integer> l = new ArrayList<>();
	
	int[] primos = {2, 3, 5, 7, 11, 13, 17, 19};
	public void escribirPrimos() throws IOException {
		DataOutputStream out = null;
		
		try {
			out = new DataOutputStream(
					new BufferedOutputStream(
							new FileOutputStream("C:\\Users\\alu\\eclipseWorkspace\\programacion\\Ficheros(PR)\\bin\\Ej1\\primo.txt")));
			for(int x : primos) {
				out.writeInt(x);
			}
		} finally {
			if (out != null) {
				out.close();
			}
		}

	}
	
	public Primo() throws IOException {
		escribirPrimos();
	}
}
