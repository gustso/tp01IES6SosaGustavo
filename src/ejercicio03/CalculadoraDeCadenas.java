package ejercicio03;

public class CalculadoraDeCadenas {
	private String texto;
	
	public CalculadoraDeCadenas() {
		// TODO Auto-generated constructor stub
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public String determinarSiExisteElCaracterEnLaCadena(char caracter) {
		/*
		String resultado = "";
		
		if (texto.indexOf(caracter) != -1) {
			resultado = "el caracter sí está en la cadena";
		} else {
			resultado = "el caracer no está en la cadena";
		}
		
		return resultado;
		*/
		
		boolean encontrado = false;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == caracter) {
                encontrado = true;
                break; // Si encontramos el carácter, salimos del bucle.
            }
        }

        if (encontrado) {
            return "El carácter '" + caracter + "' está en la cadena.";
        } else {
            return "El carácter '" + caracter + "' no está en la cadena.";
        }

		
		
	}
}
