package banco;

//(Classe Drive)

public class CriarConta {
	public static void main(String[] args) {
		
		Cadastro cad1 = new Cadastro("Flávia", "219.306.848-86", "(11)95784-6604", 5.000);
		
		
		//Objeto cc1
		ContaCorrente cc1 = new ContaCorrente(0, 0, 0, null);
		cc1.setAgencia(003);
		cc1.cliente = cad1;
		cc1.setNumero(65478-9);
		cc1.setSaldo(100);
		
		//Objeto cc2
		ContaCorrente cc2 = new ContaCorrente(0, 0, 0, null);
		cc2.setAgencia(021);
		cc2.setNumero(45789-7);
		cc2.setSaldo(100);
		Cadastro cad2 = new Cadastro("Rebeca", "559907788-80", "(11)97694-3609", 5.000);
		cc2.cliente = cad2; 
		
		
		
		System.out.println("                 BANCO");
		System.out.println();
		System.out.println("            CADASTRO CLIENTE ");
		System.out.println();
		System.out.println("Cliente: "+ cc1.cliente.getNome());
		System.out.println("CPF: " + cc1.cliente.getCpf() + "|" + " Telefone: " + cc1.cliente.getTelefone());
		System.out.println("Agência: " + cc1.getAgencia() + "|" + " Número da conta: " + cc1.getNumero());
		System.out.println("Renda Bruta: R$" + cc1.cliente.getRendaBruta());
		System.out.println("Saldo atual: R$" + cc1.getSaldo());
		System.out.println("----------------------------------------------------");
		System.out.println("Cliente: "+ cc2.cliente.getNome());
		System.out.println("CPF: " + cc2.cliente.getCpf() + "|" + " Telefone: " + cc2.cliente.getTelefone());
		System.out.println("Agência: " + cc2.getAgencia() + "|" + " Número da conta: " + cc2.getNumero());
		System.out.println("Renda Bruta: R$" + cc2.cliente.getRendaBruta());
		System.out.println("Saldo atual: R$" + cc2.getSaldo());
		System.out.println("----------------------------------------------------");
		System.out.println();
		System.out.println("Saldo Atual de " + cc1.cliente.getNome() + ": R$" + cc1.getSaldo());
		System.out.println("Saldo Atual de " + cc2.cliente.getNome() + ": R$" + cc2.getSaldo());
		
		//Depositar 500.00 em cc1
		cc1.deposito(500.00);
		System.out.println();
		System.out.println("              EXTRATO BANCÁRIO");
		System.out.println("Saldo atual de " + cc1.cliente.getNome() + ": R$" + cc1.getSaldo());
		
		
		
		//Transferir saldo de CC1 para CC2
		cc1.transfere(300, cc2);
		System.out.println();
		System.out.println("            EXTRATO BANCÁRIO");
		System.out.println("Saldo Atual de " + cc1.cliente.getNome() + ": R$" + cc1.getSaldo());
		System.out.println("Saldo Atual de " + cc2.cliente.getNome() + ": R$" + cc2.getSaldo());
	
		
		//Transferir saldo de CC1 para CC2 com valor incoerente ao saldo
		cc1.transfere(300.01, cc2);
		System.out.println();
		System.out.println("            EXTRATO BANCÁRIO");
		System.out.println("Saldo Atual de " + cc1.cliente.getNome() + ": R$" + cc1.getSaldo());
		System.out.println("Saldo Atual de " + cc2.cliente.getNome() + ": R$" + cc2.getSaldo());
		
		
		
	}
}