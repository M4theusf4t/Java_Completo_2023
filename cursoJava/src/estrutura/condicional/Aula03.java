package estrutura.condicional;

import java.util.Scanner;

public class Aula03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05; // Expressão condicional ternária
		
		System.out.println(desconto);
		
		sc.close();
	}

}
