/**
 * 
 */
package ClasesObjetos2.Ej6;

/**
 *@author �lvaro
  @params horaActual, incremento, decremento
	@m�todos 
		public: incrementoHora, decrementoHora

	incremento (String hora, String incremento)
		Si (hora.length() == 8 && hora.substring(0,1) >= 1 && (hora.substring(0,1) <= 24 && hora.substring(3,4) >= 0 && hora.substring(3,4) <= 60 && hora.substring(6,7) >= 0 && hora.substring(6,7) <= 60
		    incremento.length() == 8 && incremento.substring(0,1) >= 1 && (incremento.substring(0,1) <= 24 && incremento.substring(3,4) >= 0 && incremento.substring(3,4) <= 60 && incremento.substring(6,7) >= 0 && incremento.substring(6,7) <= 60)
			int horaIni = hora.substring(0,1)
			...
			Si ((horaIni + hIncremento) < 25)
				resultadoH = horaIni + hIncremento
			Sino 
				Si horaIni > hIncremento
					resultadoH = horaIni - hIncremento
				Sino
					resultadoH = hIncremento - horaIni
			... (60)		
		Sino 
			mensaje = malo
 *
 */
public class Hora {
	private int hh;
	private int mm;
	private int ss;
	private int hhCambio;
	private int mmCambio;
	private int ssCambio;

	public int getHh() {
		return hh;
	}

