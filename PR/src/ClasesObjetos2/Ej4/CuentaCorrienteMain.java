package ClasesObjetos2.Ej4;

import java.util.Scanner;

/**
 * @author �lvaro
 * 
 *  1� Lectura:
	 *  	Titular
	 *  	Saldo
	 *  	Comprobaci�n del c�digo
	 *  		Guardado en get y set
 *  2� Preguntar que opci�n realizar
 *  3� Realizar la operacion
 *  		Si es Ingresar --> se realiza
 *  		Si es Retirar --> puede sacar dinero o no
 *  
 *  						  
 *
 */

public class CuentaCorrienteMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		String codigo="";
		int opcion=0;
		float aIngresar=0;
		float aRetirar=0;
		CuentaCorriente cuentaCorriente1 = new CuentaCorriente();
		System.out.println("C�digo: ");
		Scanner teclado = new Scanner (System.in);
		codigo = teclado.nextLine();
		cuentaCorriente1.setCodigo(codigo);
		System.out.println(cuentaCorriente1.getCodigo());
		System.out.println("Si el anterior mensaje indica que el c�digo es incorrecto pulse 0");
		System.out.println("Si desea ingresar dinero pulse 1");
		System.out.println("Si desea retirar dinero pulse 2");
		opcion = teclado.nextInt();
		switch(opcion) {
		case 0:
			System.out.println("Fin de la operaci�n");break;
		case 1:
			System.out.println("�Cu�nto dinero desea ingresar?");
			aIngresar = teclado.nextFloat();
			cuentaCorriente1.setIngresar(aIngresar);
			System.out.println(cuentaCorriente1.ingresarDinero(aIngresar, codigo));break;
		case 2:
			System.out.println("�Cu�nto dinero desea retirar?");
			aRetirar = teclado.nextFloat();
			cuentaCorriente1.setRetirar(aRetirar);
			System.out.println(cuentaCorriente1.puedoSacar(aRetirar));
			System.out.println(cuentaCorriente1.retiraDinero(aRetirar));break;	
		default:
			System.out.println("Opci�n incorrecta");
			**/
	Cuentas prueba = new Cuentas();
	prueba.generarDatosCuenta();
	prueba.comparacionSaldos();
	}
}
