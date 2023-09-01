package ejercicio02;

public class Calculadora {
	
	private int numeroA;
	private int numeroB;
	
	public Calculadora() {
		// TODO Auto-generated constructor stub
	}
	
	//getters y setters
	public int getNumeroA() {
		return numeroA;
	}

	public void setNumeroA(int numeroA) {
		this.numeroA = numeroA;
	}

	public int getNumeroB() {
		return numeroB;
	}

	public void setNumeroB(int numeroB) {
		this.numeroB = numeroB;
	}
	
	public int sumar() {
		int resultado = 0;
		resultado = numeroA + numeroB;
		return resultado;	
	}
	
	//comentario de la división
	public String dividir() {
		double divisor = numeroB;
		double resultado = 0;
		//Double resultadoNuevo;
		
		if (numeroB != 0) {
            resultado = numeroA / divisor;
            return resultado+"";
            //return resultadoNuevo.toString();
        } else {
        	return "No se puede dividir por cero";            
        }
	}
}
