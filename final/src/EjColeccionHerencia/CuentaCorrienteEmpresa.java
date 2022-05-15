package EjColeccionHerencia;


/**
 * Clase que representa una cuenta corriente de empresa, hereda de cuenta bancaria
 */
public class CuentaCorrienteEmpresa extends CuentaCorriente {
    
    private double maximoDescubierto;
    private double tipoInteresDescubierto;
    private double comisi�nFijaDescubierto;

    public CuentaCorrienteEmpresa(double maximoDescubierto, double tipoInteresDescubierto, double comisi�nFijaDescubierto, String listaEntidades, Persona titular, double saldo, String IBAN) {
        super(listaEntidades, titular, saldo, IBAN);
        this.maximoDescubierto = maximoDescubierto;
        this.tipoInteresDescubierto = tipoInteresDescubierto;
        this.comisi�nFijaDescubierto = comisi�nFijaDescubierto;
    }

    public double getMaximoDescubierto() {
        return maximoDescubierto;
    }

    public void setMaximoDescubierto(double maximoDescubierto) {
        this.maximoDescubierto = maximoDescubierto;
    }

    public double getTipoInteresDescubierto() {
        return tipoInteresDescubierto;
    }

    public void setTipoInteresDescubierto(double tipoInteresDescubierto) {
        this.tipoInteresDescubierto = tipoInteresDescubierto;
    }

    public double getComisi�nFijaDescubierto() {
        return comisi�nFijaDescubierto;
    }

    public void setComisi�nFijaDescubierto(double comisi�nFijaDescubierto) {
        this.comisi�nFijaDescubierto = comisi�nFijaDescubierto;
    }
    
    @Override
    public String devolverInfoString(){
        return super.devolverInfoString() + ", maximoDescubierto=" + maximoDescubierto + ", tipoInteresDescubierto=" + tipoInteresDescubierto + ", comisionFijaDescubierto=" + comisi�nFijaDescubierto;
    }

    
}
