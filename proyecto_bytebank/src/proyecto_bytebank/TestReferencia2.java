package proyecto_bytebank;

public class TestReferencia2 {
	
	public static void main(String[] args) {
		
		Cliente diego = new Cliente();
		diego.nombre = "Diego";
		diego.documento = "1123306890";
		diego.telefono = " 3102646741";
		
		Cuenta cuentaDeDiego = new Cuenta();
		cuentaDeDiego.agencia = 1;
		cuentaDeDiego.titular = diego;  //Se referencia titular del objeto cliente CTR + Space
		
		System.out.println(cuentaDeDiego.titular.documento); 
		System.out.println(cuentaDeDiego.titular);
		System.out.println(diego);
		
		
	}

}
