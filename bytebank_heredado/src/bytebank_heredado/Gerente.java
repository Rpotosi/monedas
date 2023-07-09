package bytebank_heredado;

                   //Extiende de ->
public class Gerente extends Funcionario implements Autenticable{  // esto es herencia //herada las caracteristicas de funcionario
	
	public double getBonificacion() {
		System.out.println("Ejecutando desde Gerente ");
		return 2000;  //Super permite llamar al metodo
	}

	@Override
	public void setClave(String clave) {
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return false;		
	}

}
