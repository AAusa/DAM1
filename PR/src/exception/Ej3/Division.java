package exception.Ej3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
	int dividendo;
	int divisor;
	void PideNum() {
		System.out.print("Dividendo: ");
		Scanner teclado = new Scanner(System.in);
		dividendo = teclado.nextInt();
		System.out.print("Divisor: ");
		divisor = teclado.nextInt();
	}
	int CalcDiv() {
		int cociente = dividendo / divisor;
		return cociente;
	}
	void ejecucionMetodos() {
		try {
			PideNum();
			System.out.print("El resultado de la división es: "+ CalcDiv());
		} catch(ArithmeticException e) {
			System.out.println("Div x 0");
		} catch(InputMismatchException e) {
			System.out.println("No INT");
		}
	}
	public Division() {
		ejecucionMetodos();
	}
}
