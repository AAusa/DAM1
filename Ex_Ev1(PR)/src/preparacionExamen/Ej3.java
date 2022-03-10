package preparacionExamen;

import java.util.Scanner;

public class Ej3 {
	public static void main (String[]args) {
		int d = 1;
		int m = 0;
		int a = 2021;
		int diasMes=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Generador de calendarios");
		System.out.print("Introduce mes (1-12): ");
		m = s.nextInt();
		while (m<1 || m>12 ) {
			System.out.println("El valor mes tiene que estar entre 1-12");
			System.out.print("Introduce mes (1-12): ");
			m = s.nextInt();
		}
		System.out.print("Introduce año: ");
		a = s.nextInt();
		boolean esBisiesto = false;
		//calcula si un año es bisiesto
		if (a%4 == 0) {
			esBisiesto = true;
			if (a%100 == 0) {
				esBisiesto = false;
				if ( a%400 == 0) {
					esBisiesto = true;
				}
			}
		}else {
			esBisiesto=false;
		}

		// calcula cuantos dias hay en un mes
		if (m == 2) {
			diasMes=28;
			if (esBisiesto == true) {
				diasMes=29;
			}
		}else if (m == 4) {
			diasMes=30;
		}else if (m == 6) {
			diasMes=30;
		}else if (m == 9) {
			diasMes=30;
		}else if (m == 11) {
			diasMes=30;
		}else {
			diasMes=31;
		}

		for (int i=0; i <= diasMes && d <= diasMes; i++) {
			//dia de la semana 0 = sabado ... 6 = viernes
			if ( m <= 2) {
				m = m+12;
				a = a-1;
			}
			int semana = ((d+2*m+3*(m+1)/5+a+a/4-a/100+a/400+2)%7);
			//añade espacios correspondientes segun el dia en el que empieza el mes
			if (d==1 && semana == 0) {
				System.out.print("      "+ "      "+ "      "+"      " + "      ");

			}else if (d == 1 && semana == 1) {
				System.out.print("      "+"      "+"      "+"      " + "      " +"      ");
			}else if (d == 1 && semana == 2) {


			}else if (d == 1 && semana == 3) {
				System.out.print("      ");
			}else if (d == 1 && semana == 4) {
				System.out.print("      "+ "      ");

			}else if (d == 1 && semana == 5) {
				System.out.print("      "+"      "+"      ");

			}else if (d == 1 && semana == 6) {
				System.out.print("      "+ "      "+ "      "+"      ");

			}

			//asignar letra a dia
			if (semana == 0) {
				char letraDia = 'S';
				if (d <= 9 && d >=1) {
					System.out.print("0"+d+""+letraDia+"**"+" ");
				}else 
					System.out.print(d+""+letraDia+"**"+" ");


			}else if (semana == 1) {
				char letraDia = 'D';
				if (d <= 9 && d >=1) {
					System.out.print("0"+d+""+letraDia+"**"+" ");
					System.out.println();
				}else {
					System.out.print(d+""+letraDia+"**"+" ");
					System.out.println();
				}

			}else if (semana == 2) {
				char letraDia = 'L';
				if (d <= 9 && d >=1) {
					System.out.print("0"+d+""+letraDia+"**"+" ");
				}else 
					System.out.print(d+""+letraDia+"**"+" ");

			}else if (semana == 3) {
				char letraDia = 'M';
				if (d <= 9 && d >=1) {
					System.out.print("0"+d+""+letraDia+"**"+" ");
				}else 
					System.out.print(d+""+letraDia+"**"+" ");

			}else if (semana == 4) {
				char letraDia = 'X';
				if (d <= 9 && d >=1) {
					System.out.print("0"+d+""+letraDia+"**"+" ");
				}else 
					System.out.print(d+""+letraDia+"**"+" ");

			}else if (semana == 5) {
				char letraDia = 'J';
				if (d <= 9 && d >=1) {
					System.out.print("0"+d+""+letraDia+"**"+" ");
				}else 
					System.out.print(d+""+letraDia+"**"+" ");

			}else if (semana == 6) {
				char letraDia = 'V';
				if (d <= 9 && d >=1) {
					System.out.print("0"+d+""+letraDia+"**"+" ");
				}else 
					System.out.print(d+""+letraDia+"**"+" ");

			}
			++d;

		}
	}
}
