package estruturas.repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04For {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler um número N. Depois leia 
		 * N pares de números e mostre a divisão do primeiro pelo 
		 * segundo. Se o denominador for igual a zero, mostrar a 
		 * mensagem "divisao impossivel".
		 * 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número de testes: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Primeiro número: ");
			Double a = sc.nextDouble();
			
			System.out.print("Segundo número: ");
			Double b = sc.nextDouble();
			
			if (b != 0) {
				Double soma = a / b;
				
				System.out.printf("%.1f%n",soma);
				System.out.println("");
				
			} else {
				System.out.println("Divisão Impossivel");
				System.out.println("");
			}
		}
		
		
		sc.close();
	}

}
