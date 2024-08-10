package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class CondicaoTernaria {

	public static void main(String[] args) {
		// Operador ternário == (condicao) ? True : False

		Scanner sc = new Scanner(System.in);
		Double plano = 50.00;
		Double minutos = 100.00;
		Double custo = 2.00;

		System.out.println("Quantidade de minutos utilizados durante o mês: ");
		Locale.setDefault(Locale.US);
		Double usado = sc.nextDouble();

		double res = (usado - minutos) * (custo) + plano;

		System.out.println("Valor a ser pago: " + (usado > minutos ? plano : res));

		sc.close();

	}

}
