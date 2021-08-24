package aula01.unip;

import java.util.*;

public class EntradaDados {

		public static void main (String [] args) {
			
			float nota1 = 0, nota2 = 0, trabalho = 0, media = 0;
			
			try {
				System.out.println("Digite a primeira nota:");
				Scanner teclado = new Scanner(System.in);
				nota1 = teclado.nextFloat();
				
				System.out.println("Digite a segunda nota:");
				teclado = new Scanner(System.in);
				nota2 = teclado.nextFloat();
				
				System.out.println("Digite a nota do trabalho:");
				teclado = new Scanner(System.in);
				trabalho = teclado.nextFloat();
		
				
				media = (nota1 + nota2 + trabalho)/3;
				System.out.println("A média é igual a:" + media);
				
			} catch (NumberFormatException e) {
				System.out.println("houve um erro na conversão, digite apenas números!!!");
			}
			
		}
	}
