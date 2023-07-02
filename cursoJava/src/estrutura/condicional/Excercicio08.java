package estrutura.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Excercicio08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em
		 * pagar seus impostos, pois sabem que nele não existem políticos corruptos e os
		 * recursos arrecadados são utilizados em benefício da população, sem qualquer
		 * desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
		 * 
		 * Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa
		 * de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de
		 * Imposto de Renda, segundo a tabela abaixo.
		 * 
		 * Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre 
		 * R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é 
		 * isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
		 * de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. 
		 * O valor deve ser impresso com duas casas decimais
		 * 
		 */

		System.out.print("Informe seu salário: ");
		double salario = sc.nextDouble();

		double impostoTotal;
		double irTabela01 = 0.08;
		double irTabela02 = 0.18;
		double irTabela03 = 0.28;
		
		
		if (salario <= 2000.0) {
			impostoTotal = 0.0;
		} else if (salario <= 3000.0) {
			impostoTotal = (salario - 2000.0) * irTabela01;
		} else if (salario <= 4500.0) {
			impostoTotal = (salario - 3000.0) * irTabela02 + 1000.0 * irTabela01;
		} else {
			impostoTotal = (salario - 4500.0) * irTabela03 + 1500.0 * irTabela02 + 1000.0 * irTabela01;
		}

		if (impostoTotal == 0.0) {
			System.out.println("Você é Isento");
		} else {
			System.out.printf("IR R$ %.2f%n", impostoTotal);
		}
	}

}
