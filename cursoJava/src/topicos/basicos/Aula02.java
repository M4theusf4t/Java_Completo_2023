package topicos.basicos;

import java.util.Scanner;

public class Aula02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s = "potato apple lemon";
		
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		sc.close();
	}

}
