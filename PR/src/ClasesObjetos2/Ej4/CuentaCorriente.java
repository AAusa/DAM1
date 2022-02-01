package ClasesObjetos2.Ej4;
/**
 * @author Álvaro
 * @params titular(string), saldo(float), código(string, 8 números) 
 * @metodos 
 * 		SetCodigo
 * 			Si es correcto o no
 * 			contador (int i=0; i<=codigo.length(); i++)
				Si código.charAt(i) >= 0 && código.charAt(i) <= 9
					digcorrecto += 1
			fin contador
			Si digcorrecto == codigo.length()
				codCorrecto = true
 * 		IngresarDinero (saldo += ingreso)
 * 			Salida: String con saldo
 * 		RetiraDinero (saldo -= retirado)
 * 			Salida: String con saldo
 * 		puedoSacar (si saldo <= 0 = false)
 * 			Salida: hecho, return
 */
public class CuentaCorriente {
	private String titular;
	private float saldo;
	private String codigo;
	private float ingresar;
	private float retirar;
	
	public float getIngresar() {
		return ingresar;
	}
	public void setIngresar(float ingresar) {
		this.ingresar = ingresar;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		int digcorrecto = 0;
		if(codigo.length() == 8) {
			for(int i=0; i<=codigo.length()-1; i++) {
				if(codigo.charAt(i) == '0' || codigo.charAt(i) == '1' || codigo.charAt(i) == '2' || codigo.charAt(i) == '3' || codigo.charAt(i) == '4' || codigo.charAt(i) == '5' || codigo.charAt(i) == '6' || codigo.charAt(i) == '7' || codigo.charAt(i) == '8' || codigo.charAt(i) == '9') {
					digcorrecto += 1;
				}
			}
			if(digcorrecto == codigo.length()) {
				this.codigo = codigo+" es correcto";
			}
			else {
				this.codigo = "Algún carácter no es un dígito";
			}	
		}
		else {
			this.codigo = "No hay 8 carácteres";
		}

	}
	public String ingresarDinero(float ingresar, String codigo) {
		String mensaje="";
		int digcorrecto = 0;
		if(codigo.length() == 8) {
			for(int i=0; i<=codigo.length()-1; i++) {
				if(codigo.charAt(i) == '0' || codigo.charAt(i) == '1' || codigo.charAt(i) == '2' || codigo.charAt(i) == '3' || codigo.charAt(i) == '4' || codigo.charAt(i) == '5' || codigo.charAt(i) == '6' || codigo.charAt(i) == '7' || codigo.charAt(i) == '8' || codigo.charAt(i) == '9') {
					digcorrecto += 1;
				}
			}
			if(digcorrecto == codigo.length()) {
				if(ingresar > 0) {
					saldo += ingresar;
					mensaje = "Ha ingresado "+ingresar+" €, ahora tiene "+saldo+" €";
				}
				else {
					mensaje = "El valor a ingresar debe ser positivo.";
				}
			}
			else {
				mensaje = "";
			}	
		}
		else {
			mensaje = "";
		}
		
		return mensaje;
		
	}
	
	public String puedoSacar (float retirar) {
			if(saldo >= retirar) {
				System.out.println("true (puede sacar dinero)");
			}
			else {
				System.out.println("false (no puede sacar dinero).");
				System.out.println("pulse return");
			}
		return "";
	}
	
	public String retiraDinero (float retirar) {
		if(saldo >= retirar) {
			saldo -= retirar;
			System.out.println("Ha retirado "+retirar+" €, ahora tiene "+saldo+" €");
		}
		else {
			System.out.println("");
		}
	return "";
}
	
	public CuentaCorriente(String titular, String codigo, int saldo) {
		this.titular = titular;
		this.saldo = saldo;
		this.codigo = codigo;
	}
	public float getRetirar() {
		return retirar;
	}
	public void setRetirar(float retirar) {
		this.retirar = retirar;
	}
}
