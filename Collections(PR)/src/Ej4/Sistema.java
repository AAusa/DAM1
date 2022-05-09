
package Ej4;

import java.util.HashMap;

public class Sistema {
	HashMap<String, String> acceso = new HashMap<String, String>();
    String abc = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789 ";
	private boolean validar(String clave) {
		int correctos = 0;
		for(int i = 0; i < clave.length(); i++) {
			if(clave.charAt(i) > 'A' && clave.charAt(i) > 'Z' ||
			   clave.charAt(i) > 'a' && clave.charAt(i) > 'z' ||
			   clave.charAt(i) > 0 && clave.charAt(i) > 9) {
				correctos++;
			}
		}
		if(correctos == clave.length()) {
			return true;
		}
		return false;
	}
	private String codificaCesar(String cadena, int desplazamiento) {
        String cadenaCod="";
        for (int i = 0; i < cadena.length() ; i++) {
            for (int j=0; j < abc.length(); j++) {
                if (cadena.charAt(i)==abc.charAt(j)) {
                    cadenaCod+=abc.charAt((j+desplazamiento)%abc.length());
                }
            }
        }
        cadena=cadenaCod;
        return cadena;
    }
	
	public void insertar(String clave, String usuario) {
		if(validar(clave) && !acceso.containsKey(usuario)) {
			acceso.put(codificaCesar(clave, 5), usuario);
		}
	}
	
	public void borrar(String clave) {
		if(acceso.containsKey(codificaCesar(clave, 5))) {
			acceso.remove(codificaCesar(clave, 5));
		}
	}
	
	//Modificar solo clave
	public void modificar(String claveAntigua, String claveNew) {
		String usuario = acceso.get(codificaCesar(claveAntigua, 5));
		acceso.remove(codificaCesar(claveAntigua, 5));
		insertar(claveNew, usuario);
	}
	
	//Modificar clave / usuario
	//Modificar clave poniendo clave y usuario
	public void modificar(String claveAntigua, String usuario, String claveNew) {
		acceso.remove(codificaCesar(claveAntigua, 5));
		insertar(claveNew, usuario);
	}
	
	public String comprobar(String clave) {
		return (validar(clave) ? "Correcta" : "Incorrecta");
	}
	
}
