package ClasesObjetos2.Ej4new;
import java.util.Scanner;

public class CuentaCorriente {
	String titular;
	int saldo;
	String codigo;
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public CuentaCorriente() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Titular: ");
		titular = teclado.nextLine();
		System.out.print("Saldo: ");
		saldo = teclado.nextInt();
		System.out.print("Codigo: ");
		codigo = teclado.nextLine();
	}
	
	public boolean VerificaCod() {
		boolean codCorrecto = false;
		int digcorrecto = 0;
		if(codigo.length() == 8) {
			for(int i=0; i<=codigo.length()-1; i++) {
				if(codigo.charAt(i) == '0' || codigo.charAt(i) == '1' || codigo.charAt(i) == '2' || codigo.charAt(i) == '3' || codigo.charAt(i) == '4' || codigo.charAt(i) == '5' || codigo.charAt(i) == '6' || codigo.charAt(i) == '7' || codigo.charAt(i) == '8' || codigo.charAt(i) == '9') {
					digcorrecto += 1;
				}
			}
			if(digcorrecto == codigo.length()) {
				codCorrecto = true;
			}
		}
		return codCorrecto;
	}
	
	int IngresarDinero ( int aIngresar ) {
		int devuelto = 0;
		if(VerificaCod() == true) {
			if(aIngresar > saldo) {
				System.out.println("ERROR");
			}
			else {
				devuelto = saldo - aIngresar;
			}
		}
		return devuelto;
	}
	
	private boolean PuedoSacar ( int aRetirar ) {
		boolean correcto = false;
		String mensaje = "";
		if(aRetirar > saldo) {
			correcto = false;
		}
		return correcto;
	}
	
	String RetirarDinero ( int aRetirar ) {
		String mensaje = "";
		int devuelto = 0;
		if(PuedoSacar(aRetirar) == true) {
			devuelto = saldo - aRetirar;
			mensaje = "Devuelto: "+devuelto;
		}
		else {
			mensaje = "Pulse Return";
		}
		return mensaje;
	}
}

/*
 * CuentaCorriente
	titular
	saldo
	codigo
	getters de todos

	CuentaCorriente
		nextLine = titular
		nextLine = saldo
		nextLine = codigo
 
	getters de todos

	private boolean VerificaCod

	int IngresarDinero ( aIngresar )
		si VerificaCod = true
			si aIngresar > saldo
				"ERROR"
			sino
				devuelto = saldo - aIngresar
	
	return devuelto

	private boolean PuedoSacar ( aRetirar )
		correcto = true
		si aRetirar > saldo
			correcto = false
	
	return correcto

	String RetirarDinero ( aRetirar )
		si PuedoSacar() = true
			devuelto = saldo - aIngresar
			mensaje = devuelto
		sino
			mensaje = "Pulse return"
	return devuelto
			
			
Cuentas
	Constructor
		obj vectorCuentas de 100
		int vectorSaldos de 100
		RellenarVectores()


	RellenarVectores
		i = 0
		while (correcto < 101)
			nextLine = vectorCuentas[i].setTitular
			nextInt = vectorCuentas[i].setSaldo = vectorSaldos[i]
			nextLine = codigo[i].setCodigo
			si VerificaCod() = true
				correcto += 1
			sino
				boolean = false
			i++
		arrays.sort(vectorSaldos)

	CompararVectores
		for de 100 i
			si  vectorCuentas[i].setSaldo == vectorSaldos[99]
				imprime inf.
*/
