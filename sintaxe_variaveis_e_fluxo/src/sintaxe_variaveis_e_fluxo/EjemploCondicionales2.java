package sintaxe_variaveis_e_fluxo;

public class EjemploCondicionales2 {
	public static void main(String[] args) { // main Control + spacio

		System.out.println("Hello word"); // sysout Control + spacio

		int edad = 21;
		int cantidadPersonas = 2;

		boolean esPareja = cantidadPersonas > 1; //// Forma 1 forma declarar la condición true

		// boolean esPareja = true; // Forma 2 declarar la condición true

		// if (edad >= 18 || cantidadPersonas >=2) { // || significa "o"
		
		if (edad >= 18 && esPareja) {  // && Significa "Y" //Observa que tenemos dos expresiones booleanas, a la izquierda y a la derecha del operador lógico &&
			System.out.println("usted puede entrar");

		} else {

			System.out.println("usted no puede entrar");

		}
	}

}
