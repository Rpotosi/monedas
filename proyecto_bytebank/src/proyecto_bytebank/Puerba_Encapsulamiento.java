package proyecto_bytebank;

public class Puerba_Encapsulamiento {
	
	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta();
		Cliente cliente = new Cliente();
		cliente.setNombre ("Diego");
		cliente.setDocumento("fdfdfdfd");
		
		cuenta.setTitular(cliente);
		System.out.println(cliente.getNombre());
		System.out.println(cuenta.getTitular().getNombre());
	}

}
