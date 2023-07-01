package estrutura.condicional;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		/* Exercício 01 - Fazer um programa para ler um número inteiro,
		 * e depois dizer se este número é negativo ou não.
		 * 
		 * Entradas: -10 = Negativo; 8 = Não Negativo; 0 = Não Negativo;
		 *	
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		System.out.println("Digite um número: ");
		number = sc.nextInt();
		
		if (number >= 0 && number != -0) {
			System.out.println("Não negativo");
		} else if (number < 0) {
			System.out.println("Negativo");
		} else {
			System.out.println("Número Invalido!");
		}
		
		
		sc.close();
	}

}
