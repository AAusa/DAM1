import java.util.Iterator;
import java.util.Scanner;

public class Menu {
	
	String ficheroVentas = "ventas.txt";
	String ficheroHistoricoVentas = "ventas.txt";
	String ficheroViajantes = "viajantes.txt";
	Gestion g;
	// Entrada de datos
	Scanner teclado = new Scanner(System.in);

	public Menu () {
		g = new Gestion();
		boolean fin;
		do {
			fin = trabajo();
		} while ( ! fin );
		g.volcadoViajantes();
		g.volcadoVentas();
	}

	private void imprimir ( ) {
		System.out.println("Elija una opcion");
		System.out.println("1. Añadir un viajante\n"
				+ "2. Eliminar un viajante\n"
				+ "3. Mostrar un listado de todos los viajantes, indicando la distancia recorrida y el importe acumulado de\n"
				+ "las ventas cobradas\n"
				+ "4. Inicializar ventas: la distancia recorrida de todos los viajantes pasará a ser cero y las ventas cobradas\n"
				+ "de todos ellos se almacenarán en el histórico, eliminándolas (del programa)\n"
				+ "5. Incrementar la distancia recorrida por un viajante (deberá pedir el número de kilómetros recorridos)\n"
				+ "6. Añadir una venta de un viajante\n"
				+ "7. Cobrar una venta de un viajante\n"
				+ "8. Mostrar un listado de todas las ventas no cobradas de un viajante\n"
				+ "9. Terminar el programa");

	}
	private boolean trabajo ( ) {
		int opcion;
		do {
			imprimir();
			try {
				opcion = teclado.nextInt();
			} catch ( Exception e ) {
				System.out.println("Debe introducir un numero entre 1 y 8");
				opcion = 0;
				teclado.next();
			}
		} while ( opcion < 1 || opcion > 9 );
		if ( opcion == 9 )
			return true;
		switch ( opcion ) {
		case 1:
			annadirViajante();
			break;
		case 2:
			eliminarViajante();
			break;
		case 3:
			listado();
			break;
		case 4:
			inicializar();
			break;
		case 5:
			incrementar();
			break;
		case 6:
			annadirVenta();
			break;
		case 7:
			cobrar();
			break;
		case 8:
			listaNoCobrado();
			break;
		case 9:
			break;
		}
		return false;
	}
	
	public void annadirViajante() {
		String dni;
		String nombre;
		String antiguedad;
		int km;
		boolean valida;
		
		do {
			valida=true;
			System.out.println("dni:");
			dni = teclado.next();
			if(Viajante.valida(dni) == false) {
				System.out.println("dni invalida");
				valida = false;
			}
		
		}while(!valida);

		System.out.println("nombre:");
		nombre = teclado.next();
		System.out.println("antiguedad:");
		antiguedad = teclado.next();
		System.out.println("km:");
		km = teclado.nextInt();
		g.annadirViajante(dni, nombre, antiguedad, km);
	}
	
	public void eliminarViajante() {
		String dni;
		System.out.println("dni:");
		dni = teclado.next();
		g.eliminarViajante(dni);
	}
	
	public void annadirVenta() {
		String fecha;
		int importe;
		String cobrada;
		String dniViajante;
		System.out.println("fecha:");
		fecha = teclado.next();
		System.out.println("importe:");
		importe = teclado.nextInt();
		System.out.println("cobrada:");
		cobrada = teclado.next();
		System.out.println("dni:");
		dniViajante = teclado.next();
		g.annadirVenta(fecha, importe, cobrada, dniViajante);
	}
	
	public void listado() {
		String cobrada;
		String dniViajante;
		System.out.println("cobrada:");
		cobrada = teclado.next();
		System.out.println("dni:");
		dniViajante = teclado.next();
		g.listadoViajantes();
		System.out.println(g.importesAcumulados(cobrada, dniViajante));
	}
	
	public void cobrar() {
		String fecha;
		int importe;
		String cobrada;
		String dniViajante;
		System.out.println("fecha:");
		fecha = teclado.next();
		System.out.println("importe:");
		importe = teclado.nextInt();
		System.out.println("dni:");
		dniViajante = teclado.next();
		System.out.println("cobrada:");
		cobrada = teclado.next();
		
		g.cobrarVenta(fecha, importe, cobrada, dniViajante);
	}
	
	public void inicializar() {
		System.out.println("cobrada:");
		String cobrada = teclado.next();
		g.inicializar(cobrada);
	}
	
	public void incrementar() {
		System.out.println("dni:");
		String dni = teclado.next();
		System.out.println("km:");
		int km = teclado.nextInt();
		g.incrementar(dni, km);
		
	}
	
	public void listaNoCobrado() {
		System.out.println("dni:");
		String dni = teclado.next();
		g.listaNoCobrado(dni);
	}
	
}
