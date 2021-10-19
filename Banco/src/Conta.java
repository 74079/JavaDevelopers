
public class Conta {
	// via metodos ele e encapisulado como uma ovo para acessar a classe
	// private e visivel dentro da classe
	// private la no banco principal nao vou conceguir pq la esta modo plubico
	//public vou conceguir ter aceeso a bancoprincipal porque esta de modo plubico e nao privado
	
	private int numero;     // essa classe atributo vai ser privada 
	private int agencia;// essa classe atributo vai ser privada 
	private double saldo; // essa classe atributo vai ser privada 
    private int tipo;       // essa classe vai atributo ser privada 
    private double limite;  // essa classe atributo vai ser privada 
    private Cliente cliente;
    //  private cliente = new Cliente(); // new contrutor Cliente e o tipo de cliente e novo minusculo e novo objeto cliente que construtor pode criar
    private Gerente gerente = new Gerente();
    
    public Conta(String nome, String CPF, int tipo)
    {
    	if(cliente == null)
    		cliente = new Cliente();    	
    	
    	this.cliente.setNome(nome);
    	this.cliente.setCPF(CPF);
    	this.setTipo(tipo); 
    }
     
    public void setCliente(String nome, String CPF, int tipo)
    {
    	if(cliente == null)
    		cliente = new Cliente();
    	
    	
    	// aqui nome eu posso simplismente passar de um para o outro, que eu possa acessar essa conta cliente 
    	
    	
    	this.cliente.setNome(nome);
    	this.cliente.setCPF(CPF);
    	this.setTipo(tipo);
    }
    
    public void setNumero(int numero)                                                                                                                     // em modo pubico  // set adiciona informacao     	// this --> meio que pegar os atributos da classe     	//this --> este,  numero dessa classe recebe numero que esta nela numero
    {
    	this.numero = numero;                                                                                                                   // aqui eu poço altera so essa informacao e ela altera todas as outras nesse caso nao seria necessario alterar os outros atributos 
    }
    
    public void setAgencia(int agencia)
    {
    	this.agencia = agencia;
    }
 
    public void setTipo(int tipo)
    {
    	this.tipo = tipo;
    }
    
    public void setTipo(double limite)
    {
    	this.limite = limite;
    }

///////////////////////////////////////////////////////////////////////////////////	
    
    public void SetDepositar(double deposito)
	{
		this.saldo+= deposito;
	}
//////////////////////////////////////////////////////////////////////////////////	
	
	public void setSacar(double valor)
	{
		if (this.saldo + limite >= valor)
			this.saldo -= valor;
		
		else  
			System.out.println("saldo insuficiente");
	}
	
///////////////////////////////////////////////////////////////////////////////////	
	
	public void setTransferir(Conta contaDestino, double valor) 
		{
	        //conta.depositar+=valor
		    this.saldo+=valor;
			this.saldo -= valor;
		}
////////////////////////// ele que dizer que ele ira retorna aquele atributo externo da funcao void//////////////////////////////////////////////////////////


	public double getSaldo()
	{
		return this.saldo;
	}
	
    public int getNumero()    
    {
    	return this.numero;
	}
    
    public int getTipo()
    {
    	return this.tipo;
    }
    
    public double getLimite()
    {
    	return this.limite;
    }
    
    public  int getAgencia()
    {
    	return this.agencia;
    }
  
    public String Relatorio()
    {
    	String texto = "numero:" + this.numero + "agencia :" + this.agencia;
    	return texto;
    }
    
}  
