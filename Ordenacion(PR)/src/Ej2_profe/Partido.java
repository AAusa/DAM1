package Ej2_profe;

public class Partido implements Comparable{
	protected char separador = '\t';
	//El nombre no debe cambiar
	final protected String nombre;
	protected int votos;
public Partido(String nombre) {
	this.nombre=nombre;
	this.votos=0;
	}
public Partido(String nombre, int votos) {
	this.nombre=nombre;
	addVotos(votos);
}
public String getNombre(int i) {
	return nombre;
}
public int getVotos(int i) {
	return votos;
}
public void addVotos(int votos) {
	if(votos>0)this.votos+=votos;
}
public void setSeparador(char sep) {
	separador = sep;
}

//En el toString poner separador 
@Override
public int compareTo(Object o) {
	// con - para que ordene de mayor a menor
	return -(this.votos-((Partido)o).votos);
	/*if(this.votos < ((Partido)o).votos)
		return -1;
	else if (this.votos == ((Partido)o).votos)
		return 0;
	else 
		return 1;*/
}
}