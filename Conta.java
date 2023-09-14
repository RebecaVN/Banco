package banco;

//(Classe objeto) - Super Classe//

public abstract class Conta {
	
	private int agencia;
	private int numero;
	private double saldo;
	private String cliente;
	
	//Construtor
	
	public Conta (int agencia, int numero, double saldo, String cliente){
		
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;	
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	//Método depósito.
	public void deposito(double valor){
		this.saldo += valor;	
	}
	
	//Método saque.
	public boolean saque(double valor){
		if(saldo >= valor){
			this.saldo -= valor;
			return true;
		}else{
			return false;
		}
	}
	
	//Método transfere.
	public boolean transfere(double valor, Conta destino){
		if(saque(valor)){
			destino.deposito(valor);
			return true;
		}else{
			return false;
	
		}
	}

	
}
