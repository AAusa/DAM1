import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Pila {
	final int MAXSIZE = 100;
	int [] datos;
	int size;
	int cantidadElementos = 0;
	DataOutputStream out = null;
	public Pila () {
		datos = new int[MAXSIZE];
	}

	void push (int valor) throws PilaDesbordeException, IOException {
		if(MAXSIZE <= cantidadElementos) {
			throw new PilaDesbordeException("No pueden entrar más elementos");
		}
		else {
			datos [cantidadElementos ++] = valor;
			try {
				out = new DataOutputStream(
						new BufferedOutputStream(
								new FileOutputStream("C:\\\\Users\\\\alu\\\\eclipseWorkspace\\\\programacion\\\\Ficheros(PR)\\\\bin\\\\fichero.txt")));

				out.writeInt(valor);

			} finally {
				if (out != null) {
					out.close();
				}
			}

		}	
	}

	public int pop () throws PilaVaciaException {
		if(cantidadElementos == 0) {
			throw new PilaVaciaException("Pila vacia");
		}
		else {
			return datos[cantidadElementos--];
		}			
	}

	public int size() {
		return cantidadElementos;
	}

	public void verElementos() throws PilaVaciaException {
		for(int i = cantidadElementos-1; i >= 0; i--) {
			if(cantidadElementos == 0) {
				throw new PilaVaciaException("Pila vacia");
			}
			else {
				System.out.println("Posición "+i+", contenido: "+datos[cantidadElementos--]);
			}
		}
	}
}
