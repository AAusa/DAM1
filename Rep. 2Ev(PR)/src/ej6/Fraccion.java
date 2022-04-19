package ej6;

public class Fraccion {
	int num = 0;
	int den = 0;
	
	public Fraccion(int num, int den) {
		this.num = num;
		this.den = den;
	}
	
	public Fraccion invertir () {
		Fraccion result = new Fraccion(den, num);
		return result;
	}
	
	public Fraccion sumar (Fraccion b) {
		int denNew = den * b.den;
		int numNew = (denNew / den * num) + (denNew / b.den * b.num);
		Fraccion result = new Fraccion(numNew, denNew);
		simplificar(result);
		return result;
	}
	
	public Fraccion restar (Fraccion b) {
		int denNew = den * b.den;
		int numNew = (denNew / den * num) - (denNew / b.den * b.num);
		Fraccion result = new Fraccion(numNew, denNew);
		simplificar(result);
		return result;
	}
	
	public Fraccion multiplicar (Fraccion b) {
		int denNew = den * b.den;
		int numNew = num * b.num;
		Fraccion result = new Fraccion(numNew, denNew);
		simplificar(result);
		return result;
	}
	
	public Fraccion dividir (Fraccion b) {
		int denNew = den * b.num;
		int numNew = num * b.den;
		Fraccion result = new Fraccion(numNew, denNew);
		simplificar(result);
		return result;
	}
	
	public Fraccion simplificar(Fraccion a) {
		int divisor = 0;
		boolean encontrado = false;
		for(int i = 2; i <= a.den && !encontrado; i++) {
			if (a.den % i == 0) {
				divisor = i;
				for(int j = 2; j <= a.num; j++) {
					if (a.num % j == 0) {
						if(divisor == j) {
							a.den /= divisor;
							a.num /= divisor;
							encontrado = true;
						}
					}
				}
			}
		}
		
		return a;
	}
}
