package herencia.Ej1;

public class Principal {
	public static void main(String[] args) {
		Empleado empleado = new Empleado();
		Cliente cliente = new Cliente();
		empleado.pedirTodosDatos();
		cliente.pedirTodosDatos();
		empleado.visualizarTodosDatos();
		cliente.visualizarTodosDatos();
	}
}
