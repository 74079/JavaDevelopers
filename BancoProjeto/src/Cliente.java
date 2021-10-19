
public class Cliente {

	private String nome;
	private String CPF;
    private String tipo;
    private Endereco endereco;
    private Conta conta;
	
   
    public Cliente(String nome, String CPF, String tipo)
    { 
    	this.nome = nome;
    	this.CPF = CPF;
    	this.tipo = tipo;

    }
    
    public void setConta(int numero, int agencia,String tipo)// cliente vai ter conta tambem e essa seria a forma de ele ter aceeso a conta.(relacionamento)
    {
    	this.conta.setNumero(numero);
    	this.conta.setAgencia(agencia);
    	this.conta.setTipo(tipo);
    }

	public void setEndereco(String cidade, String rua, String UF, double CEP)// cliente vai ter endereco tambem e essa seria unica forma de cliente ter acesso ao endereco(relacionamento)
	{
		this.endereco.setCidade(cidade);
		this.endereco.setRua(rua);
		this.endereco.setUF(UF);
		this.endereco.setCEP(CEP);
	}
	
	
    public void setNome(String nome)
    {
    	this.nome = nome;
    }
	
	public void setCPF(String CPF) 
	{
	
		this.CPF = CPF;
	}
	
	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}
	

	
	public String getNome()
	{
		return this.nome;
	}

	public String getCPF()
	{
		return this.CPF;
	}
	
	public String getTipo()
	{
		return this.tipo;
	}
	}
