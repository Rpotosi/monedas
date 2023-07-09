package sintaxe_variaveis_e_fluxo;

public class EjemploValoresVariables {

		public static void main(String[] args) {
			
			int numero1 = 5;
			int numero2 = 9;
			
			System.out.println(numero2);
			
			numero2= numero1; //5
			System.out.println(numero2);
			
			numero1= 88;
			//numero2 = ??
			System.out.println(numero2);
			
			char letra = 'a';
	        System.out.println(letra);

	        char valor = 65;           // Compila!
	        System.out.println(valor);

	       // valor = varlor + 1; // error  // No compila!
	        valor = (char) (valor + 1);  //Ten en cuenta que envolvemos la suma con paréntesis, por lo que le decimos a Java que queremos convertir el resultado de esa suma en char.        
	        System.out.println(valor);
			
		}
}
