package entornos;

public class Calculadora {
	private int num1, num2;

	public Calculadora(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int suma() {
		int resul = num1 + num2;
		return resul;
	}
	
	public int resta() {
		int resul = num1 - num2;
		return resul;
	}
	
	public int multiplicacion() {
		int resul = num1 * num2;
		return resul;
	}
	
	public int division() {
		int resul = num1 / num2;
		return resul;
	}
	
}
