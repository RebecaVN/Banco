package banco;

//(Classe objeto) - extends Conta

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero, double saldo, String cliente) {
		super(agencia, numero, saldo);
			}
	
		public boolean saque(double valor){
			return super.saque(valor + 1.50);
		}
		
		
	

}
