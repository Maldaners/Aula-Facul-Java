package heranca;

import javax.swing.JOptionPane;

public class PessoaJuridica {
	private String cnpj;
	private String razaoSocial;
	
	public String getCNPJ ()
	{
		return cnpj;
	}
	
	public void setCNPJ (String _cnpj)
	{
		this.cnpj=_cnpj;
	}
	public String getRazaoSocial ()
	{
		return razaoSocial;
	}
	public void setRazaoSocial (String _razaoSocial)
	{
		this.razaoSocial=_razaoSocial;
	}
	
	public void Mostrar (String cnpj, String razaoSocial)
	{
		JOptionPane.showMessageDialog(null, "CNPJ:"+cnpj+
				"\nRaz�o Social:"+razaoSocial);
	}
	

}
