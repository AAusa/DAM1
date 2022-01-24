package Repaso1Ev;

import java.util.Scanner;
public class Ej19 {
	public static void main(String[] args) {
		/**
		 * EXPLICACIÓN: 
		 * primeraNota, CuantasNotas, notaCorrecta, nota
	
			Mientras notaCorrecta == false
				CuantasNotas hasta 28
				Si CuantasNotas > 4 && CuantasNotas % 4 == 0
					notaCorrecta = true
			Fin mientras
			
					
			contador (i=1, i<=CuantasNotas;i++)
			Si i == 1
				primeraNota = NumNota	
			Si i =! CuantasNotas
				NumNota aleatorio hasta el 7
			Si i == CuantasNotas
				NumNota = primeraNota
			Sino
				
				Si NumNota == 1
					nota do
					imprime nota
				Si i == 4
					Imprime |
				Si i == CuantasNotas
					Imprime ||
		 */
		int numNota=0, primeraNota=0, cuantasNotas=0;
		boolean notaCorrecta=false;
		String nota="";
		//EL NUMERO DE NOTAS SEA CORRECTO
		while(notaCorrecta == false) {
			cuantasNotas=(int)(Math.random()*28+1);
			if(cuantasNotas > 4 && cuantasNotas % 4 == 0) {
				notaCorrecta = true;
			}
		}
		for(int i=1; i<=cuantasNotas; i++) {
			if(i != cuantasNotas) {
				numNota=(int)(Math.random()*7+1);
				if(i == 1) {
					primeraNota = numNota;
				}
			}
			else {
				numNota = primeraNota;
			}
			switch(numNota){
				case 1:
					nota = "do ";break;
				case 2:
					 nota = "re ";break;
				case 3:
					 nota = "mi ";break;
				case 4:
					 nota = "fa ";break;
				case 5:
					 nota = "sol ";break;
				case 6:
					 nota = "la ";break;
				case 7:
					 nota = "si ";break;	 
			}
			System.out.print(nota);
			if(i % 4 == 0 && i != cuantasNotas) {
				System.out.print(" | ");
			}
			if(i == cuantasNotas) {
				System.out.print(" ||");
			}
		}
	}
}
