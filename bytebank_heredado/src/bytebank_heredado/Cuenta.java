package bytebank_heredado;

//import javax.swing.DefaultRowSorter;

public abstract class Cuenta {
	

	protected double saldo; 
							
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();

	private static int total = 0;
	

	public Cuenta(int agencia, int numero) {
		if (agencia <= 0) {
			System.out.println("No se permite 0");
			this.agencia = 1;

		} else {
			this.agencia = agencia;

		}
		total++;
		System.out.println("Se van creando:" + total + " cuentas");

	}

	
	public abstract void depositar(double valor);
	
	
	
	public void saca(double valor) throws SaldoInsuficienteException{
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("No tienes saldo");
		}
		
		this.saldo -= valor;

	}
	

	public boolean transferir(double valor, Cuenta cuenta) throws SaldoInsuficienteException{
		if (this.saldo >= valor) {
			this.saca(valor);
			cuenta.depositar(valor);
			return true;
		} else {
			return false;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean retirar(double valor) {
		if (this.saldo >= valor) {

			this.saldo += -valor;
			return true;
		} else {
			return false;
		}

	}

	public int getAgencia() {
		return agencia;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return Cuenta.total;
	}

}
