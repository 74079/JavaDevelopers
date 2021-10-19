
public class Endereco {
	
	
	private String cidade;
	private String UF;
	private String rua;
	private double CEP;
	private Cliente cliente;

	
	
	public Endereco(String cidade,String UF, String rua,double CEP, Cliente cliente)
	{
		this.cidade = cidade;
		this.UF = UF;
		this.rua = rua;   
		this.CEP = CEP;  
		this.cliente = cliente;
	}

	public void setCliente(String nome, String CPF, String tipo)
	{
		this.cliente.setNome(nome);
		this.cliente.setCPF(CPF);
		this.cliente.setTipo(tipo); 
	}

	public void setCidade(String cidade)
	{
		this.cidade = cidade;
	}
	
	public void setUF(String UF)
	{
		this.UF = UF;
	}
	
	public void setRua(String rua)
	{
		this.rua = rua;
	}
	
	public void setCEP(double CEP)
	{
		this.CEP = CEP;
	}

	public String getRua()
	{
		return this.rua;
	}
	
	public String getCidade()
	{
		return this.cidade;
	}
	
	public String getUF()
	{
		return this.UF;
	}
	public double getCEP()
	{
		return this.CEP;
	}

}
