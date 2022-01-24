package Repaso1Ev;

import java.util.Scanner;
/**
 * 
 * @author Álvaro
 * @params precio, nPersonas, dSemana, precioTotal, tarjeta
 * Calcular precio de las entradas del cine
	precio=8;
	precioTotal = nPersonas * precio;
	
	Validacion(dSemana>0 && dSemana>8)
		   tarjeta>-1 && tarjeta>2
	Si dSemana == 3
		precio = 5
		precioTotal = nPersonas * precio;
	Si dSemana == 4
		Si nPersonas % 2 == 0
			precio = 5.5
			precioTotal = nPersonas * precio;
		Sino 
			precio = 5.5
			precioTotal = (nPersonas-1) * precio + 8;
	Si tarjeta == 1
		precioTotal = precioTotal - (precioTotal * 0,10)
 */

public class Ej11 {
	public static double entradasCine(int nPersonas, int dSemana, int tarjeta) {
		double precioTotal=0;
		double precio=0;
		if(dSemana>0 && dSemana<8 && tarjeta>-1 && tarjeta<2){
			if(dSemana == 3) {
				precio = 5;
				precioTotal = nPersonas * precio;
			}
			else {
				if (dSemana == 4 && nPersonas > 1) {
					if(nPersonas % 2 == 0) {
						precio = 5.5;
						precioTotal = nPersonas * precio;
					}
					else {
						precio = 5.5;
						precioTotal = (nPersonas-1) * precio + 8;
					}
				}
				else {
					precio = 8;
					precioTotal = nPersonas * precio;
				}
			}
			if(tarjeta == 1) {
				precioTotal = precioTotal - (precioTotal * 0.10);
			}
		}
		return precioTotal;
	}
	public static void main(String[] args) {
		int nPersonas=0;
		double precioTotal=0;
		int dSemana=0;
		int tarjeta=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce nPersonas:");
		nPersonas=teclado.nextInt();
		System.out.println("Introduce dSemana (L:1, M:2 ... D:7):");
		dSemana=teclado.nextInt();
		System.out.println("Introduce tarjeta (No:0, Si:1):");
		tarjeta=teclado.nextInt();
		precioTotal=entradasCine(nPersonas,dSemana,tarjeta);
		System.out.println("El precio total son: "+precioTotal+" €");

	}

}
