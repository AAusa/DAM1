package Ej4;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.- Insertar usuario, clave\n"
						 + "2.- Borrar usuarios\n"
						 + "3.- Modificar claves de un usuarios\n"
						 + "4.- Validar si la clave de un usuario es correcta");
		Sistema system = new Sistema();
		system.insertar("AFVfkjf343", "Alvaro");
		System.out.println(system.comprobar("AFVfkjf343"));
		system.modificar("AFVfkjf343", "nueva");
		system.borrar("nueva");
	}

}
