package heranca;

import javax.swing.JOptionPane;

public class PessoaFisica {
	private String rg;
	private String cpf;
	
	public String getRG ()
	{return rg;}
	
	public void setRG (String _rg)
	{
		this.rg=_rg;
	}
	
	public String getCPF () {
		return cpf;
	}
	public void setCPF (String _cpf)
	{
		this.cpf=_cpf;
	}
	
	public void Mostrar (String rg, String cpf)
	{
		JOptionPane.showMessageDialog(null, "RG:"+rg+ "\nCPF:"+cpf);
		
	}

}
