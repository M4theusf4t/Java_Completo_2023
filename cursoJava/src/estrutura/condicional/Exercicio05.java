package estrutura.condicional;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*
		 * Exercício 05 - Com base na tabela abaixo, escreva um programa
		 * que leia o código de um item e a quantidade deste item.
		 * A seguir, calcule e mostre o valor da conta a pagar.
		 * 
		 */
		
		double preco = 0; 
		int produto, quantidade;
		
		System.out.println("1  | Cachorro Quente | R$ 4.00");
		System.out.println("2  | X-Salada        | R$ 4.50");
		System.out.println("3  | X-Bacon         | R$ 5.00");
		System.out.println("4  | Torrada Simples | R$ 2.00");
		System.out.println("5  | Refrigerante    | R$ 1.50");
		System.out.println("");
		
		System.out.print("Digite o Código do produto: ");
		produto = sc.nextInt();
		
		System.out.print("Escolha agora a quantidade: ");
		quantidade = sc.nextInt();

		switch (produto) {
		case 1:
			preco = 4.00;
			preco *= quantidade;
			break;
		case 2:
			preco = 4.50;
			preco *= quantidade;
			break;
		case 3:
			preco = 5.00;
			preco *= quantidade;
			break;
		case 4:
			preco = 2.00;
			preco *= quantidade;
			break;
		case 5:
			preco = 1.50;
			preco *= quantidade;
			break;
		default:
			System.out.println("Produto Invalido!");
		}
		
		if (preco != 0) {
			System.out.printf("Total do Pedio: R$ %.2f",preco);
		}

		
		sc.close();
	}

}
