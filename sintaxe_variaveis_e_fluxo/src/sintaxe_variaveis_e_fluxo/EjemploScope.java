package sintaxe_variaveis_e_fluxo;

public class EjemploScope {  //scope es el alcance de las variables
	
	public static void main(String[] args) {

		double salario = 4200.0;  // Declara una variable de tipo double llamada salario y le asigna el valor 4200.0
		boolean fuePromovido = salario >= 4200.0;  // Declara una variable de tipo boolean llamada fuePromovido y le asigna el resultado de la comparación salario >= 4200.0

        if (fuePromovido) {  // Si fuePromovido es verdadero
            salario = 4200.0;  // Asigna el valor 4200.0 a la variable salario
            System.out.println("Fue promivido, Su salario es " + salario);  // Imprime un mensaje indicando que fue promovido y muestra el valor de salario
        } else {  // Si fuePromovido es falso
            salario = 3800.0;  // Asigna el valor 3800.0 a la variable salario
            System.out.println("No Fue promivido, Su salario es " + salario);  // Imprime un mensaje indicando que no fue promovido y muestra el valor de salario
        }
    }
}
