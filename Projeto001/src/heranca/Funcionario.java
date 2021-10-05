package heranca;

import javax.swing.JOptionPane;

public class Funcionario {
	
	private String funcao;
	private String matricula;
	
	public String getFuncao ()
	{
		return funcao;
	}
	public void setFuncao (String _funcao)
	{this.funcao=_funcao;}
	
	public String getMatricula ()
	{
		return  matricula;
	}
	public void setMatricula (String _matricula)
	{
		this.matricula =_matricula;
		
	}
	
	public void Mostrar (String funcao, String matricula)
	{
		JOptionPane.showMessageDialog(null, "Fun��o:"+funcao+
				"\nMatricula:"+matricula);
		
	}

}
