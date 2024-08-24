package estrutura_repetitiva;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {

		System.out.println("Olá!\nPara prosseguir digite " + "o número correspondente a direção, sendo:\n"
				+ "1: Esquerda\n" + "2: Centro\n" + "3: Direita");
		Scanner sc = new Scanner(System.in);
		int opcao = sc.nextInt();
		int soma = 0;
		while (opcao != 1 && opcao != 2 && opcao != 3) {
			System.out.println("Olá!\nPara prosseguir digite " + "o número correspondente a direção, sendo:\n"
					+ "1: Esquerda\n" + "2: Centro\n" + "3: Direita");
			soma += opcao;
			opcao = sc.nextInt();
		}
		switch (opcao) {
		case 1:
			System.out.println("Você escolheu vir pelo caminho da esquerda" + soma);
			break;
		case 2:
			System.out.println("Você escolheu vir pelo caminho do centro" + soma);
			break;
		case 3:
			System.out.println("Você escolheu vir pelo caminho da direita" + soma);
			break;

		default:
			break;
		}
		sc.close();

	}
}
