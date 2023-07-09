package proyecto_bytebank;

public class TestReferencia3 {
	public static void main(String[] args) {
		
		Cuenta cuentaDeRichard = new Cuenta();
		cuentaDeRichard.titular = new Cliente(); //Referencia el objeto titular 
		cuentaDeRichard.titular.nombre = "Richard Potosi";
		
		System.out.println(cuentaDeRichard.titular);
		System.out.println(cuentaDeRichard.titular.nombre);

	}

}
