package sintaxe_variaveis_e_fluxo;

public class TestCondicional2 {

    public static void main(String[] args) {
        System.out.println("probando condicionales");  // Imprime "probando condicionales"

        int edad = 16;  // Declara una variable entera llamada edad y le asigna el valor 16
        int cantidadPersonas = 3;  // Declara una variable entera llamada cantidadPersonas y le asigna el valor 3
        boolean acompañado = cantidadPersonas >= 2;  // Declara una variable booleana llamada acompañado y le asigna el resultado de la comparación cantidadPersonas >= 2

        if (edad >= 18 && acompañado) {  // Si la edad es mayor o igual a 18 y acompañado es verdadero
            System.out.println("Bienvenido");  // Imprime "Bienvenido"
        } else {  // En caso contrario
            System.out.println("Lamentablemente no puedes ingresar");  // Imprime "Lamentablemente no puedes ingresar"
        }
    }
}
