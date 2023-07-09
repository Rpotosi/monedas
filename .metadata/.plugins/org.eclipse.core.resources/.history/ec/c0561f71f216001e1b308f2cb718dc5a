package bytebank_heredado;

public class Administrador extends Funcionario implements Autenticable {

	private String clave = "AluraCursosOnline";

	public Administrador() {
	}
	
	@Override
	public double getBonificacion() {
		return this.getSalario();
	}

	@Override
	public void setClave(String clave) {
		this.clave = clave;
	}

	@Override
	public boolean iniciarSesion(String clave) {
		if(this.clave == clave) {
			return true;
		} else {
			return false;
		}
	}

}
