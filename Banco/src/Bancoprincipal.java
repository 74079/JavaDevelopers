import java.util.Scanner;
public class Bancoprincipal {

	public static void main(String[] args) {
		String nome = "lucas";
		String CPF = "1478";
		int tipo = 1;
//		Scanner scan = new Scanner(System.in);
		
		
		Conta conta = new Conta(nome,CPF,tipo);
		Cliente cliente = new Cliente();
		Gerente gerente = new Gerente();
		Endereco endereco = new Endereco();
		
//		System.out.println("informe o Nome:");
//		nome = scan.next();	
//		
//		System.out.println("informe o CPF:");
//		CPF = scan.next();
//		
//		System.out.println("informe o tipo:");
//		tipo = scan.nextInt();
		

		

//		conta.setNumero(123);
//		conta.SetDepositar(200);
//		conta.setSacar(50);
//		conta.setTransferir(conta, 100);
		
//		conta.setCliente(nome,CPF,tipo);


//		
//		cliente.setEndereco("crisantemo", 55, "sp", 2, 8);
//		gerente.setEndereco("lirios",5,"rj",4,5);
	  		 
//	
//	    System.out.println("Rua:" +endereco.getRua());
//	    System.out.println("Numero:" +endereco.getNumero());
//	    System.out.println("CEP:" +endereco.getCEP());
//	    System.out.println("UF:" +endereco.getUF());
//	    System.out.println("telefone:" +endereco.getTelefone());

		
	 
	    System.out.println("o cliente:" +cliente.getNome());
		System.out.println("Seu CPF:" +cliente.getCPF());
		System.out.println("do tipo:" +cliente.getTipo());

//		System.out.println("o numero da conta:" +conta.getNumero());
//    	System.out.println("o saldo na conta "+conta.getSaldo());
	

	}

}


 