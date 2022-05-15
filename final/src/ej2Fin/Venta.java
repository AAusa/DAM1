package ej2Fin;


public class Venta {
	String fecha;
	int importe;
	boolean cobrada;
	String dniViajante;
	String separador = "\t";
	String separadorFinal = ".";
	
	public Venta(String fecha,
			int importe,
			String cobrada, String dniViajante) {
		this.fecha = fecha;
		this.importe = importe;
		this.dniViajante = dniViajante;
		this.cobrada = (cobrada.equalsIgnoreCase("Cobrada")) ? true : false;
	}
	
	public Venta(String datos) {
		asignarAtributos(datos);
	}
	
	public void asignarAtributos(String datos) {
		fecha = datos.substring(0, datos.indexOf(separador));
		datos = datos.substring(datos.indexOf(separador)+1, datos.length());
		importe = Integer.parseInt(datos.substring(0, datos.indexOf(separador)));
		datos = datos.substring(datos.indexOf(separador)+1, datos.length());
		cobrada = (datos.substring(0, datos.indexOf(separador))).equalsIgnoreCase("Cobrada") ? true : false;
		datos = datos.substring(datos.indexOf(separador)+1, datos.length());
		dniViajante = datos.substring(0, datos.indexOf(separadorFinal));
		
	}
	
	public String toString() {
		return fecha +"\t"+ importe +"\t"+ ((cobrada == true) ? "Cobrada" : "NoCobrada") +"\t" + dniViajante + ".";
	}
}
