package sintaxe_variaveis_e_fluxo;

public class EjemploCondicionales {
	/*public static void main(String[] args) { // main Control + spacio

		System.out.println("Hello word"); // sysout Control + spacio

		int edad = 17;
		int cantidad = 2;

		if (edad >= 18) {
			System.out.println("usted puede entrar");

		} else {
			if (cantidad >= 2) {
				System.out.println("usted es menor de"
						+ " edad pero puede entrar");
			} else
				System.out.println("usted no puede entrar");

		}
	}
	 */

	public static void main(String[] args) {
		
		int edad = 10;
		int cantidad = 3;
		
		boolean cantidadPersonas = cantidad >1;
		
		if(cantidadPersonas) {
						
			System.out.println("Usted puede ingresar");
		}else {
			System.out.println("Usted no puede ingresar");
		}

		
	}

}
