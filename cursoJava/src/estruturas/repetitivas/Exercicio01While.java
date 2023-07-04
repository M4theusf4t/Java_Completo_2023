package estruturas.repetitivas;

import java.util.Scanner;

public class Exercicio01While {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*
		 * Escreva um programa que repita a leitura de uma senha até que ela seja válida.
		 * Para cada leitura de senha incorreta informada, escrever a mensagem
		 * "Senha Invalida". Quando a senha for informada corretamente deve ser
		 * impressa a mensagem "Acesso Permitido" e o algoritmo encerrado
		 * Considere que a senha correta é o valor 2002.
		 * 
		 */
		
		int chave = 2002;
		int senha;
		
		System.out.print("Digite a senha de acesso: ");
		senha = sc.nextInt();
		
		while (senha != chave) {
			System.out.println("Senha Invalida!");
			
			System.out.print("Digite a senha de acesso: ");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		
		sc.close();
	}

}
