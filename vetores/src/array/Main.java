package array;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Double[] notas = new Double[3];
		String[] nomes = new String[3];
		try (Scanner sc = new Scanner(System.in)) {
			for (int i = 0; i <= 2; i++) {
				System.out.println("Nome " + i + "° aluno:");
				nomes[i] = sc.next();
				System.out.println("Média " + i + "° aluno:");
				notas[i] = sc.nextDouble();

			}
			for (int c = 0; c <= 2; c++) {
				System.out.println(nomes[c] + "\n" + notas[c]);
			}
		}

	}

}
