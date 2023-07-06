package estruturas.repetitivas;

import java.util.Scanner;

public class Exercicio02For {

	public static void main(String[] args) {

		/*
		 * Leia um valor inteiro N. Este valor será a quantidade de 
		 * valores inteiros X que serão lidos em seguida.Mostre quantos 
		 * destes valores X estão dentro do intervalo [10,20] e quantos 
		 * estão fora do intervalo, mostrando essas informações conforme 
		 * exemplo (use a palavra "in" para dentro do intervalo, e "out" 
		 * para fora do intervalo).
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		
		int in = 0;
		int out = 0;
		
		System.out.print("Digite o número de valores que será lido: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite agora os valores: ");
			int x = sc.nextInt();
			
			if (x >= 10 && x <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}

}
