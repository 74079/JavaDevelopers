import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Banco {
	
	public static void main(String[] args) {
		
		String nome, tipo = null, CPF, UF, rua = null, loja, cidade;
		
		int numero = 0;
		int agencia = 0,deposito;
		double valor;
		double CEP; 
		int i = 0,j,k;
		boolean controle = true;
	
		Scanner scan = new Scanner(System.in);
	
		
		int quantidadeCliente =10;  
		
		
	    Conta[] conta = new Conta[quantidadeCliente]; // toda vez que eu criar essa estacincia de objeto todos os atributos do construtor Conta e chamado para para ca para realizar entradas dos dados.
	    Cliente[] cliente = new Cliente[quantidadeCliente];
	    Endereco[] endereco = new Endereco[quantidadeCliente];
	    Gerente[] gerente = new Gerente[quantidadeCliente];
	    
    	
	    System.out.println("quantas contas deseja cadastrar:?");
	    quantidadeCliente = scan.nextInt();
    	
    	cliente = new Cliente[quantidadeCliente];
    	conta = new Conta[quantidadeCliente];
    	endereco = new Endereco[quantidadeCliente];
    	gerente = new Gerente[quantidadeCliente];
    	
    	for (  i = 0; i <quantidadeCliente; i++) 
	    { 
	    	 
	    	System.out.println("digite o nome do cliente:?");
	    	nome = scan.next();
	    	
	    	System.out.println("digite o CPF do cliente:?");
	    	CPF = scan.next();

	    	System.out.println("informe o tipo de cliente\ngerente ou cliente ?");
	    	tipo = scan.next();

	    	System.out.println("informe a agencia do cliente:?");
	    	agencia = scan.nextInt();
	    	
	    	
	    	System.out.println("informe o numero da conta do cliente:?");
	    	numero = scan.nextInt();
	    	
	    	
	    	System.out.println("informe o tipo de conta\npupanca ou corrente ?");
	    	tipo = scan.next();
	    
	    	
	    	System.out.println("digite a cidade do cliente:?");
	    	cidade = scan.next();

	    	
	    	System.out.println("informe a rua:?");
	    	rua = scan.next();

	    	System.out.println("UF:?");
	    	UF = scan.next();
	   
	    	
	    	System.out.println("informe o CEP:?");
	    	CEP = scan.nextDouble();

	    	
	    	
	    	
	    	cliente[i] = new Cliente(nome, CPF, tipo);
	    	

	    	conta[i] = new Conta(numero, agencia, tipo, null);
	    	endereco[i] = new Endereco(cidade, rua, UF, CEP, null);
	    	
	        System.out.println((i+1)+"º cliente: "+cliente[i].getNome()+"\nCPF: "+cliente[i].getCPF()+"\nusuario: "+cliente[i].getTipo()+"\nagencia: "+conta[i].getAgencia()+"\nnumero da conta: "+conta[i].getNumero()+"\ntipo conta: " +conta[i].getTipo()+"\n\nendereco do cliente\n"+"\ncidade: "+endereco[i].getCidade()+"\nrua: "+endereco[i].getRua()+"\nUF: " +endereco[i].getUF()+"\nCEP: "+endereco[i].getCEP());  
	    }

        
        int sim;
//		Conta[] conta = new Conta[quantidade]; 
		
		System.out.println("deseja fazer um deposito, Sim ou Nao");
		sim = scan.nextInt();
//		conta = new Conta[quantidade];
		if( sim == sim) 
		{
			System.out.println("para qual conta deseja deposita?");
			conta[i] = new Conta(numero, agencia, tipo, null);
			System.out.println(conta[i].getAgencia()+conta[i].getNumero()+conta[i].getTipo());
			System.out.println("digite a angecia que voce quer deposita?");
			agencia = scan.nextInt();
			System.out.println(conta[i].getAgencia()+conta[i].getNumero()+conta[i].getTipo());
			
			System.out.println("digite o valor que voce quer deposita?");
			deposito = scan.nextInt();
			

			System.out.println("saldo na conta"+conta[i].getSaldo());
			
			
		}
		


	}
}
