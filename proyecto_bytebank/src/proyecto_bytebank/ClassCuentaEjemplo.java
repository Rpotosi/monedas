package proyecto_bytebank;

public class ClassCuentaEjemplo {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	
	// Getter

	public double getSaldo(){
	    return this.saldo;
	}

	//Setter
	public void setNumero(int numero){
	    this.numero = numero;
	}
}
