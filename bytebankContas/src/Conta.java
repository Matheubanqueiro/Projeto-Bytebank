
public abstract class Conta {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular; 
	private static int total = 0;
	
	public Conta(int agencia, int numero) {
		Conta.total ++;
		//System.out.println("O total de contas é: " + total);
		this.agencia = agencia;
		//this.saldo = 100;
		this.numero = numero;
	}
	
	public abstract void deposita(double valor);
	
	public boolean saca (double valor) {
		
		if (this.saldo >= valor) {
			
			this.saldo -= valor;
			return true;
		
		} 
			return false;
		}
	
	
	public boolean transfere (double valor, Conta destino) {
		
		if(this.saca(valor)) {
			
			destino.deposita(valor);
			return true;
		
		} 
			return false;
		
	}
	
	public double getSaldo() {
		
		return this.saldo;
	}
	
	public int getNumero() {
		
		return this.numero;
	}
	public void setNumero(int numero) {
		
		if (agencia <= 0) {
			
			System.out.println("Numero igual a  0 não pode");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		
		if (agencia <= 0) {
			
			System.out.println("Nao pode valor menor igual a zero");
			return;
		}
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return Conta.total;
	}

	
	
}
