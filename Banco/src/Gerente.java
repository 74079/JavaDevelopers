
public class Gerente {

	private String nome;
	private double CPF;
    private int tipo;
    private Endereco endereco;
    
	public void setEndereco(String rua, int numero, String UF, double CEP, double telefone)
	{
		if (endereco == null)
			endereco = new Endereco();
		
		this.endereco.setRua(rua);
		this.endereco.setNumero(numero);
		this.endereco.setCEP(CEP);
		this.endereco.setUF(UF);
		this.endereco.setTelefone(telefone);
	}
    
    
    public void setNome(String nome)
    {
    	this.nome = nome;
    }
    
    
    
    public void setCPF(double CPF) 
	{
		this.CPF = CPF;
	}
	
    
    
    
    
	
	public void setTipo(int tipo)
	{
		this.tipo = tipo;
	}
	
	public String getNome()
	{
		return this.nome;
	}
	// get informa que eu ira retorna uma variavel do tipo CPF
	public double getCPF()
	{
		return this.CPF;
	}
	
	public int getTipo()
	{
		return this.tipo;
	}

}
