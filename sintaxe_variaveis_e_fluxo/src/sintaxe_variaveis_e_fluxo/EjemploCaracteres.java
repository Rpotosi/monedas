package sintaxe_variaveis_e_fluxo;

public class EjemploCaracteres {
	public static void main(String[] args) {
		char caracter = 'a'; // Un char se declara con comillas simples ' y solo puede usar un carácter.
		System.out.println(caracter);
		caracter = 65 + 1;
		System.out.println(caracter);
		
		char segundoCaracter = (char) (caracter +1 );
		System.out.println(segundoCaracter);
		
		String palabra = "alura cursos"; //un String se declara con comillas dobles  y puede tener cero o más caracteres.
		System.out.println(palabra);
		
		palabra = palabra + "2020";
		System.out.println(palabra);
	}

}
