package heranca;

import javax.swing.JOptionPane;

public class CadastroPessoa {
	
	public static void main (String args[])
	{
		int opcao;
		Pessoa pessoa = new Pessoa ();
		PessoaFisica pessoaFisica = new PessoaFisica ();
		PessoaJuridica pessoaJuridica = new PessoaJuridica (); 
		Funcionario funcionario = new Funcionario ();
		
		
		
		// Selecao de opcoes para cadastro 
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog
				("Digite 1 para cadastrar dados da Pessoa Fisica: "+
				"\nDigite 2 para cadastrar dados da Pessoa Juridica: " +
				"\nDigite 3 para cadastrar dados do Funcionario: " +
				"\nDigite 4 ou qualquer outra opção para finalizar! "));
		
	
			if (opcao == 1)
			{ // Define entrada de dados da pessoa fisica 
				
				pessoa.setNome(JOptionPane.showInputDialog("Digite seu nome:" ));
				pessoa.setData(JOptionPane.showInputDialog("Digite seu aniversário:" ));
				pessoa.setEmail(JOptionPane.showInputDialog("Digite seu email:" ));
				
				pessoaFisica.setRG(JOptionPane.showInputDialog("Digite seu RG:" ));
				pessoaFisica.setCPF(JOptionPane.showInputDialog("Digite seu CPF:" ));
				
				// Imprime dados digitados 
				
				JOptionPane.showMessageDialog(null, 
						"Nome: " + pessoa.getNome() +
						"\nAniversário: " + pessoa.getData () +
						"\nEmail: " + pessoa.getEmail() +
						"\nRG: " + pessoaFisica.getRG() +
						"\nCPF: " + pessoaFisica.getCPF());
			}
			
			if (opcao == 2)
			{ // Define entrada de dados da pessoa juridica 
				
				pessoaJuridica.setRazaoSocial(JOptionPane.showInputDialog("Digite nome da empresa:" ));
				pessoaJuridica.setCNPJ(JOptionPane.showInputDialog("Digite CNPJ:" ));
				pessoa.setEmail(JOptionPane.showInputDialog("Digite o Email:" ));
				
				// Imprime dados digitados 
				
				JOptionPane.showMessageDialog(null, 
						"Nome da Empresa: " + pessoaJuridica.getRazaoSocial() +
						"\nCNPJ: " + pessoaJuridica.getCNPJ () +
						"\nEmail: " + pessoa.getEmail());
			}

			else if (opcao == 3)
			{ // Define entrada de dados do funcionario 
				
				pessoa.setNome(JOptionPane.showInputDialog("Digite seu nome:" ));
				pessoa.setData(JOptionPane.showInputDialog("Digite seu aniversário:" ));
				pessoa.setEmail(JOptionPane.showInputDialog("Digite seu email:" ));
				
				funcionario.setMatricula(JOptionPane.showInputDialog("Digite seu número de matícula:" ));
				funcionario.setFuncao(JOptionPane.showInputDialog("Digite sua Função:" ));
				
				pessoaFisica.setRG(JOptionPane.showInputDialog("Digite seu RG:" ));
				pessoaFisica.setCPF(JOptionPane.showInputDialog("Digite seu CPF:" ));
								
				// Imprime dados digitados 
				
				JOptionPane.showMessageDialog(null, 
						"Nome: " + pessoa.getNome() +
						"\nAniversário: " + pessoa.getData () +
						"\nEmail: " + pessoa.getEmail() +
						"\nFunção: " + funcionario.getFuncao() +
						"\nMatricula: " + funcionario.getMatricula() +
						"\nRG: " + pessoaFisica.getRG() +
						"\nCPF: " + pessoaFisica.getCPF());
			}
			
			else 
			{
				JOptionPane.showMessageDialog(null, "Obrigado por informar os dados!!");
				
			}
		
	}
	

}
