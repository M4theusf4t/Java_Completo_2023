package estruturas.repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Aula01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int valor;
		int soma = 0;
		
		System.out.print("Digite um número: ");
		valor = sc.nextInt();
		
		while (valor != 0) {
			soma += valor;
			System.out.print("Digite outro número: ");
			valor = sc.nextInt();
		}
		
		System.out.println("Soma: " + soma);
		
		sc.close();
	}

}
