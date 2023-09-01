package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String apellido = "Sosa";
		String nombre = "Gustavo";
		
		//objeto
		Usuario usuario = new Usuario();
		usuario.setApellido(apellido);
		usuario.setNombre(nombre);
		
		//syso
		System.out.println("Apellido"+usuario.getApellido());
		System.out.println("Nombre"+usuario.getNombre());
	}

}
