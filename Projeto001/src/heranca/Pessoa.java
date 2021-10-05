package heranca;



import java.util.Date;

import javax.swing.JOptionPane;

public class Pessoa {
	private String nome;
	private String email;
	private String data;
	
	public String getNome ()
	{
		return nome;
	}
	public void setNome (String _nome)
	{this.nome=_nome;}
	
	public String getEmail ()
	{return email;}
	
	public void setEmail (String _email)
	{
		this.email=_email;
	}
	
	public String getData ()
	{
		return data;
		
	}
	public void setData (String _data)
	{
		this.data=_data;
	}
	
	public void Mostrar (String nome, String email, Date data)
	{
		JOptionPane.showMessageDialog(null,"Nome:"+nome +
				"\nEmail:"+email+
				"\nData:"+data);
		
	}

}
