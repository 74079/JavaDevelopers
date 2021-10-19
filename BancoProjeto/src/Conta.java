
public class Conta {

	private int numero;    
	private int agencia;
	private double saldo;
    private String tipo;       
    private double limite; 
    private Cliente cliente;
	private Gerente gerente;
	

    public Conta(int numero, int agencia,String tipo,Cliente cliente) // todos esses atributos do contrutor vai direto para a estanciacao na entradada de dados Conta conta new(numero,agencia,tipo,cliente)
    {
		this.numero = numero;
    	this.agencia = agencia;
      	this.tipo = tipo;
      	this.cliente = cliente;
    }
   

	public void SetCliente(String nome, String CPF, String tipo)// assim conta tera modo de relacionamento e acesso ao cliente.
    {
    	this.cliente.setNome(nome); 
    	this.cliente.setCPF(CPF);
    	this.cliente.setTipo(tipo);
    }

	public void setGerente(String nome, String loja)
	{
		this.gerente.setNome(nome);
		this.gerente.setLoja(loja);
	}
	
	
	
    public void setNumero(int numero)                                                                                                                     
    {
    	this.numero = numero;                                                                                                                    
    }
    
    public void setAgencia(int agencia)
    {
    	this.agencia = agencia;
    }
 
    public void setTipo(String tipo)
    {
    	this.tipo = tipo;
    }
    
    public void setTipo(double limite)
    {
    	this.limite = limite;
    }


    
    public void SetDepositar(double deposito)
	{
		saldo+= deposito;
	}

	
	public void setSacar(double valor)
	{
		if (saldo + limite >= valor)
			saldo -= valor;
		
		else  
			System.out.println("saldo insuficiente");
	}
	

	
	public void setTransferir(Conta contaDestino, double valor) 
		{
		    saldo+=valor;
			saldo -= valor;
		}
	

	public double getSaldo()
	{
		return this.saldo;
	} 
	
    public int getNumero()    
    {
    	return this.numero;
	}
    
    public String getTipo()
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