	public void setHh(int hh) {
		this.hh = hh;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getSs() {
		return ss;
	}

	public void setSs(int ss) {
		this.ss = ss;
	}

	public int getHhCambio() {
		return hhCambio;
	}

	public void setHhCambio(int hhCambio) {
		this.hhCambio = hhCambio;
	}

	public int getMmCambio() {
		return mmCambio;
	}

	public void setMmCambio(int mmCambio) {
		this.mmCambio = mmCambio;
	}

	public int getSsCambio() {
		return ssCambio;
	}

	public void setSsCambio(int ssCambio) {
		this.ssCambio = ssCambio;
	}
	
	private boolean formatoCorrecto (int hh, int mm, int ss) {
		boolean formatoValido = false;
		if(hh > 0 && hh < 25 && mm >= 0 && mm <= 60 && ss >= 0 && ss <= 60) {
			formatoValido = true;
		}
		else {
			formatoValido = false;
		}
		return formatoValido;
	}
	
	private boolean formatoCorrectoCambio (int hhCambio, int mmCambio, int ssCambio) {
		boolean formatoValido = false;
		if(hhCambio > 0 && hhCambio < 25 && mmCambio >= 0 && mmCambio <= 60 && ssCambio >= 0 && ssCambio <= 60) {
			formatoValido = true;
		}
		else {
			formatoValido = false;
		}
		return formatoValido;
	}
	
	public String incremento(int hh, int mm, int ss, int hhCambio, int mmCambio, int ssCambio) {
		String mensaje="";
		int resultadoH=0;
		int resultadoM=0;
		int resultadoS=0;
		
		
		if(formatoCorrecto(hh, mm, ss) == true && formatoCorrectoCambio(hhCambio, mmCambio, ssCambio) == true) {
			// INCREMENTO HORA:
			if ((hh + hhCambio) < 25) {
				resultadoH = hh + hhCambio;
			}
			else {
				if(hh > hhCambio)  {
					resultadoH = (hh + hhCambio) - 24;
				}
				else {
					resultadoH = (hhCambio + hh) - 24;
				}
			}
			
			// INCREMENTO MIN:
			if ((mm + mmCambio) < 61) {
				resultadoM = mm + mmCambio;
			}
			else {
				if(mm > mmCambio)  {
					resultadoM = (mm + mmCambio) - 60;
					
				}
				else {
					resultadoM = (mmCambio + mm) - 60;
					resultadoH += 1;
				}
			// INCREMENTO SEG:
			}
			if ((ss + ssCambio) < 61) {
				resultadoS = ss + ssCambio;
			}
			else {
				if(ss > ssCambio)  {
					resultadoS = (ss + ssCambio) - 60;
					resultadoM += 1;
				}
				else {
					resultadoS = (ssCambio + ss) - 60;
					resultadoM += 1;
				}
			}
			if(resultadoH < 10 && resultadoM < 10 && resultadoS < 10) {
				mensaje = "Resultado: = 0"+resultadoH+":0"+resultadoM+":0"+resultadoS;
			}
			else {
				if(resultadoH < 10 && resultadoM < 10) {
					mensaje = "Resultado: = 0"+resultadoH+":0"+resultadoM+":"+resultadoS;
				}
				else {
					if(resultadoH < 10 && resultadoS < 10) {
						mensaje = "Resultado: = 0"+resultadoH+":"+resultadoM+":0"+resultadoS;
					}
					else {
						if(resultadoH < 10) {
							mensaje = "Resultado: = 0"+resultadoH+":"+resultadoM+":"+resultadoS;
						}
						else {
							if(resultadoM < 10) {
								mensaje = "Resultado: = "+resultadoH+":0"+resultadoM+":"+resultadoS;
							}
							else {
								if(resultadoS < 10) {
									mensaje = "Resultado: = "+resultadoH+":"+resultadoM+":0"+resultadoS;
								}
								else {
									mensaje = "Resultado: = "+resultadoH+":"+resultadoM+":"+resultadoS;
								}
							}
						}
					}
				}
			}
		}
		else {
			mensaje = hh+":"+mm+":"+ss+" y/o "+hhCambio+":"+mmCambio+":"+ssCambio+" tienen un formato incorrecto";
		}
		return mensaje;
	}
	
	public String decremento(int hh, int mm, int ss, int hhCambio, int mmCambio, int ssCambio) {
		String mensaje="";
		int resultadoH=0;
		int resultadoM=0;
		int resultadoS=0;
		
		
		if(formatoCorrecto(hh, mm, ss) == true && formatoCorrectoCambio(hhCambio, mmCambio, ssCambio) == true) {
			// INCREMENTO HORA:
			if ((hh - hhCambio) > 0) {
				resultadoH = hh - hhCambio;
			}
			else {
				if(hh > hhCambio)  {
					resultadoH = 24 - (hh - hhCambio);
				}
				else {
					resultadoH = 24 - (hhCambio - hh);
				}
			}
			
			// INCREMENTO MIN:
			if ((mm - mmCambio) > 0) {
				resultadoM = mm - mmCambio;
			}
			else {
				if(mm > mmCambio)  {
					resultadoM = 60 - (mm - mmCambio);
					
				}
				else {
					resultadoM = 60 - (mmCambio - mm);
				}
			// INCREMENTO SEG:
			}
			if ((ss - ssCambio) > 0) {
				resultadoS = ss + ssCambio;
			}
			else {
				if(ss > ssCambio)  {
					resultadoS = 60 - (ss - ssCambio);
				}
				else {
					resultadoS = 60 - (ssCambio - ss);
				}
			}
			if(resultadoH < 10 && resultadoM < 10 && resultadoS < 10) {
				mensaje = "Resultado: = 0"+resultadoH+":0"+resultadoM+":0"+resultadoS;
			}
			else {
				if(resultadoH < 10 && resultadoM < 10) {
					mensaje = "Resultado: = 0"+resultadoH+":0"+resultadoM+":"+resultadoS;
				}
				else {
					if(resultadoH < 10 && resultadoS < 10) {
						mensaje = "Resultado: = 0"+resultadoH+":"+resultadoM+":0"+resultadoS;
					}
					else {
						if(resultadoH < 10) {
							mensaje = "Resultado: = 0"+resultadoH+":"+resultadoM+":"+resultadoS;
						}
						else {
							if(resultadoM < 10) {
								mensaje = "Resultado: = "+resultadoH+":0"+resultadoM+":"+resultadoS;
							}
							else {
								mensaje = "Resultado: = "+resultadoH+":"+resultadoM+":0"+resultadoS;
							}
						}
					}
				}
			}
		}
		else {
			mensaje = hh+":"+mm+":"+ss+" y/o "+hhCambio+":"+mmCambio+":"+ssCambio+" tienen un formato incorrecto";
		}
		return mensaje;
	}

	public Hora() {
		this.hh = 0;
		this.mm = 0;
		this.ss = 0;
		this.hhCambio = 0;
		this.mmCambio = 0;
		this.ssCambio = 0;

	}
}
