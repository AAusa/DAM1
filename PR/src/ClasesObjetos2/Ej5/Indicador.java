package ClasesObjetos2.Ej5;
/**
 * 
 *  @author Álvaro
 *  @params velActual, incremento, decremento
	@métodos 
		de parámetro: setVelActual, getVelActual
		public: incrementoVel, decrementoVel
		private: incrementoValido, decrementoValido, velCorrecta
	
	
	velValida
		VelActual > 0
	
	incrementoValido
		Si incremento > 0
	
	decrementoValido
		Si decremento > 0 && velActual >= decremento 
	
	incrementoVel
		incrementoValido
		velActual += incremento
	decrementoVel
		decrementoValido
		velActual -= decremento
 *
 */
public class Indicador {
	private int velActual;
	private int incremento;
	private int decremento;
	public int getVelActual() {
		return velActual;
	}
	public void setVelActual(int velActual) {
		this.velActual = velActual;
	}
	public int getIncremento() {
		return incremento;
	}
	public void setIncremento(int incremento) {
		this.incremento = incremento;
	}
	public int getDecremento() {
		return decremento;
	}
	public void setDecremento(int decremento) {
		this.decremento = decremento;
	}
	
	private boolean incrementoValido(int incremento) {
		boolean incrementoCorrecto = false;
		if(incremento > 0 && incremento <= velActual) {
			incrementoCorrecto = true;
		}
		else {
			incrementoCorrecto = false;
		}
		return incrementoCorrecto;
	}
	private boolean decrementoValido(int decremento) {
		boolean decrementoCorrecto = false;
		if(decremento > 0 && decremento <= velActual) {
			decrementoCorrecto = true;
		}
		else {
			decrementoCorrecto = false;
		}
		return decrementoCorrecto;
	}
	private boolean velValida(int velActual) {
		boolean velCorrecta = false;
		if(velActual > 0) {
			velCorrecta = true;
		}
		else {
			velCorrecta = false;
		}
		return velCorrecta;
	}
	
	public String incrementoVel(int velActual, int incremento) {
		String mensaje="";
		if(velValida(velActual) == true && incrementoValido(incremento) == true) {
			velActual += incremento;
			mensaje = "Incrementando "+incremento+" y la velActual es "+velActual;
		}
		else {
			mensaje = "La velActual o el incremento son incorrectos, ambos deben ser mayores que 0";
		}
		return mensaje;
	}

	public String decrementoVel(int velActual, int decremento) {
		String mensaje="";
		if(velValida(velActual) == true && decrementoValido(decremento) == true) {
			velActual -= decremento;
			mensaje = "Decrementando "+decremento+" y la velActual es "+velActual;
		}
		else {
			mensaje = "La velActual o el decremento son incorrectos, ambos deben ser mayores que 0";
		}
		return mensaje;
	}
	
	public Indicador() {
		this.velActual = 0;
		this.incremento = 0;
		this.decremento = 0;
	}
}
