package heranca;

import javax.swing.JOptionPane;

public class TesteJOP {
	
	public static void main (String args[])
	{
	
	String nome;
	String email;
	int idade;
	String hob;
	
	nome = JOptionPane.showInputDialog("Digite seu nome:");
	email=JOptionPane.showInputDialog("Digite seu email:");
	idade=Integer.parseInt
			(JOptionPane.showInputDialog("Digite sua idade:"));
	hob=JOptionPane.showInputDialog("Digite seu hob:");
	
	JOptionPane.showMessageDialog(null, "O nome digitado foi:"+nome+
			"\nO email digitado foi:"+email+
			"\nA idade digitada foi:"+idade+
			"\nO Hob digitado foi:"+hob);
			

}}
