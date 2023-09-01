package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroA = 23;
		int numeroB = 10;
		
		Calculadora calculadora = new Calculadora();
		calculadora.setNumeroA(numeroA);
		calculadora.setNumeroB(numeroB);
		System.out.println("El resultado de DIVIDIR es: "+calculadora.dividir());
		
	}

}
