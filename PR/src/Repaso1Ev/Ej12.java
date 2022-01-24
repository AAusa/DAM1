package Repaso1Ev;

import java.util.Scanner;
/**
 * 
 * @author Álvaro
 * @params usuario1, usuario2, resultado
 * Hacer juego de piedra, papel, tijera
	precio=8;
	precioTotal = nPersonas * precio;
	
	piedra:1
	papel:2
	tijera:3
	
	piedra (1) gana tijera (3)
	papel (2) gana piedra (1)
	tijera (3) gana papel (2)

	pide usuario1
	pide usuario2
	
	Validacion: usuario1>0 && usuario1<4
		    usuario2>0 && usuario2<4
	
	Si usuario1 == usuario2
		empate
	Sino
		Si (usuario1 == 1 && usuario2 == 3) || (usuario1 == 2 && usuario2 == 1) || (usuario1 == 3 && usuario2 == 2)
			usuario1 gana
		Sino
			usuario2 gana

 */

public class Ej12 {
	public static String juego(int usuario1, int usuario2) {
		String resultado="";
		if(usuario1>0 && usuario1<4 && usuario2>0 && usuario2<4){
			if(usuario1 == usuario2) {
				resultado="empate";
			}
			else {
				if ((usuario1 == 1 && usuario2 == 3) || (usuario1 == 2 && usuario2 == 1) || (usuario1 == 3 && usuario2 == 2)) {
					resultado="Usuario1 gana";
				}
				else {
					resultado="Usuario2 gana";
				}
			}
		}
		return resultado;
	}
	public static void main(String[] args) {
		String resultado="";
		int usuario1=0;
		int usuario2=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Usuario1 introduce: piedra:1 o papel:2 o tijera:3");
		usuario1=teclado.nextInt();
		System.out.println("Usuario2 introduce: piedra:1 o papel:2 o tijera:3");
		usuario2=teclado.nextInt();
		resultado=juego(usuario1,usuario2);
		System.out.println("El resultado es: "+resultado);

	}

}
