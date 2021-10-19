import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Agenda{
	String driver = "com.mysql.cj.jdbc.Driver";
	 String url= "jdbc:mysql://localhost:3306/agenda?&serverTimezone=UTC";
	 String user= "user";
	 String password= "199426";
	 Connection con = null;
	
	private JFrame frame;
	private JTextField txtBusca;
	private JTextField txtNome;
	private JTextField txtTelefone;
	private JTextField txtEmail;
	private JTextComponent lblID;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agenda window = new Agenda();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public Agenda() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtBusca = new JTextField();
		txtBusca.setBounds(24, 10, 255, 19);
		frame.getContentPane().add(txtBusca);
		txtBusca.setColumns(10);
		
		JLabel lblID = new JLabel("");
		lblID.setBounds(50, 39, 45, 13);
		frame.getContentPane().add(lblID);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 62, 62, 19);
		frame.getContentPane().add(lblNome);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(10, 114, 59, 19);
		frame.getContentPane().add(lblTelefone);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 162, 59, 25);
		frame.getContentPane().add(lblEmail);
		
		txtNome = new JTextField();
		txtNome.setBounds(70, 62, 328, 19);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(70, 114, 328, 19);
		frame.getContentPane().add(txtTelefone);
		txtTelefone.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(70, 165, 328, 19);
		frame.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(txtBusca.getText().length() > 0) 
				{
					String[] resultado = BuscaNome(txtBusca.getText());
					
					if(resultado[0] != null)
					{
						lblID.setText(resultado[0]);
						txtNome.setText(resultado[1]);
						txtTelefone.setText(resultado[2]);
						txtEmail.setText(resultado[3]);
					}
					
					else
					{
						JOptionPane.showMessageDialog(btnPesquisar, "nenhum nome inicia com " + txtBusca.getText() + " em sua agenda!!");
						limparCampos();
					}
				}	
				
				else
					{
						JOptionPane.showMessageDialog(btnPesquisar, "informe o inicio do seu nome a ser buscado");
						limparCampos();
					}
				
			}

			private String[] BuscaNome(String Nome) 
			{
		        String[] resultado = null; 
				
							try
							{
								Class.forName(driver); // registra o driver
								String query= "SELECT * FROM contato WHERE Nome LIKE '" +Nome+"%'; "; 
								
									try 
									{
									Connection  con = DriverManager.getConnection(url, user, password); // estabelece a conexao 
									Statement st= con.createStatement(); // criando objeto startement - usado para exercultar consultas 
									ResultSet rs = st.executeQuery(query);
		
										int colNum = rs.getMetaData().getColumnCount();
										resultado = new String[colNum];
										
										if(rs.next())
										{
											for(int i = 0; i < colNum; i++) 
											{
												resultado[i] = rs.getString(i+1);
											}
										}
										
									st.close();
									con.close();
									}
									
									catch(SQLException e)
									{
										System.out.println(e);
							        }
							}
							
							catch(ClassNotFoundException e)
						    {
							   System.out.println(e);
							   return resultado;
							}
			return resultado;
			}
		});
		btnPesquisar.setBounds(313, 9, 85, 21);
		frame.getContentPane().add(btnPesquisar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
					String nome = txtNome.getText();
					String telefone = txtTelefone.getText();
					String Email = txtEmail.getText();
			
					int resultado = Cadastrar(nome,telefone,Email);
					System.out.println("Resultado"+resultado);
				 
					if(resultado == 1) 
					{
						JOptionPane.showMessageDialog(btnCadastrar, "O registro do contato" +nome+ "foi salvo com sucesso!");
					}
					
					else
					{
						JOptionPane.showMessageDialog(btnCadastrar, "Ocorreram problemas ao salvar registro!");
					}
			} 

			private int Cadastrar(String nome, String telefone, String email) 
			{
			int resultado = 0;

			try 
			{
				Class.forName(driver); // registra o driver 
				String query = "INSERT INTO contato (nome, telefone, Email) VALUES " + "('"+txtNome.getText()+"', '"+txtTelefone.getText()+"', '"+txtEmail.getText()+"');";
					
				    try 
					{
					Connection  con = DriverManager.getConnection(url, user, password); // estabelece a conexao 
					Statement st= con.createStatement(); // criando objeto startement - usado para exercultar consultas 
					resultado = st.executeUpdate(query);
						
					st.close();
					con.close();
					}
			
				catch(SQLException e) 
			    {
				   System.out.println(e);
				} 
				}
			
				catch(ClassNotFoundException e)
			    {
				   System.out.println(e);
				}
	    return resultado;								
	    } 
		});
		btnCadastrar.setBounds(10, 220, 85, 21);
		frame.getContentPane().add(btnCadastrar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int confirma = JOptionPane.showConfirmDialog(btnExcluir, "deseja realmente excluir o registro!"+ lblID.getText() + "?");
				if(confirma == JOptionPane.YES_OPTION)
				{
					if(Excluir(lblID.getText()))
					{
						JOptionPane.showMessageDialog(btnExcluir, "registro excluido com sucesso");
						limparCampos();
					}
					
					else
					{
						JOptionPane.showMessageDialog(btnExcluir, "problemas ao excluir registros");
					}
				}
					
					else if(confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION)
					{
						JOptionPane.showMessageDialog(btnExcluir, "registro nao excluido");
					}
			}
			
		private boolean Excluir(String id) 
		{
				boolean resultado = false;

				try 
				{
					Class.forName(driver); // registra o driver
					String query= "DELETE FROM contato WHERE idcontato = " + id;
							
					try 
					  {
						Connection  con = DriverManager.getConnection(url, user, password); // estabelece a conexao 
						Statement st= con.createStatement(); // criando objeto startement - usado para exercultar consultas 
						st.executeUpdate(query);
						
						st.close();
						con.close();
						resultado = true;
					   }
					
				catch(SQLException e)
			    {
				   System.out.println(e);
				} 
				}
				
				catch(ClassNotFoundException e)
			    {
				   System.out.println(e);
				}
		return resultado;
		}
		});
		btnExcluir.setBounds(166, 220, 85, 21);
		frame.getContentPane().add(btnExcluir);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int confirma = JOptionPane.showConfirmDialog(btnEditar, "deseja realmente editar o registro!"+ lblID.getText() + "?");
				if(confirma == JOptionPane.YES_OPTION)
				{
					if(editar(lblID.getText()))
					{
						JOptionPane.showMessageDialog(btnEditar, "registro editado com sucesso");
						limparCampos();
					}
					
					else
						{
							JOptionPane.showMessageDialog(btnEditar, "problemas ao editar registros");
						}
				}
					
				else if(confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION)
				{
					JOptionPane.showMessageDialog(btnEditar, "registro nao editado");
				}
			}

			private boolean editar(String id) 
			{
				boolean resultado = false;
				
				try 
				{
					Class.forName(driver); // registra o driver 
					String query= "UPDATE contato SET Nome = '"+txtNome.getText() +"',"+"telefone = '"+ txtTelefone.getText() +"' ,Email = '"+txtEmail.getText()+"' WHERE idcontato = " +id;

							try 
							  {
								Connection  con = DriverManager.getConnection(url, user, password); // estabelece a conexao 
								Statement st= con.createStatement(); // criando objeto startement - usado para exercultar consultas 
								st.executeUpdate(query);
								
								st.close();
								con.close();
								resultado = true;
					           }
							
							catch(SQLException e)
						    {
							   System.out.println(e);
							} 
				   }
				
					catch(ClassNotFoundException e)
				    {
					   System.out.println(e);
					}
		return resultado;
		}
		});
		btnEditar.setToolTipText("Editar");
		btnEditar.setBounds(313, 220, 85, 21);
		frame.getContentPane().add(btnEditar);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(24, 39, 43, 13);
		frame.getContentPane().add(lblId);

	}
		private void limparCampos()
		{
			lblID.setText("");
			txtNome.setText("");
			txtTelefone.setText("");
			txtEmail.setText("");
		}
}
