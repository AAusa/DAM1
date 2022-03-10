package herencia2.Ej2new;

public class Maquinista extends Empleado {
	int nAños;
	int nMaquina;
	public Maquinista(int nAños, int nMaquina) {
		super();
		this.nAños = nAños;
		this.nMaquina = nMaquina;
	}
	void visualizarTodosDatos() {
		visualizarTodosLosDatos();
		System.out.print("nAños: "+nAños+" ");
		System.out.print("nMaquina: "+nMaquina+" ");
	}
}
