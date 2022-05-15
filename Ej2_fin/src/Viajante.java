import java.util.ArrayList;

public class Viajante {
	String dni;
	String nombre;
	String antiguedad;
	int km;
	Venta v;
	String separador = "\t";
	String separadorFinal = ".";
	ArrayList<Venta> ventas = new ArrayList<Venta>();
	public Viajante(String dni, String nombre, String antiguedad, int km) {
		this.dni = dni;
		this.nombre = nombre;
		this.antiguedad = antiguedad;
		this.km = km;
	}
	
	public Viajante(String datos) {
		asignarAtributos(datos);
	}
	
	/*
	 * Para que al inicio asigne al array los datos del fichero
	 */
	public void asignarAtributos(String datos) {
		dni = datos.substring(0, datos.indexOf(separador));
		datos = datos.substring(datos.indexOf(separador)+1, datos.length());
		nombre = datos.substring(0, datos.indexOf(separador));
		datos = datos.substring(datos.indexOf(separador)+1, datos.length());
		antiguedad = datos.substring(0, datos.indexOf(separador));
		datos = datos.substring(datos.indexOf(separador)+1, datos.length());
		km = Integer.parseInt(datos.substring(0, datos.indexOf(separadorFinal)));
		
	}
	
	public String toString() {
		return dni +"\t"+ nombre +"\t"+ antiguedad +"\t"+ km + ".";
	}
	
public static boolean valida(String matricula) {
		if(matricula.length() == 1) {
			return true;
		}
		else {
			return false;
		}
	}
}
