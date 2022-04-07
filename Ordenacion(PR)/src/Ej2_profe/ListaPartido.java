package Ej2_profe;

import java.util.Arrays;

public class ListaPartido {
	private final int MAXSIZE = 100;
	Partido[] l;
	int limite=0;

	public ListaPartido() {
		l = new Partido[MAXSIZE];
	}
	public ListaPartido(int size) {
		l = new Partido[size];
	}

/*
	public void annadirVotos(String partido, int votos) {
		for(int i = 0; i<limite;i++)
			if(l[i].getNombre(i).equals(partido)) {
				l[i].addVotos(votos);
				return ;
			}
		l[limite++]= new Partido(partido,votos);
	}
	
	public void annadirVotos(Partido p) {
		for(int i = 0; i<limite;i++)
			if(l[i].getNombre().equals(p.getNombre())) {
				l[i].addVotos(p.getVotos());
				return ;
			}
		l[limite++]= p;
	}*/
	
	public void insertar(Partido p) {
		l[limite++] = p;
	}
	
	public void buscar(String nobre) {
		for(int i = 0; i<limite;i++)
			if(l[i].getNombre().equals(p.getNombre())) {
				l[i].addVotos(p.getVotos());
				return ;
			}
		
	}
	
	public  void insertarVotos(String partido, int votos) {
		l[limite++] = new Partido(partido,votos);
	}
	
	public int  getVotos (int posicion) {
		return l[posicion].getVotos(posicion);
	}
	public String  getNombre (int posicion) {
		return l[posicion].getNombre(posicion);
	}
	public void ordenar() {
		Arrays.sort(l);
	}
	
	public Partido getPartido (int i) {
		return l[i];
	}
	
	public int getCantidad() {
		return limite;
	}
}