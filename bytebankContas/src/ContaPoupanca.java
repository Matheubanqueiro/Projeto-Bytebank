
public class ContaPoupanca extends Conta {
	
	public ContaPoupanca (int agencia, int numero) {
		
		super(agencia, numero); // puxa da classe mãe
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
}
