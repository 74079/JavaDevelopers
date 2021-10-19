
public class Cliente {
	
	private String nome;
	private String CPF;
    private int tipo;
    private Endereco endereco;
    private Cliente cliente;
    
    

    
    
    public void setCliente(String nome, String CPF, int tipo)
    {
    	if(cliente == null)
    		cliente = new Cliente();
    	
    	
    	// aqui nome eu posso simplismente passar de um para o outro, que eu possa acessar essa conta cliente 
    	
    	
    	this.cliente.setNome(nome);
    	this.cliente.setCPF(CPF);
    	this.setTipo(tipo);
    }
    
    
	public void setEndereco(String rua, int numero, String UF, double CEP, double telefone)
	{
		
		// aqui ele verifica se enderececo e nulo, caso se for ele ira passa pelo tipo de classe Endereco e criar um novo endereco na linha 14
		if (endereco == null)
			endereco = new Endereco();
		
		this.endereco.setRua(rua);
		this.endereco.setNumero(numero);
		this.endereco.setCEP(CEP);
		this.endereco.setUF(UF);
		this.endereco.setTelefone(telefone);
	}
    public void Gerente()
    {
    	this.nome = "Lucas";
    }
    
    public void setNome(String nome)
    {
    	this.nome = nome;
    }
	


	// setCPF adiciona captura e vai passar um parametro que esta na funcao setCPF String CPF vai passar um parametro que vai ser gravado em private String CPF
	// private e como se fosse o encapusalamento do CPF
	//aqui na funcao void e uma funcao vaizia onde eu posso fazer alteracao ou adiciona na variavel private String CPF
	public void setCPF(String CPF) 
	{
		// this --> forca dizendo que o que vem depois do ponto e da classe que vem o meu metodo CPF
		// = ele diz que recebe CPF
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
	public String getCPF()
	{
		return this.CPF;
	}
	
	public int getTipo()
	{
		return this.tipo;
	}
	



}
