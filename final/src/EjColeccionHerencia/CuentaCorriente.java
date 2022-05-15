package EjColeccionHerencia;


/**
 * Clase que representa una cuenta corriente personal, hereda de cuenta bancaria
 */
public abstract class CuentaCorriente extends CuentaBancaria {
	String listaEntidades;
    public CuentaCorriente(String listaEntidades, Persona titular, double saldo, String IBAN) {
    	super(titular, saldo, IBAN);
    	this.listaEntidades = listaEntidades;
    }
    @Override
    public String devolverInfoString(){
        return super.devolverInfoString()+"listaEntidades=" + listaEntidades;
    }
}
