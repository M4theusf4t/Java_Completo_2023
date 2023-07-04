package estruturas.repetitivas;

import java.util.Scanner;

public class Exercicio02While {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
		 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
		 * quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos
		 * uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
		 * alguma).
		 * 
		 */

		System.out.print("Digite a cordenada X: ");
		int x = sc.nextInt();
		System.out.print("Digite a cordenada Y: ");
		int y = sc.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
				System.out.println(""); // Pular 1 linha.
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo");
				System.out.println("");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
				System.out.println("");
			} else {
				System.out.println("Quarto");
				System.out.println("");
			}

			System.out.print("Digite a cordenada X: ");
			x = sc.nextInt();
			System.out.print("Digite a cordenada Y: ");
			y = sc.nextInt();
		}

		sc.close();

	}

}
