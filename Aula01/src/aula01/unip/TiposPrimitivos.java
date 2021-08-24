package aula01.unip;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		// definicao de variaveis primitivas 
		
		char sexo = 'f';
		byte idade = 99;
		short codigo = 256;
		float nota = 9.89f;
		int aluno = 100, classe = 10;
		long habitantes = 9050100;
		double dolar = 5.75;
		boolean alternativa = true;
		
		System.out.println("\nsexo:" +sexo +
				" idade: " +idade + 
				" codigo: " +codigo);
		
		System.out.println("\nnota :" +nota + 
				" aluno:" +aluno +
				" classe:" +classe);
		
		System.out.println("\nhabitantes: "+habitantes + 
				" dolar: " +dolar +
				" alternativa : " +alternativa);

		System.out.println("Os dados do sistema são: " +sexo+
				"," +idade+ "," + codigo+ "," +nota+ "...");
	}

}
