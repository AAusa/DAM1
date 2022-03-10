/**
 * Toma de datos: fecha inicial y final
 * Contador_dias = 0
 * Si aIni>aFin
 * 		fecha erronea
 * Sino
 * 		Si mIni>mFin
 * 			fecha erronea
 * 		Sino 
 * 			Si dIni>dFin
 * 				fecha erronea
 *		 
 *
 * Mientras (fecha inicial > fecha final)
 *		contador++
 *		fecha inicial++
 *		
	 *Si a�o % 4 = 0
	 * 		es bisiesto
	 * Sino 
	 * 		no es bisiesto
	 *
	 * En cuanto al mes:
	 * 		Si es: 4,6,9,10
	 * 			diasMes=30
	 *		Si es: 2
	 *			Si es bisiesto
	 *				diasMes=29
	 *			Sino 
	 *				diasMes=28
	 *		El resto:
	 *			diasMes=31	
 *
 *		Si es el �ltimo d�a del a�o
 *			dia_inicial = 1
 *			mes_inicial = 1
 *			a�o_inicial += 1
 *		Sino, 
 *			si es el �ltimo d�a del mes
 *				dia_inicial = 1
 *				mes_inicial += 1
 *			Sino
 *				dia_inicial += 1	
 * Si aIni>aFin
 * 		fecha erronea
 * Sino
 * 		Si mIni>mFin
 * 			fecha erronea
 * 		Sino 
 * 			Si dIni>dFin
 * 				fecha erronea	
 * 
 * MEJORA A�O:
 * Si a�oFin>=a�o+1
 * 		contador=a�oFin-a�o-1
 * 		contador=a�osIntermedios*365
 * 		contador+=a�osIntermedios%4
 * 		contador+=(a�o+1)%4==0?1:0;
 * 		a�o=a�oFin-1;
 * 
 * 
 * MEJORA MES:
 * Si a�o<aFin
 * 		contador+= dFin-dia;
 * 		dia=0;
 * 		mes++;
 * 		Si mes==13
 * 			mes=1;
 *else if(nes<mesFin)
 *		contador+=diaFinal;
 *		mes++;
 *else
 *		contador+=diaF-dia;
 */

/**APRENDER: 
Nombrar variables
Expresion para q entre en condicional: == comparaciones
Asignacion el contenido de una variable a otra: variableFinal=variableInicial
*/
package correcci�nExamen;

import java.util.Scanner;

public class Ej4 {
	public static void main(String[]args) {
		boolean valido;
		String direccion;
		String direccionLocal = null;
		String direccionDominio = null;
		Scanner teclado= new Scanner(System.in);
		do {

			//LEER DIRECCI�N
			System.out.println("introduce una direcci�n de correo");
			direccion=teclado.nextLine();

			//AS� NO SE COMPRUEBA TAMBI�N QUE EST� EN MIN�SCULAS:
			direccion.toUpperCase(); 

			//VALIDACI�N:
			valido=true;
			if (direccion.length()>254 || direccion.length()==0) {
				System.out.println("La direcci�n no es v�lida");
				valido=false;
			}
			direccion=direccion.toUpperCase();

			//LOCALIZACI�N DE @ Y SEPARACI�N DE PARTE LOCAL Y DOMINIO:
			int contador;
			if(valido) {
				contador=direccion.indexOf('@');
				direccionLocal=direccion.substring(0,contador);
				direccionDominio=direccion.substring(contador+1,direccion.length());
			}

			//VALIDACI�N LONGITUD PARTE LOCAL:
			if(direccionLocal.length()>64 || direccionLocal.length() ==0) {
				System.out.println("La direcci�n no es v�lida");
				valido=false;
			}

			//EVALUACI�N EN PARTE LOCAL DE CADA CAR�CTER ES CORRECTO:
			for (int i=0;valido && i<direccionDominio.length();i++) {
				char letra =direccionDominio.charAt(i);
				valido= letra >= 'A' && letra<='Z' ||
						letra>='0' && letra<='9'||
						letra=='.'|| letra=='-';

						//SI EMPIEZA O TERMINA EN '.' EST� MAL:
						if(letra=='.' &&(i==0 || i==direccionDominio.length()-1)) {
							valido=false;
						}

						// SI HAY DOS PUNTOS JUNTOS Y NO ES EL FINAL DE LA PARTE LOCAL:
						if(letra=='.' && i<direccionDominio.length()-1) { 
							valido=direccionDominio.charAt(i+1) !='.';
						}
			}

			//EVALUACI�N EN PARTE DOMINIO DE CADA CAR�CTER ES CORRECTO:
			for (int i=0;valido && i<direccionLocal.length();i++) {
				char letra =direccionLocal.charAt(i);
				valido= letra >= 'A' && letra<='Z' ||
						letra>='0' && letra<='9'||
						letra=='.'|| letra=='-' || letra=='_';

						//SI EMPIEZA O TERMINA EN '.' EST� MAL:
						if(letra=='.' && (i==0 || i==direccionLocal.length()-1)) {
							valido=false;
						}

						// SI HAY DOS PUNTOS JUNTOS Y NO ES EL FINAL DE LA PARTE DOMINIO:
						if(letra=='.' && i<direccionLocal.length()-1) {
							valido=direccionLocal.charAt(i+1) !='.'; 
						}
			}
			int longitudEtiqueta=0;

			//i RECORRE TODA LA LONGITUD DE LA PARTE DEL DOMINIO
			// LongitudEtiqueta ALMACENA LA LONGITUD DE CADA ETIQUETA

			for (int i=0;valido && i<direccionDominio.length();i++) { 
				if(direccionDominio.charAt(i)!='.') {
					longitudEtiqueta++;
				}
				else {
					valido=longitudEtiqueta<64;
					longitudEtiqueta=0;
				}
			}
			if(valido) {
				valido=longitudEtiqueta<64;
			}
			if(!valido) {
				System.out.println("No lo has intorducido bien");
			}
		}while(!valido);
	}	
}


