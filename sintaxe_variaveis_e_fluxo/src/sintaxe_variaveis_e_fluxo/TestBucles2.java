package sintaxe_variaveis_e_fluxo;

public class TestBucles2 {
	/*public static void main(String[] args) {

		for (int fila = 0; fila < 10; fila++) {

			for (int columna = 0; columna < 10; columna++) {
				if (columna > fila) {
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
	*/
	
    public static void main(String[] args) {
        for (int fila = 0; fila < 10; fila++) {
            for(int columna = 0; columna <= fila; columna++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

	
	
}
