package proyecto_bytebank;

public class PruebaMetodos {
	public static void main(String[] args) {
		
		Cuenta micuenta = new Cuenta(); // instancia de la clase cuenta
		micuenta.saldo = 300;   // Saldo es atributo de cuenta
		micuenta.depositar(200);	
		System.out.println(micuenta.saldo);
		
		micuenta.retirar(100);
		System.out.println(micuenta.saldo);
		
		Cuenta cuentaDeJimena = new Cuenta();
		cuentaDeJimena.depositar(1000);
		
		boolean puedeTransferir =cuentaDeJimena.transferir(400, micuenta);
		if (puedeTransferir) {
			System.out.println("Transferencia Exitosa");
		}else {
			System.out.println("No puede transferir");
		}
		
		
		
		System.out.println(cuentaDeJimena.saldo);
		System.out.println(micuenta.saldo);
	}

}
