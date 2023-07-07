package estruturas.repetitivas;

import java.util.Scanner;

public class Exercicio05For {

	public static void main(String[] args) {

		/*
		 * Ler um valor N. Calcular e escrever seu respectivo 
		 * fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) 
		 * * ... * 1.Lembrando que, por definição, fatorial de 0 é 1.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int fatorial = 1;
		
		System.out.print("Digite um valor: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			fatorial *= i;
		}

		System.out.println("Fatorial de "+ n +" e: "+ fatorial);
		
		
		sc.close();
	}

}
