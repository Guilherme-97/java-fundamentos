package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class CondicaoTernaria {

	public static void main(String[] args) {
		// Operador ternário == (condicao) ? True : False

		Scanner sc = new Scanner(System.in);

		System.out.println("Valor Produto: ");
		Locale.setDefault(Locale.US);
		Double preco = sc.nextDouble();

		System.out.println("Valor a ser pago com desconto: "
				+ (preco >= 40 ? preco -( 0.12 * preco) : preco -( 0.08 * preco)));

		sc.close();

	}

}
