package sintaxe_variaveis_e_fluxo;

public class TestCondicional {

	public static void main(String[] args) {

		System.out.println("probando condicionales");

		int edad = 17;
		int cantidadPersonas = 2;

	//	if (edad >= 18 || cantidadPersonas >= 2) { // || significa "o"
		if (edad >= 18 && cantidadPersonas >= 2) { // || significa "o"	
			System.out.println("Usted puede entar");
		} else {
			System.out.println("Lamentablemente no puedes ingresar");
		}
	}
}