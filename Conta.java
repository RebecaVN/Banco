package banco;

//(Classe objeto) - Super Classe//
//A classe objeto não pode ser instanciada. 


public abstract class Conta {
	
	private int agencia;
	private int numero;
	private double saldo;
	Cadastro cliente;
	
	//Construtor
	
	public Conta (int agencia, int numero, double saldo){
		
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	
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
