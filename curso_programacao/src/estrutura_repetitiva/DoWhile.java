package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {
	// Enquanto determinado condição não for atendida
	// Faça

	public static void main(String[] args) {
		char resposta;
		double fahrenheit = 0.0;
		Scanner sc = new Scanner(System.in);
		do {
			Locale.setDefault(Locale.US);
			System.out.println("Digite a temperatura em Celsius:");
			double celsius = sc.nextDouble();
			fahrenheit = (9 * celsius) / 5 + 32;
			System.out.printf("%.2f Fahrenheint", fahrenheit);
			System.out.println("\nDeseja continuar?\nS:Sim\nN:Não");
			resposta = sc.next().charAt(0);

		} while (resposta != 'n');

		sc.close();

	}
}
