
public class Endereco {
	private String rua;
	private int numero;
	private String UF;
	private double CEP;
	private double telefone;
	

	
	public void setNumero(int numero)
	{
		this.numero = numero;
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

	public void setTelefone(double telefone)
	{
		this.telefone = telefone;
	}
	
	public String getRua()
	{
		return this.rua;
	}
	
	public int getNumero()
	{
		return this.numero;
	}
	
	
	public String getUF()
	{
		return this.UF;
	}
	public double getCEP()
	{
		return this.CEP;
	}
	
	public double getTelefone()
	{
		return this.telefone;
	}
	
	
	
	
}
