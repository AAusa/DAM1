package Repaso1Ev;
import java.util.Scanner;
/**
 * 
 * @author �lvaro
 * @params lado, area
 * Calcular el �rea del rect�ngulo
 */
public class Ej3 {
	public static int rectangulo(int lado) {
		int area;
		area=lado*lado;		
		return area;
	}
	public static void main(String[] args) {
		int lado=0;
		int area=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce lado:");
		lado=teclado.nextInt();
		area=rectangulo(lado);
		System.out.println("El resultado es: "+area);

	}

}
