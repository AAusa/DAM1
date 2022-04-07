package Ej2_profe;

public class Diputado extends Partido {
	private int diputados;
	
	public Diputado (String nombre) {
		super(nombre);
		diputados = 0;
	}
	
	public Diputado (String nombre, int votos, int diputados) {
		super(nombre, votos);
		this.diputados = 1;
	}
	
	public int compareTo(Object o) {
		if (diputados != ((Diputado)o).diputados) {
			return -(diputados - ((Diputado)o).diputados);
		}
		return -(this.votos-((Diputado)o).votos);
	}
		// con - para que ordene de mayor a menor
		
		/*if(this.votos < ((Partido)o).votos)
			return -1;
		else if (this.votos == ((Partido)o).votos)
			return 0;
		else 
			return 1;*/
	
	public String toString () {
		return nombre + separador + diputados + votos;
	}
	public void addVotos(int x) {
		if(x > 0) {
			this.diputados += diputados;
		}
	}
}
