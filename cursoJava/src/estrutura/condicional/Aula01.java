package estrutura.condicional;

import java.util.Scanner;

public class Aula01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int hora = 5;
		
		System.out.println("Quantas horas?");
		hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia");
		}else if (hora < 18){
			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa noite");
		}
		
	}

}
