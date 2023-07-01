package estrutura.condicional;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*
		 * Exercício 02 - Fazer um programa para ler um número inteiro
		 * e dizer se este número é par ou ímpar.
		 * 
		 * Entrada: 12 = Par; -27 = Ímpar; 0 = Par;
		 */
		
		int number;
		
		System.out.println("Digite um número: ");
		number = sc.nextInt();		
		
		if (number % 2 == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Ímpar");
		}
		
		
		sc.close();
	}
}
