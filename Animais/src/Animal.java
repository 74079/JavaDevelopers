
public class Animal {
	private String nome;
	private float comprimento;
	private int numerodePatas;
	private String cor;
	private String ambiente;
	private float velocidadeMedia;
	
	// metodo construtor que receba os atributos e e declaro como parametros e atribua um nome a cada um deles...
	public Animal(String nome, float comprimento, int numerodePatas, String cor, String ambiente, float velocidadeMedia)
	{
		this.nome = nome;
		this.comprimento = comprimento;
		this.numerodePatas = numerodePatas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidadeMedia =velocidadeMedia; 
	}
	
	public Animal()
	{
		System.out.println("objeto criado");
	}
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getComprimento() {
		return comprimento;
	}
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	public int getNumerodePatas() {
		return numerodePatas;
	}
	public void setNumerodePatas(int numerodePatas) {
		this.numerodePatas = numerodePatas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor; 
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public float getVelocidadeMedia() {
		return velocidadeMedia;
	}
	public void setVelocidadeMedia(float velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}

	public String Relatorio()
	{
		return this.nome+"o nome do animal, "+ this.cor+" a sua cor "+this.ambiente+" que ele habita.";
	}

}
