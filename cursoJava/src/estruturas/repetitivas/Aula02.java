package estruturas.repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Aula02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quantidade;
		int soma = 0;
		
		System.out.print("Quantos números você irá digitar: ");
		quantidade = sc.nextInt();
		
		for (int i = 0; i < quantidade; i++) {
			int numero = sc.nextInt();
			soma += numero;
		}
		
		System.out.println("Soma: " + soma);
		
		
		sc.close();
		
	}

}
