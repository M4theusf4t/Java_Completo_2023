package estruturas.repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Aula03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double temp = sc.nextDouble();
			
			double F = 9.0 * temp / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			
			System.out.print("Nova consulta (s/n)? ");
			resp = sc.next().charAt(0);
			
		} while (resp != 'n');
		
		
		sc.close();
	}

}
