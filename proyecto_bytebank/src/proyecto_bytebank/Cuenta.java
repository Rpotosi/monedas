package proyecto_bytebank;

class Cuenta {

		public double saldo;  // private para que nadie acceda a ellos, pueden acceder a ellos mediante un nuevo metodo ejemplo getSaldo 
		private int agencia;
		private int numero;
		private Cliente titular = new Cliente();
		private static int total = 0;
		
		
		public Cuenta(int agencia) {
			if (agencia <=0) {
				System.out.println("No se permite 0");
				this.agencia = 1;
			
			}else {
				this.agencia = agencia;
			
			}
			total ++;
			System.out.println("Se van creando:" + total + " cuentas" );
		
		}
		
		
		
		//metodo, toda secuencia de pasos para realizar una accion
		// Los metodos pueden y no pueden recibir parametros
		// Parametros información necesaria que el metodo depositar necesita usar
	
		// hay algunos metodos que no retornan nada (void) 
		public void depositar(double valor) {  // esto es un metodo llamado Depositar // un metodo es = a un comportamiento
			// saldo es un atributo de cuenta ( en este caso pasaria a ser un objeto )
			this.saldo = this.saldo + valor;   // El this es una palabra clave igual al void, class, new, int y varias otras
			
		}
		
		public boolean saca(double valor) {
	        if(this.saldo >= valor) {
	            this.saldo -= valor;
	            return true;
	        } else {
	            return false;
	        }
	    }
		
		public boolean transferir (double valor, Cuenta cuenta ){ // esto es un metodo tranferir
			if (this.saldo >= valor) {
				//this.saldo = this.saldo - valor;
				this.saldo -= valor;
				cuenta.depositar(valor);
				return true;
			}else{
				return false;
			}
		}
		
		 public double getSaldo(){
		        return this.saldo;
		    }

		    public int getNumero(){
		        return this.numero;
		    }
		    
		    public void setNumero(int numero){
		        this.numero = numero;
		    }

	
		// hay metodos que retornan valor
		
		public boolean retirar (double valor){  // esto es un metodo retirar
			if (this.saldo >= valor) {
				//this.saldo = this.saldo - valor;  // forma  
				this.saldo += - valor;  //formato 2
				return true;
			}else {
				return false;
			}
			
		}

	/*	public void setAgencia(int nuevaAgencia){
			if (agencia > 0) {
				this.agencia = nuevaAgencia;
			}else {
				//System.out.println("No se permiten valores negativos");
			}
			
		}
	*/

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



		
