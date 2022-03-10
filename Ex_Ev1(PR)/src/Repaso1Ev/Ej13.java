package Repaso1Ev;

import java.util.Scanner;
/**
 * 
 * @author Álvaro
 * @params usuario1, usuario2, resultado
 * Hacer juego de piedra, papel, tijera
	numero=320
	
	320 160
	for / while / do-while
	
	Hacer
		Mientras numero != (numero - 20)
			contador (i=numero, numero-20, i--)
				imprimir i
		Fin mientras
		numero = numero - 20
	Mientras
		numero != 160

 */

public class Ej13 {
	public static void main(String[] args) {
		int numero=320;
		boolean hanPasado20=false;
		do {
			while (hanPasado20==false) {
				for(int i=numero;i>numero-20;i--) {
					System.out.println(i);
				}
				hanPasado20=true;
			}
			numero = numero - 20;
			hanPasado20=false;
		}
		while(numero != 160);
	}
}

