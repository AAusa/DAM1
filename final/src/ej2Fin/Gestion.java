package ej2Fin;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;




public class Gestion {
	ArrayList<Viajante> viajantes = new ArrayList<Viajante>();
	ArrayList<Venta> ventas = new ArrayList<Venta>();
	boolean add = true; // existe el fichero
	Scanner lectura = null;
	PrintStream escritura = null;
	String ficheroVentas = "ventas.txt";
	String ficheroHistoricoVentas = "historico.txt";
	String ficheroViajantes = "viajantes.txt";



	public void listadoViajantes() {
		for(Viajante x : viajantes) {
			System.out.println(x);
		}
	}

	public void listadoVentas() {
		for(Venta x : ventas) {
			System.out.println(x);
		}
	}

	public Gestion() {
		if(abrirFicheroViajantes() && abrirFicheroVentas()) {
			System.out.println("todo bien");
		}
		listadoViajantes();
		listadoVentas();
	}


	public boolean abrirFicheroViajantes() {
		try {
			lectura = new Scanner(new BufferedReader(new FileReader(ficheroViajantes)));
		} catch (FileNotFoundException e) {
			add = false;
		}
		if(add) {
			while(lectura.hasNextLine()) {
				if(!viajantes.add(new Viajante(lectura.nextLine()))) {
					System.out.println("No se guarda");
				}

			}
		}
		else {
			System.out.println("Fichero de viajantes no existe");
		}
		return add;
	}
	public boolean abrirFicheroVentas() {
		if(lectura != null)
			lectura.close();		
		try {
			lectura = new Scanner(new BufferedReader(new FileReader(ficheroVentas)));
		} catch (FileNotFoundException e) {
			add = false;
		}
		if(add) {
			while(lectura.hasNextLine()) {
				//que ocurre si no esta
				if(!ventas.add(new Venta(lectura.nextLine()))) {
					System.out.println("No se mete");
				}
			}
		}
		else {
			System.out.println("Fichero de ventas no existe");
		}
		asignarVentas();
		return add;
	}
	/*
	 * Asignar cada venta a su viajante
	 */
	public void asignarVentas() {
		for(Venta x: ventas) {
			for(Viajante y: viajantes) {
				if((x.dniViajante).equalsIgnoreCase(y.dni)) {
					y.ventas.add(x);
				}
			}
		}
	}

	public void annadirViajante(String dni, String nombre, String antiguedad, int km)  {		
		viajantes.add(new Viajante(dni, nombre, antiguedad,km));
	}

	public void eliminarViajante(String dni)  {	
		Iterator<Viajante> iterador = viajantes.iterator();
		while ( iterador.hasNext() ) {
			Viajante entrada = iterador.next();
			if(entrada.dni.equals(dni)) {
				iterador.remove();
			}
		}
	}

	public void annadirVenta(String fecha, int importe, String cobrada, String dniViajante)  {		
		ventas.add(new Venta(fecha, importe, cobrada, dniViajante));
	}

	public void cobrarVenta(String fecha, int importe, String cobrada, String dniViajante)  {
		Iterator<Venta> iterador = ventas.iterator();
		while ( iterador.hasNext() ) {
			Venta entrada = iterador.next();
			if(cobrada.compareTo("NoCobrada") == 0 &&
			   entrada.dniViajante.equals(dniViajante)) {
				entrada.cobrada = true;
			}
		}
	}

	public void inicializar(String cobrada)  {
		Iterator<Viajante> itViajante = viajantes.iterator();
		while ( itViajante.hasNext() ) {
			Viajante entrada = itViajante.next();
			entrada.km = 0;
		}
		try {
			escritura = new PrintStream(new FileOutputStream(ficheroHistoricoVentas));
		} catch (FileNotFoundException e) {}
		Iterator<Venta> itVentas = ventas.iterator();
		while ( itVentas.hasNext() ) {
			Venta entrada = itVentas.next();
			if(cobrada.compareTo("NoCobrada") == 0) {
				escritura.println(entrada);
				itVentas.remove();
			}
		}
	}

	public String importesAcumulados(String cobrada, String dniViajante)  {
		int total = 0;
		Iterator<Venta> iterador = ventas.iterator();
		while ( iterador.hasNext() ) {
			Venta entrada = iterador.next();
			if(cobrada.compareTo("NoCobrada") == 0 &&
					entrada.dniViajante.equals(dniViajante)) {
				total += entrada.importe;
			}
		}
		return "Importe total: "+total;
	}

	public void volcadoViajantes() {
		if(lectura != null)
			lectura.close();
		if(escritura != null)
			escritura.close();

		try {
			escritura = new PrintStream(new FileOutputStream(ficheroViajantes));
		} catch (FileNotFoundException e) {}

		for(Viajante x: viajantes) {
			escritura.println(x);
		}
		escritura.close();
	}

	public void volcadoVentas() {
		if(lectura != null)
			lectura.close();
		if(escritura != null)
			escritura.close();

		try {
			escritura = new PrintStream(new FileOutputStream(ficheroVentas));
		} catch (FileNotFoundException e) {}

		for(Venta x: ventas) {
			escritura.println(x);
		}
		escritura.close();
	}

	public void incrementar(String dni, int km)  {
		Iterator<Viajante> itViajante = viajantes.iterator();
		while ( itViajante.hasNext() ) {
			Viajante entrada = itViajante.next();
			if(entrada.dni.equals(dni)) {
				entrada.km += km;
			}
		}
	}
	
	public void listaNoCobrado(String dni) {
		Iterator<Venta> iterador = ventas.iterator();
		String cobrada = "NoCobrada";
		while ( iterador.hasNext() ) {
			Venta entrada = iterador.next();
			if(entrada.cobrada == false &&
					entrada.dniViajante.equals(dni)) {
					System.out.println(entrada);
			}
		}
	}
}
