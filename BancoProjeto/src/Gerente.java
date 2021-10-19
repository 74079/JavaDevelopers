
public class Gerente {
	
	private String nome;
	private String loja;
    private Endereco endereco;
    private Conta conta;
    
    public Gerente(String nome, String loja) 
    {
    	this.nome = nome; 
    	this.loja = loja;
    }

    public void setConta(int numero, int agencia,double saldo, int tipo,double limite)// gerente vai ter conta tambem essa seria a forma dele ter acesso a conta dele.(relacionamento)
    {
    	this.conta.setNumero(numero);
    	this.conta.setAgencia(agencia);
    	this.conta.setTipo(tipo);
    }
    
	public void setEndereco(String cidade, String rua, String UF, double CEP)// gerente vai ter o endereco tambem essa seria forma dele ter acesso a endereco dele.(relacionamento)
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
    
    public void setLoja(String loja)
    {
    	this.loja = loja;
    } 
    
    public String getLoja()
    {
    	return this.loja;
    }
	
	public String getNome()
	{
		return this.nome;
	}
}
