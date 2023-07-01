package estrutura.condicional;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		/*
		 * Leia a hora inicial e a hora final de um jogo. 
		 * A seguir calcule a duração do jogo, sabendo que o mesmo pode 
		 * começar em um dia e terminar em outro, tendo uma duração 
		 * mínima de 1 hora e máxima de 24 horas.
		 * 
		 * Entrada: 16 2 = O Jogo durou 10 Hora(s)
		 * Entrada: 0 0 = O Jogo durou 24 Hora(s)
		 * Entrada: 2 16 = O Jogo durou 14 Hora(s)
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int horaDoInicio = 0; 
		int horaDoFinal = 0;
		int duracao;
		
		System.out.println("Em que hora começou o jogo? ");
		horaDoInicio = sc.nextInt();
		System.out.println("Em que hora acabou on jogo?");
		horaDoFinal = sc.nextInt();
		
		if ( horaDoInicio < horaDoFinal ) {
			duracao = horaDoFinal - horaDoInicio;
			
		} else {
			duracao = 24 - horaDoInicio + horaDoFinal;
		}
		
		System.out.println("O jogo durou " + duracao + " hora(s)");	
		
		
		sc.close();
	}

}
