package estruturas.repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercico03For {

	public static void main(String[] args) {

		/*
		 * Leia 1 valor inteiro N, que representa o número de casos de teste 
		 * que vem a seguir. Cada caso de teste consiste de 3 valores reais, 
		 * cada um deles com uma casa decimal. Apresente a média ponderada para 
		 * cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem 
		 * peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.
		 * 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número de testes: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Primeiro valor: ");
			Double primeiro = sc.nextDouble();
			
			System.out.print("Segundo valor: ");
			Double segundo = sc.nextDouble();
			
			System.out.print("Terceiro valor: ");
			Double terceiro = sc.nextDouble();
			
			double media = (primeiro * 2.0 + segundo * 3.0 + terceiro * 5.0) / 10.0;
			
			System.out.printf("Media: %.1f%n", media);
		}
		
		
		
		sc.close();
		
	}

}
