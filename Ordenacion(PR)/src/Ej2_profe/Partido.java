package Ej2_profe;

public class Partido implements Comparable {
	//El nombre no debe cambiar
	final private String nombre;
	private int votos;
	
	public String getNombre() {
		return nombre;
	}

	public int getVotos() {
		return votos;
	}

	public void addVotos(int votos) {
		if(votos > 0) {
			this.votos += votos;
		}
	}
	
	public Partido (String nombre) {
		this.nombre =  nombre;
		votos = 0;
	}
	
	public Partido (String nombre, int votos) {
		this.nombre =  nombre;
		this.votos = votos;
	}

	@Override
	public int compareTo(Object o) {
		/*
		 * if(this.votos < ((Partido)o).votos)
		   return -1;
		else if (this.votos == ((Partido)o).votos)
			return 0;
		else 
			return 1;
			*/
		// con - para que ordene de mayor a menor
		return -(votos - ((Partido)o).votos);
	}
}