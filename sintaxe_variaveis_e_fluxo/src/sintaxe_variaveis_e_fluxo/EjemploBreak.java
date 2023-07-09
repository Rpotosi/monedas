package sintaxe_variaveis_e_fluxo;

public class EjemploBreak {
	
	public static void main(String args[]) {

		// Bucle externo que controla las filas (0 a 4)
		for (int fila = 0; fila < 5; fila++) {
			
			// Bucle interno que controla las columnas (0 a 4)
			for (int columna = 0; columna < 5; columna++) {
				
				// Comprueba si el valor de la columna es mayor que el valor de la fila
				if (columna > fila) {
					break;  // Rompe el bucle interno si la condición es verdadera
				}
				
				System.out.print(columna + 1);  // Imprime el valor de la columna + 1
				
			}
			
			System.out.println();  // Imprime una nueva línea después de cada iteración del bucle interno
			
		}

	}

}
