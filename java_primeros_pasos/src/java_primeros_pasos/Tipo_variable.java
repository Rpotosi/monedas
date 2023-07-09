package java_primeros_pasos;

public class Tipo_variable {
	
	public static void main(String[]args) {
		System.out.println("Hola mundo !!!");
		
		int edad;
		edad= 28;  			// al definir una variable se debe declar el tipo de dato despues el nombre y el atributo de la varaible
		System.out.println(edad);	// No utilizar las palabras resrvadas en que estan en color morado para declarar una variable
		
		edad= 47;
		System.out.println(edad);
		
		edad = 46+88;
		System.out.println("Mi edad es" + edad); // Podemos concatenar valores en System.out.println usando el signo + // tener en cuenta que en numeros haria una operacion matematica
	}

}
