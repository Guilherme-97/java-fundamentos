package estrutura_sequencial;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1 = Sim(para acessar o sistema)\n2 = Não(para sair do sistema)");
		System.out.println("");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("Olá, seja bem vindo!");
			break;
		case 2:
			System.out.println("Até logo!");
			break;

		default:
			System.out.println("Opção incorreta. ");
			break;
		}
		sc.close();

	}
}
