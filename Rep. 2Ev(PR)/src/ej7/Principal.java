package ej7;

public class Principal {
	public static void main(String[] args) {
		Ameba miAmeba = new Ameba();
		Ameba otraAmeba = new Ameba(2);
		Ameba otraAmeba2 = new Ameba(2);
		System.out.println("Peso (micro): "+miAmeba.comer(6)); //suma 5
		System.out.println("Peso (ameba menor): "+miAmeba.comer(otraAmeba)); // suma 1
		System.out.println("Peso (ameba mayor): "+otraAmeba2.comer(miAmeba)); // no come
	}
}
