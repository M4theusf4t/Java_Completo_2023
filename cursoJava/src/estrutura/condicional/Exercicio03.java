package estrutura.condicional;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		/*
		 * Leia 2 valores inteiros (A e B). O programa deve mostrar uma
		 * mensagem "São Multiplos" ou "Não são Multiplos", indicando se
		 * os valores lidos são multiplos entre si. Atenção: os números
		 * devem poder ser digitados em ordem crescente ou decrescente.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite um número: ");
		a = sc.nextInt();
		System.out.println("Digite outro número: ");
		b = sc.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("São Multiplos");
		} else {
			System.out.println("Não são Multiplos");
		}
	
		
		sc.close();
	}

}
