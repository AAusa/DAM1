package herencia2.Ej2new;

public class Maquinista extends Empleado {
	int nA�os;
	int nMaquina;
	public Maquinista(int nA�os, int nMaquina) {
		super();
		this.nA�os = nA�os;
		this.nMaquina = nMaquina;
	}
	void visualizarTodosDatos() {
		visualizarTodosLosDatos();
		System.out.print("nA�os: "+nA�os+" ");
		System.out.print("nMaquina: "+nMaquina+" ");
	}
}
