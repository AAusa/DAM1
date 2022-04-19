package ej6;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraccion f = new Fraccion(2,1);
		Fraccion f2 = new Fraccion(6,2);
		Fraccion f3 = new Fraccion(5,2);
		
		f.simplificar(f2);
		System.out.println("Simplificar: "+f.num+" / "+f.den);
		
		Fraccion suma = f.sumar(f2);
		System.out.println("Suma: "+suma.num+" / "+suma.den);
		
		Fraccion resta = f2.restar(f);
		System.out.println("Resta: "+resta.num+" / "+resta.den);
		
		Fraccion multi = f2.multiplicar(f);
		System.out.println("Multiplicar: "+multi.num+" / "+multi.den);
		
		Fraccion div = f2.dividir(f);
		System.out.println("Dividir: "+div.num+" / "+div.den);
		
		Fraccion inv = f3.invertir();
		System.out.println("Invertir: "+inv.num+" / "+inv.den);
	}

}
