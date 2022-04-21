package ej10;

public class Carta {
	String numero;
	String palo;
	
	public boolean validarPalo(String palo) {
		if (palo.equalsIgnoreCase("oros") || palo.equalsIgnoreCase("espadas") ||
			    palo.equalsIgnoreCase("bastos") || palo.equalsIgnoreCase("copas")) {
				return true;
			}
			return false;
	}
	
	public boolean validarNumero(String numero) {
		if (numero.equals("1") || numero.equalsIgnoreCase("as") ||
			numero.equals("2") || numero.equals("3") ||
			numero.equals("4") || numero.equals("5") ||
			numero.equals("6") || numero.equals("7") ||
			numero.equals("8") || numero.equalsIgnoreCase("sota") ||
			numero.equals("9") || numero.equalsIgnoreCase("caballo") ||
			numero.equals("10") || numero.equalsIgnoreCase("rey")) {
				return true;
			}
			return false;
	}
	
	public boolean validarNumero(int numero) {
		if (numero >= 1 && numero <= 10) {
				return true;
			}
			return false;
	}
	
	public Carta(String palo, String numero) {
		if (validarPalo(palo) && validarNumero(numero)) {
			this.palo = palo;
			this.numero = numero;
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	
	
	
	public Carta(String palo, int numero) {
		if (validarPalo(palo) && validarNumero(numero)) {
			this.palo = palo;
			if(numero > 1 && numero < 8) {
				this.numero = Integer.toString(numero);
			}
			this.numero = (numero == 1 ? " " :
				          (numero == 8 ? "sota" :
				           numero == 9 ? "caballo" :
				           numero == 10 ? "rey" :
				           Integer.toString(numero)));
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	
	public String toString() {
		return "["+palo+"|"+numero+"]";
	}
}
