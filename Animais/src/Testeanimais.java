import java.util.Scanner;
public class Testeanimais {

	public static void main(String[] args) {
		
		 String nome;
		 float comprimento;
		 int numerodePatas;
		 String cor;
		 String ambiente;
		 float velocidadeMedia ;
		 String caracteristicas;
		 String alimento;
		 
		Scanner scan = new Scanner(System.in);
		Animal camelo = new Animal(null, 0, 0, null, null, 0);

		System.out.println(" nome do animal:");
		nome = scan.next();
		
		System.out.println("comprimento nome do animal:");
		comprimento = scan.nextFloat();
		
		
		System.out.println("numerodePatas do animal:");
		numerodePatas = scan.nextInt();
		
		System.out.println("cor do animal:");
		cor = scan.next();
		
		System.out.println("ambiente do animal:");
		ambiente = scan.next();
		
		System.out.println("velocidade Media que animal pecorre:");
		velocidadeMedia = scan.nextFloat();
		
		camelo.setNome(nome);
		camelo.setComprimento(comprimento);
		camelo.setNumerodePatas(numerodePatas);
		camelo.setCor(cor);
		camelo.setAmbiente(ambiente);
		camelo.setVelocidadeMedia(velocidadeMedia);
		camelo.Relatorio();
		
		System.out.println("nome do animal e "+camelo.getNome()+" seu comprimento "+camelo.getComprimento()+" metros, quantidades de patas "+camelo.getNumerodePatas()+" e sua cor e "+camelo.getCor()+" seu ambiente em que vive "+camelo.getAmbiente()+"sua velocidade e de "+camelo.getVelocidadeMedia());

		Peixe peixe = new Peixe();
		
		System.out.println(" nome do animal:");
		nome = scan.next();
		
		System.out.println("comprimento nome do animal:");
		comprimento = scan.nextFloat();
		
		
		System.out.println("numerodePatas do animal:");
		numerodePatas = scan.nextInt();
		
		System.out.println("cor do animal:");
		cor = scan.next();
		
		System.out.println("ambiente do animal:");
		ambiente = scan.next();
		
		System.out.println("velocidade Media que animal pecorre:");
		velocidadeMedia = scan.nextFloat();
		
		System.out.println("caracteristicas do animal Ex: caldas ou barbatanas");
		caracteristicas = scan.next();
		
		peixe.setNome(nome);
		peixe.setComprimento(comprimento);
		peixe.setNumerodePatas(numerodePatas);
		peixe.setCor(cor);
		peixe.setAmbiente(ambiente);
		peixe.setVelocidadeMedia(velocidadeMedia);
		peixe.setCaracteristicas(caracteristicas);
		
		
		System.out.println("nome do animal e "+peixe.getNome()+" seu comprimento "+peixe.getComprimento()+" metros, quantidades de patas "+peixe.getNumerodePatas()+" e sua cor e "+peixe.getCor()+" seu ambiente em que vive "+peixe.getAmbiente()+" sua velocidade e de "+peixe.getVelocidadeMedia()+"suas caracteristicas sao "+peixe.getCaracteristicas());

		Mamifero ursocanada  = new Mamifero();
		
		System.out.println(" nome do animal:");
		nome = scan.next();
		
		System.out.println("comprimento nome do animal:");
		comprimento = scan.nextFloat();
		
		
		System.out.println("numerodePatas do animal:");
		numerodePatas = scan.nextInt();
		
		System.out.println("cor do animal:");
		cor = scan.next();
		
		System.out.println("ambiente do animal:");
		ambiente = scan.next();
		
		System.out.println("velocidade Media que animal pecorre:");
		velocidadeMedia = scan.nextFloat();
		
		System.out.println("oque o uso se alimenta:?");
		alimento = scan.next();
		
		ursocanada .setNome(nome);
		ursocanada .setComprimento(comprimento);
		ursocanada .setNumerodePatas(numerodePatas);
		ursocanada .setCor(cor);
		ursocanada .setAmbiente(ambiente);
		ursocanada .setVelocidadeMedia(velocidadeMedia);
		ursocanada .setAlimento(alimento);
		
		
		System.out.println("nome do animal e "+ursocanada.getNome()+" seu comprimento "+ursocanada.getComprimento()+" metros, quantidades de patas "+ursocanada.getNumerodePatas()+" e sua cor e "+ursocanada.getCor()+" seu ambiente em que vive "+ursocanada.getAmbiente()+" sua velocidade e de "+ursocanada.getVelocidadeMedia()+"seu alimento preferido e "+ursocanada.getAlimento());

	

	}

}
